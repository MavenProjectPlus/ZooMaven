/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;
import java.sql.ResultSet;


/**
 *
 * @author mcifuentes
 */
public class especie_DAO extends Conexion {
    

    private ResultSet resultado;

    public especie_DAO() {
        Conectar();
    }
    
    public void Insertar(String Nombre,String Nombre_cientifico,String Descripcion,int Cantidad, int Zona_id,int Id_empleado,String Fecha_cuidado,int Id_habitat) throws Exception
    {
           try{
               int id;
             getStmt();
	     stmt.executeUpdate("INSERT INTO especie (nombre,nombre_cientifico,descripcion,cantidad,zona_id) values ('"+Nombre+"','"+Nombre_cientifico+"','"+Descripcion+"',"+Cantidad+","+Zona_id+")");
       resultado=stmt.executeQuery("SELECT max(id) from especie");
             resultado.next();
             id=resultado.getInt(1);
             stmt.executeUpdate("INSERT INTO especie_cuidador (id_empleado,id_especie,fecha_cuidado) values("+Id_empleado+","+id+",'"+Fecha_cuidado+"')");
             stmt.executeUpdate("INSERT INTO especie_habitat (id_especie,id_habitat) values("+id+","+Id_habitat+")");
           }catch (Exception ex){
           System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
    public void Eliminar(int Id)throws Exception
    {
         try{
             getStmt();
	     stmt.executeUpdate("DELETE FROM especie WHERE id=" + Id);
        } catch (Exception ex){
           System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
    public void Actualizar(int Id,String Nombre,String Nombre_cientifico,String Descripcion,int Cantidad, int Zona_id,int Id_empleado,String Fecha_cuidado,int Id_habitat) throws Exception
    {
           try{
             getStmt();
             stmt.executeUpdate("UPDATE especie set nombre='"+Nombre+ "', nombre_cientifico='"+Nombre_cientifico+"', descripcion='"+Descripcion+"', zona_id="+Zona_id+" WHERE id="+Id);
        }catch (Exception ex){
           System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
    public ResultSet Leer(int Id) throws Exception
    {
        try{

             getStmt();
            resultado= stmt.executeQuery("SELECT * FROM especie WHERE id="+Id+"");
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
	     resultado= stmt.executeQuery("SELECT * FROM especie");
             return resultado;
              } catch (Exception ex){
           System.err.println("SQLException: " + ex.getMessage());
           return null;
           }
    }
}
