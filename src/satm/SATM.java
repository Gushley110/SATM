package satm;

import bd.PropietarioBD;
import bd.Conn;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SATM {

    
    public static void main(String[] args) throws SQLException {
        
        PropietarioBD pbd = new PropietarioBD();
        Connection c;
        try {
            c = Conn.obtener();
            pbd.imprimePropietarios(c);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SATM.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
