package satm;

public class Propietario {
    
    private int id;
    private String nombre;
    private int telefono;
    
    public Propietario(String nombre, int telefono){
        
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public String toString(){
        return "Mi nombre es "+this.getNombre()+" y mi numero es "+this.getTelefono();
    }
    
    
    
}
