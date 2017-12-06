package satm;

public class Propietario {
    
    private int id;
    private String nombre;
    private String app;
    private String apm;
    private String telefono;
    
    public Propietario(int id,String nombre, String telefono){
        
        this.setId(id);
        this.setNombre(nombre);
        this.setTelefono(telefono);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public String toString(){
        return "Mi nombre es "+this.getNombre()+" y mi numero es "+this.getTelefono();
    }
    
    
    
}
