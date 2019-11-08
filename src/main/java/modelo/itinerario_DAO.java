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
public class itinerario_DAO extends Conexion {
    
    private ResultSet resultado;

    public itinerario_DAO() {
        Conectar();
    }
    
    public void Insertar(String Nombre,double Duracion, int Longitud, int Visitantes_max, int Cantidad_especies, String Fecha_hora, int Empleado_id ) throws Exception
    {
           try{
             int id;
             getStmt();
	     stmt.executeUpdate("INSERT INTO itinerario (nombre) values ('"+Nombre+"',"+Duracion+","+Longitud+","+Visitantes_max+","+Cantidad_especies+")");
             resultado=stmt.executeQuery("SELECT max(id) from itinerario");
             resultado.next();
             id=resultado.getInt(1);
             stmt.executeUpdate("INSERT INTO guia_itinerario (fecha_hora,itinerario_id,empleado_id) values('"+Fecha_hora+"',"+id+","+Empleado_id+")");
        }catch (Exception ex){
           System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
    public void Eliminar(int Id)throws Exception
    {
         try{
             getStmt();
	     stmt.executeUpdate("DELETE FROM itinerario WHERE id=" + Id);
        } catch (Exception ex){
           System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
    public void Actualizar(int Id, String Nombre,double Duracion, int Longitud, int Visitantes_max, int Cantidad_especies ) throws Exception
    {
           try{
             getStmt();
             stmt.executeUpdate("UPDATE itinerario set nombre='"+Nombre+"',duracion="+Duracion+",longitud="+Longitud+",visitantes_max="+Visitantes_max+",cantidad_especies="+Cantidad_especies+" WHERE id="+Id);
        }catch (Exception ex){
           System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
    public ResultSet Leer(int Id) throws Exception
    {
        try{

             getStmt();
            resultado= stmt.executeQuery("SELECT * FROM itinerario WHERE id="+Id+"");
             return resultado;
              } catch (Exception ex){
           System.err.println("SQLException: " + ex.getMessage());
           return null;
           }
    }
    
}
