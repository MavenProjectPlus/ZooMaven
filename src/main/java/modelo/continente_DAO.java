/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.ResultSet;

/**
 *
 * @author mcifuentes
 */
public class continente_DAO extends Conexion {
    

    private ResultSet resultado;

    public continente_DAO() {
        Conectar();
    }
    
    public void Insertar(String Nombre) throws Exception
    {
           try{
             getStmt();
	     stmt.executeUpdate("INSERT INTO continente (nombre) values ('"+Nombre+"')");
        }catch (Exception ex){
           System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
    public void Eliminar(int Id)throws Exception
    {
         try{
             getStmt();
	     stmt.executeUpdate("DELETE FROM continente WHERE id=" + Id);
        } catch (Exception ex){
           System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
    public void Actualizar(int Id, String Nombre) throws Exception
    {
           try{
             getStmt();
             stmt.executeUpdate("UPDATE continente set nombre='"+Nombre+ "' WHERE id="+Id);
        }catch (Exception ex){
           System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
    public ResultSet Leer(int Id) throws Exception
    {
        try{

             getStmt();
            resultado= stmt.executeQuery("SELECT * FROM continente WHERE id="+Id+"");
             return resultado;
              } catch (Exception ex){
           System.err.println("SQLException: " + ex.getMessage());
           return null;
           }
    }
     public ResultSet Listado()throws Exception
    {
            try{
             getStmt();
	     resultado= stmt.executeQuery("SELECT * FROM continente");
             return resultado;
              } catch (Exception ex){
           System.err.println("SQLException: " + ex.getMessage());
           return null;
           }
    }
    
}
