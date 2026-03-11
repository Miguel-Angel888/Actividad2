package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente {

    //Atributos
    private String nombre;
    private String identificacion;
    private String telefono;
    private int numeroBicicletas;
    private String direccion;
    private LocalDate fechaNacimiento;

    //Relaciones
    private TallerBicicletas ownedByTallerBicicletas;
    private ArrayList<Bicicleta> listaBicicletas;
    private ArrayList<OrdenServicio> listaOrdenesServicio;

    public Cliente(String nombre, String identificacion) {

        this.nombre = nombre;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.numeroBicicletas = numeroBicicletas;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.ownedByTallerBicicletas = ownedByTallerBicicletas;
        this.listaBicicletas = new ArrayList<>();
        this.listaOrdenesServicio = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getNumeroBicicletas() {
        return numeroBicicletas;
    }
    public void setNumeroBicicletas(int numeroBicicletas) {
        this.numeroBicicletas = numeroBicicletas;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public TallerBicicletas getOwnedByTallerBicicletas() {
        return ownedByTallerBicicletas;
    }
    public void setOwnedByTallerBicicletas(TallerBicicletas ownedByTallerBicicletas) {
        this.ownedByTallerBicicletas = ownedByTallerBicicletas;
    }

    public ArrayList<Bicicleta> getListaBicicletas() {
        return listaBicicletas;
    }
    public void setListaBicicletas(ArrayList<Bicicleta> listaBicicletas) {
        this.listaBicicletas = listaBicicletas;
    }

    public ArrayList<OrdenServicio> getListaOrdenesServicio() {
        return listaOrdenesServicio;
    }
    public void setListaOrdenesServicio(ArrayList<OrdenServicio> listaOrdenesServicio) {
        this.listaOrdenesServicio = listaOrdenesServicio;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", numeroBicicletas=" + numeroBicicletas +
                ", direccion='" + direccion + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", ownedByTallerBicicletas=" + ownedByTallerBicicletas +
                ", listaBicicletas=" + listaBicicletas +
                ", listaOrdenesServicio=" + listaOrdenesServicio +
                '}';
    }



}
