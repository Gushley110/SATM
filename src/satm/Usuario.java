package satm;

public class Usuario {
    
    private Integer id;
    private String nombre;
    private String app;
    private String apm;
    private String nick;
    private String pass;
    
    public Usuario(Integer id, String nombre, String app, String apm, String nick, String pass) {
        this.id = id;
        this.nombre = nombre;
        this.app = app;
        this.apm = apm;
        this.nick = nick;
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", app=" + app + ", apm=" + apm + ", nick=" + nick + ", pass=" + pass + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getApm() {
        return apm;
    }

    public void setApm(String apm) {
        this.apm = apm;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }   
}
