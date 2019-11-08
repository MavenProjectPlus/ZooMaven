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
public class zona_itinerario_DAO extends Conexion {
    
    private ResultSet resultado;

    public zona_itinerario_DAO() {
        Conectar();
    }
    
    public void Insertar(int Id_zona, int Id_Itinerario ) throws Exception
    {
           try{
             getStmt();
	     stmt.executeUpdate("INSERT INTO cargo (id_zona,itinerario_id) values ("+Id_zona+","+Id_Itinerario+")");
        }catch (Exception ex){
           System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
    public void Eliminar(int Id)throws Exception
    {
         try{
             getStmt();
	     stmt.executeUpdate("DELETE FROM cargo WHERE id=" + Id);
        } catch (Exception ex){
           System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
    public void Actualizar(int Id, String Nombre,Double Extension) throws Exception
    {
           try{
             getStmt();
             stmt.executeUpdate("UPDATE cargo set nombre='"+Nombre+ "', extension="+Extension+" WHERE id="+Id);
        }catch (Exception ex){
           System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
    public ResultSet Leer(int Id) throws Exception
    {
        try{

             getStmt();
            resultado= stmt.executeQuery("SELECT * FROM cargo WHERE id="+Id+"");
             return resultado;
              } catch (Exception ex){
           System.err.println("SQLException: " + ex.getMessage());
           return null;
           }
    }
    
}
