package satm;

public class Refaccion {
    
    private String nomRefaccion;
    private String descRefaccion;
    private int precio;
    private boolean disponible;
    private int cantidad;

    public String getNomRefaccion() {
        return nomRefaccion;
    }

    public void setNomRefaccion(String nomRefaccion) {
        this.nomRefaccion = nomRefaccion;
    }

    public String getDescRefaccion() {
        return descRefaccion;
    }

    public void setDescRefaccion(String descRefaccion) {
        this.descRefaccion = descRefaccion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}
