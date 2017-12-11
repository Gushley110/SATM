package satm;

import bd.PropietarioBD;
import bd.Conn;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SATM {

    
    public static void main(String[] args) throws SQLException {
        
        // Initialization
        
        PropietarioBD pbd = new PropietarioBD();
        Connection c;
        
        //Start Test savePropietario
           Propietario p1 = new Propietario(2,"Eric","Peralta","Ramirez","123456");
           try{
               c = Conn.obtener();
               pbd.savePropietario(c, p1);

           } catch (ClassNotFoundException ex) {
            Logger.getLogger(SATM.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        //end
        
        // Start Test getPropietarios 
        
        try {
            c = Conn.obtener();
            
            for(Propietario p : pbd.getPropietarios(c)){
                System.out.println(p.toString());
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SATM.class.getName()).log(Level.SEVERE, null, ex);
        }
        // End 
            
        //Start Test getPropietarioById
        
        try{
            c = Conn.obtener();
            Propietario p = pbd.getPropietarioById(c, 1);
            System.out.println(p.toString());
        }catch(ClassNotFoundException ex){
            Logger.getLogger(SATM.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        //End
        
        
    }
    
}
