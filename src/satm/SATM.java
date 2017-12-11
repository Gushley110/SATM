package satm;

import bd.PropietarioBD;
import bd.Conn;
import bd.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SATM {

    
    public static void main(String[] args) throws SQLException {
        
        Connection c;
        
        try {
            c = Conn.obtener();
            
            Login l = new Login();
            System.out.println(l.logIn(c, "", ""));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SATM.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /*Connection c;
        UsuarioBD usuario;
        
        usuario = new UsuarioBD();
        
        try {
            c = Conn.obtener();
            
            Usuario u = usuario.getUsuarioByNick(c, "BuenMecanico");
            System.out.println(u.toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SATM.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        
        
        
        
        //Initialization
        
        PropietarioBD pbd = new PropietarioBD();
        //Connection c;
        
        //Start Test savePropietario
           Propietario p1 = new Propietario("FABS","Eric","Peralta","Ramirez","123456");
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
        
        
        //End*/
        
        
    }
    
    public boolean logIn(String nickName, String pass,Usuario u){
        
        String nick = u.getNick();
        String pwd = u.getPass();
        
        return nickName.equals(nick) && pass.equals(pwd);
    }
    
}
