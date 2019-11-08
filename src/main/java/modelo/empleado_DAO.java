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
public class empleado_DAO extends Conexion {
    
    private ResultSet resultado;

    public empleado_DAO() {
        Conectar();
    }
    
    public void Insertar(String Nombre, String Direccion, String Telefono,String Fecha_ingreso, int Id_cargo) throws Exception
    {
           try{
             getStmt();
	     stmt.executeUpdate("INSERT INTO empleado (nombre,direccion,telefono,fecha_ingreso,id_cargo) values ('"+Nombre+"','"+Direccion+"','"+Telefono+"','"+Fecha_ingreso+"',"+Id_cargo+")");
        }catch (Exception ex){
           System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
    public void Eliminar(int Id)throws Exception
    {
         try{
             getStmt();
	     stmt.executeUpdate("DELETE FROM empleado WHERE id=" + Id);
        } catch (Exception ex){
           System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
    public void Actualizar(int Id, String Nombre, String Direccion, String Telefono,String Fecha_ingreso, int Id_cargo) throws Exception
    {
           try{
             getStmt();
             stmt.executeUpdate("UPDATE empleado set nombre='"+Nombre+ "', direccion='"+Direccion+"', telefono='"+Telefono+"',fecha_ingreso='"+Fecha_ingreso+"', id_cargo="+Id_cargo+" WHERE id="+Id);
        }catch (Exception ex){
           System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
    public ResultSet Leer(int Id) throws Exception
    {
        try{

             getStmt();
            resultado= stmt.executeQuery("SELECT * FROM empleado WHERE id="+Id+"");
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
	     resultado= stmt.executeQuery("SELECT * FROM empleado");
             return resultado;
              } catch (Exception ex){
           System.err.println("SQLException: " + ex.getMessage());
           return null;
           }
    }
    
    
    
}
