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
    
    public void imprimePropietarios(Connection c) throws SQLException{
        
        try{
         PreparedStatement consulta = c.prepareStatement("SELECT * FROM " + this.tabla );
         ResultSet r = consulta.executeQuery();
         while(r.next()){
             System.out.println(r.getInt(1)+r.getInt(2));
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
    }
}
