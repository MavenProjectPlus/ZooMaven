package modelo;



import modelo.Conexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAC extends Conexion{
    private int codigo;
    private String nombre;
    private ResultSet resultado;

    public DAC()
    {
        Conectar();
    }

    public ResultSet Listado()throws Exception
    {
            try{
             getStmt();
	     resultado= stmt.executeQuery("SELECT * FROM Producto");
             return resultado;
              } catch (Exception ex){
           System.err.println("SQLException: " + ex.getMessage());
           return null;
           }
    }
     public void Insertar(int codigo, String Nombre) throws Exception
    {
           try{
             getStmt();
	     stmt.executeUpdate("INSERT INTO Producto values (" + codigo + ", '" +Nombre+ "')");
        }catch (Exception ex){
           System.err.println("SQLException: " + ex.getMessage());
        }
    }
   public void Actualizar(int codigo, String Nombre) throws Exception
    {
           try{
             getStmt();
             stmt.executeUpdate("UPDATE Producto set nom_Producto='"+Nombre+ "' WHERE cod_Producto="+codigo);
        }catch (Exception ex){
           System.err.println("SQLException: " + ex.getMessage());
        }
    }
    public void Eliminar(int codigo)throws Exception
    {
         try{
             getStmt();
	     stmt.executeUpdate("DELETE FROM Producto WHERE cod_Producto=" + codigo);
        } catch (Exception ex){
           System.err.println("SQLException: " + ex.getMessage());
        }
    }
    public ResultSet BuscarExistente(int Codigo)
    {   try{
             getStmt();
	     resultado= stmt.executeQuery("SELECT * FROM Producto WHERE cod_Producto LIKE'" + Codigo+"%'");
               return resultado;
             } catch (Exception ex){
           System.err.println("SQLException: " + ex.getMessage());
           return null;
        }
    }

    public ResultSet BuscarPorNombre(String Nombre) throws Exception
    {
        try{

             getStmt();
            resultado= stmt.executeQuery("SELECT * FROM Producto WHERE (nom_Producto LIKE '" + Nombre + "%')");
             return resultado;
              } catch (Exception ex){
           System.err.println("SQLException: " + ex.getMessage());
           return null;
           }
    }
}
