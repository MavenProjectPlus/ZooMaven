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
public class habitat_DAO extends Conexion {
    

    private ResultSet resultado;

    public habitat_DAO() {
        Conectar();
    }
    
    public void Insertar(String Nombre,String Clima, int Id_vegetacion, int Id_continente) throws Exception
    {
        
           try{
               int id;
             getStmt();
	     stmt.executeUpdate("INSERT INTO habitat (nombre,clima,id_vegetacion) values ('"+Nombre+"','"+Clima+"',"+Id_vegetacion+")");
             resultado=stmt.executeQuery("SELECT max(id) from habitat");
             resultado.next();
             id=resultado.getInt(1);
             stmt.executeUpdate("INSERT INTO continente_habitat (id_habitat,id_continente) values("+id+","+Id_continente+")");
        }catch (Exception ex){
           System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
    public void Eliminar(int id)throws Exception
    {
         try{
             getStmt();
	     stmt.executeUpdate("DELETE FROM habitat WHERE id=" + id);
        } catch (Exception ex){
           System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
    public void Actualizar(int id, String Nombre, String Clima, int Id_vegetacion) throws Exception
    {
           try{
             getStmt();
             stmt.executeUpdate("UPDATE habitat set nombre='"+Nombre+ "', clima='"+Clima+" ,id_vegetacion="+Id_vegetacion+" WHERE id="+id);
        }catch (Exception ex){
           System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
    public ResultSet Leer(int id) throws Exception
    {
        try{

             getStmt();
            resultado= stmt.executeQuery("SELECT * FROM habitat WHERE id="+id+"");
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
	     resultado= stmt.executeQuery("SELECT * FROM habitat");
             return resultado;
              } catch (Exception ex){
           System.err.println("SQLException: " + ex.getMessage());
           return null;
           }
    }
    
}
