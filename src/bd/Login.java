package bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import satm.Usuario;

public class Login {
    
    public boolean logIn(Connection c,String nickName, String pass){
        
        String pwd = "";
        
        if(nickName.isEmpty()){
            return false;
        }
        
        try {
            PreparedStatement query = c.prepareStatement("SELECT PassUsuario from usuario WHERE NickUsuario = ?");
            query.setString(1, nickName);
            
            ResultSet r = query.executeQuery();
            while(r.next()){
                pwd = r.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return pass.equals(pwd);
    }
    
}
