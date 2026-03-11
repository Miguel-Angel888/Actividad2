package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class Bicicleta {

    //Atributos
    private String marca;
    private String color;
    private String serial;

    //Relaciones
    private TallerBicicletas ownedByTallerBicicletas;
    private Cliente cliente;
    private ArrayList<OrdenServicio> listaOrdenesServicio;

    //Constructor

    public Bicicleta(String serial) {
        this.serial = serial;
    }

    public Bicicleta(String marca, String color, String serial) {
        this.marca = marca;
        this.color = color;
        this.serial = serial;
        this.ownedByTallerBicicletas = ownedByTallerBicicletas;
        this.cliente = null;
        this.listaOrdenesServicio = new ArrayList<>();
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getSerial() {
        return serial;
    }
    public void setSerial(String serial) {
        this.serial = serial;
    }

    public TallerBicicletas getOwnedByTallerBicicletas() {
        return ownedByTallerBicicletas;
    }
    public void setOwnedByTallerBicicletas(TallerBicicletas ownedByTallerBicicletas) {
        this.ownedByTallerBicicletas = ownedByTallerBicicletas;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<OrdenServicio> getListaOrdenesServicio() {
        return listaOrdenesServicio;
    }
    public void setListaOrdenesServicio(ArrayList<OrdenServicio> listaOrdenesServicio) {
        this.listaOrdenesServicio = listaOrdenesServicio;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", serial='" + serial + '\'' +
                ", ownedByTallerBicicletas=" + ownedByTallerBicicletas +
                ", cliente=" + cliente +
                ", listaOrdenesServicio=" + listaOrdenesServicio +
                '}';
    }
}
