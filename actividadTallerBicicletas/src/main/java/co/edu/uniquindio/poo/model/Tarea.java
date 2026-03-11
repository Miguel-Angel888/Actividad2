package co.edu.uniquindio.poo.model;

public class Tarea {

    //Atributos
    private String nombre;
    private double costo;
    private String codigo;

    //Relaciones
    //Solo se relaciona con OrdenServicio pero no puede navegar en esa direccion

    //Constructor
    public Tarea(String nombre, double costo, String codigo) {
        this.nombre = nombre;
        this.costo = costo;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "nombre='" + nombre + '\'' +
                ", costo=" + costo +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}
