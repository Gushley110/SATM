package bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import satm.Propietario;

public class PropietarioBD {
    
    private final String tabla = "propietario";
    
    public Propietario getPropietarioById(Connection c, int id) throws SQLException{
        
        Propietario p = null;
        
        try{
            
         PreparedStatement consulta = c.prepareStatement("SELECT * FROM " + this.tabla );
         consulta.setInt(1, id);
         ResultSet r = consulta.executeQuery();
         
         while(r.next()){
             p = new Propietario(id,r.getString(2)+" "+r.getString(3)+" "+r.getString(4),r.getString(5));
         }
         }catch(SQLException ex){
         throw new SQLException(ex);
      }
        
        return p;
    }
    
    public List<Propietario> getPropietarios(Connection c) throws SQLException{
        
        List<Propietario> ps = new ArrayList<>();
        
        try{
            
         PreparedStatement consulta = c.prepareStatement("SELECT * FROM " + this.tabla );
         ResultSet r = consulta.executeQuery();
         
         while(r.next()){
             ps.add(new Propietario(r.getInt(1),r.getString(2)+" "+r.getString(3)+" "+r.getString(4),r.getString(5)));
         }
         
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
        
        return ps;
        
    }
}
