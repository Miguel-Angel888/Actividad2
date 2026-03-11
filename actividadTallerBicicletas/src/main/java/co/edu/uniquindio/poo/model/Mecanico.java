package co.edu.uniquindio.poo.model;

import javax.swing.*;
import java.util.ArrayList;

public class Mecanico {

    //Atributos
    private String nombre;
    private String telefono;
    private double costoManoObra;


    //Relaciones
    private TallerBicicletas ownedByTallerBicicletas;
    private ArrayList<OrdenServicio> listaOrdenesServicio;

    //Consructor

    public Mecanico(String nombre) {
        this.nombre = nombre;
    }

    public Mecanico(String nombre, String telefono, double costoManoObra) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.costoManoObra = costoManoObra;
        this.ownedByTallerBicicletas = ownedByTallerBicicletas;
        this.listaOrdenesServicio = new ArrayList<>();

    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getCostoManoObra() {
        return costoManoObra;
    }
    public void setCostoManoObra(double costoManoObra) {
        this.costoManoObra = costoManoObra;
    }

    public TallerBicicletas getOwnedByTallerBicicletas() {
        return ownedByTallerBicicletas;
    }
    public void setOwnedByTallerBicicletas(TallerBicicletas ownedByTallerBicicletas) {
        this.ownedByTallerBicicletas = ownedByTallerBicicletas;
    }

    public ArrayList<OrdenServicio> getListaOrdenesServicio() {
        return listaOrdenesServicio;
    }
    public void setListaOrdenesServicio(ArrayList<OrdenServicio> listaOrdenesServicio) {
        this.listaOrdenesServicio = listaOrdenesServicio;
    }

    @Override
    public String toString() {
        return "Mecanico{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", salario='" + costoManoObra + '\'' +
                ", ownedByTallerBicicletas=" + ownedByTallerBicicletas +
                ", listaOrdenesServicio=" + listaOrdenesServicio +
                '}';
    }

}
