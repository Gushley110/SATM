package satm;

public class Propietario {
    
    private Integer id;
    private String curp;
    private String nombre;
    private String app;
    private String apm;
    private String telefono;
    
    public Propietario(){
        this.id = null;
        this.nombre = null;
        this.app = null;
        this.apm = null;
        this.telefono = null;
    }
    
    public Propietario(String curp,String nombre, String app, String apm, String tel){
        this.id = null;
        this.curp = curp;
        this.nombre = nombre;
        this.app = app;
        this.apm = apm;
        this.telefono = tel;
    }   

    public Propietario(Integer id,String curp,String nombre,String app, String apm, String telefono){
        
        this.setId(id);
        this.setCurp(curp);
        this.setNombre(nombre);
        this.setApp(app);
        this.setApm(apm);
        this.setTelefono(telefono);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
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
