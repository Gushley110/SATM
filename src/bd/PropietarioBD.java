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
    
    public void savePropietario(Connection c, Propietario p) throws SQLException{
      try{
         PreparedStatement query;
         if(p.getId() == null){
            query = c.prepareStatement("INSERT INTO " + this.tabla + "(nomPropietario, appPropietario, apmPropietario, telPropietario) VALUES(?, ?, ?, ?)");
            query.setString(1, p.getNombre());
            query.setString(2, p.getApp());
            query.setString(3, p.getApm());
            query.setString(4, p.getTelefono());
         }else{
            query = c.prepareStatement("UPDATE " + this.tabla + " SET nomPropietario = ?, appPropietario = ?, apmPropietario = ?, telPropietario = ? WHERE idPropietario = ?");
            query.setString(1, p.getNombre());
            query.setString(2, p.getApp());
            query.setString(3, p.getApm());
            query.setString(4, p.getTelefono());
            query.setInt(5, p.getId());
         }
         query.executeUpdate();
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
   }
    
    public Propietario getPropietarioById(Connection c, int id) throws SQLException{
        
        Propietario p = null;
        
        try{
            
         PreparedStatement query = c.prepareStatement("SELECT nomPropietario, appPropietario, apmPropietario, telPropietario FROM " + this.tabla + " WHERE idPropietario = ?");
         query.setInt(1, id);
         ResultSet r = query.executeQuery();
         while(r.next()){
             p = new Propietario(id,r.getString(1),r.getString(2),r.getString(3),r.getString(4));
         }
         }catch(SQLException ex){
         throw new SQLException(ex);
      }
        
        return p;
    }
    
    public List<Propietario> getPropietarios(Connection c) throws SQLException{
        
        List<Propietario> ps = new ArrayList<>();
        
        try{
            
         PreparedStatement query = c.prepareStatement("SELECT * FROM " + this.tabla );
         ResultSet r = query.executeQuery();
         
         while(r.next()){
             ps.add(new Propietario(r.getInt(1),r.getString(2),r.getString(3),r.getString(4),r.getString(5)));
         }
         
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
        
        return ps;
        
    }
}
