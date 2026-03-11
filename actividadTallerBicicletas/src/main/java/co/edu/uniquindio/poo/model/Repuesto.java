package co.edu.uniquindio.poo.model;

public class Repuesto {

    //Atributos
    private String nombre;
    private int cantidad;
    private double costoUnitario;

    //Relaciones
    //Solo se relaciona con orden de servicio y no puedeir en esa direccion

    //Constructor

    public Repuesto(String nombre, double costoUnitario, int cantidad) {
        this.nombre = nombre;
        this.costoUnitario = costoUnitario;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getCostoUnitario() {
        return costoUnitario;
    }
    public void setCostoUnitario(double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    @Override
    public String toString() {
        return "Repuesto{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", costoUnitario=" + costoUnitario +
                '}';
    }
}
