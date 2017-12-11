package bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import satm.Usuario;

public class UsuarioBD {
    
   private final String tabla = "usuario";
   
   public Usuario getUsuarioByNick(Connection c, String nick) throws SQLException{
        
        Usuario p = null;
        
        try{
            
         PreparedStatement query = c.prepareStatement("SELECT * FROM " + this.tabla + " WHERE NickUsuario = ?");
         query.setString(1, nick);
         ResultSet r = query.executeQuery();
         while(r.next()){
             p = new Usuario(r.getInt(1),r.getString(2),r.getString(3),r.getString(4),r.getString(5),r.getString(6));
         }
         }catch(SQLException ex){
         throw new SQLException(ex);
      }
        
        return p;
    }
    
}
