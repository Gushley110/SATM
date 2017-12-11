package bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import satm.Propietario;

public class PropietarioBD {
    
    private final String tabla = "cliente";
    
    public void savePropietario(Connection c, Propietario p) throws SQLException{
      try{
         PreparedStatement query;
         if(p.getId() == null){
            query = c.prepareStatement("INSERT INTO " + this.tabla + "(curpCliente, NomCliente, ApaCliente, AmaCliente,telCliente) VALUES(?, ?, ?, ?, ?)");
            query.setString(1, p.getCurp());
            query.setString(2, p.getNombre());
            query.setString(3, p.getApp());
            query.setString(4, p.getApm());
            query.setString(5, p.getTelefono());
         }else{
            query = c.prepareStatement("UPDATE " + this.tabla + " SET curpCliente = ?,NomCliente = ?, ApaCliente = ?, AmaCliente = ?, telCliente = ? WHERE idCliente = ?");
            query.setString(1, p.getCurp());
            query.setString(2, p.getNombre());
            query.setString(3, p.getApp());
            query.setString(4, p.getApm());
            query.setString(5, p.getTelefono());
            query.setInt(6, p.getId());
         }
         query.executeUpdate();
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
   }
    
    public Propietario getPropietarioById(Connection c, int id) throws SQLException{
        
        Propietario p = null;
        
        try{
            
         PreparedStatement query = c.prepareStatement("SELECT curpCliente, NomCliente, ApaCliente, AmaCliente, telCliente FROM " + this.tabla + " WHERE idCliente = ?");
         query.setInt(1, id);
         ResultSet r = query.executeQuery();
         while(r.next()){
             p = new Propietario(id,r.getString(1),r.getString(2),r.getString(3),r.getString(4),r.getString(5));
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
             ps.add(new Propietario(r.getInt(1),r.getString(2),r.getString(3),r.getString(4),r.getString(5),r.getString(6)));
         }
         
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
        
        return ps;
        
    }
}
