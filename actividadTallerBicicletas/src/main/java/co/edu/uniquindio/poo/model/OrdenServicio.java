package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class OrdenServicio {

    //Atributos
    private String codigo;
    private String descripcion;
    private LocalDate fechaIngreso;
    private LocalDate fechaSalida;
    private EstadoServicio estadoServicio;

    //Relaciones
    private TallerBicicletas ownedByTallerBicicletas;
    private Bicicleta bicicleta;
    private ArrayList<Mecanico> listaMecanicos;
    private Tarea tarea;
    private Cliente cliente;
    private ArrayList<Repuesto> listaRepuestos;

    public OrdenServicio(String codigo, LocalDate fechaIngreso) {
        this.codigo = codigo;
        this.fechaIngreso = fechaIngreso;
    }

    public OrdenServicio(String codigo, String descripcion,
                         LocalDate fechaIngreso, LocalDate fechaSalida,
                         EstadoServicio estadoServicio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.estadoServicio = estadoServicio;
        this.ownedByTallerBicicletas = ownedByTallerBicicletas;
        this.bicicleta = null;
        this.listaMecanicos = new ArrayList<>();
        this.tarea = null;
        this.cliente = null;
        this.listaRepuestos = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }
    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }
    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public EstadoServicio getEstadoServicio() {
        return estadoServicio;
    }
    public void setEstadoServicio(EstadoServicio estadoServicio) {
        this.estadoServicio = estadoServicio;
    }

    public TallerBicicletas getOwnedByTallerBicicletas() {
        return ownedByTallerBicicletas;
    }
    public void setOwnedByTallerBicicletas(TallerBicicletas ownedByTallerBicicletas) {
        this.ownedByTallerBicicletas = ownedByTallerBicicletas;
    }

    public Bicicleta getBicicleta() {
        return bicicleta;
    }
    public void setBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    public ArrayList<Mecanico> getListaMecanicos() {
        return listaMecanicos;
    }
    public void setListaMecanicos(ArrayList<Mecanico> listaMecanicos) {
        this.listaMecanicos = listaMecanicos;
    }

    public Tarea getTarea() {
        return tarea;
    }
    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Repuesto> getListaRepuestos() {
        return listaRepuestos;
    }
    public void setListaRepuestos(ArrayList<Repuesto> listaRepuestos) {
        this.listaRepuestos = listaRepuestos;
    }

    @Override
    public String toString() {
        return "OrdenServicio{" +
                "codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                ", fechaSalida=" + fechaSalida +
                ", estadoServicio=" + estadoServicio +
                ", ownedByTallerBicicletas=" + ownedByTallerBicicletas +
                ", bicicleta=" + bicicleta +
                ", listaMecanicos=" + listaMecanicos +
                ", tarea=" + tarea +
                ", cliente=" + cliente +
                ", listaRepuestos=" + listaRepuestos +
                '}';
    }
}
 enum EstadoServicio{
    RECIBIDA,
    ENPROCESO,
    FINALIZADA,
    ENTREGADA
}
