package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class TallerBicicletas {

    //Atributos
    private String nombre;
    private String direccion;

    //Relaciones
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Bicicleta> listaBicicletas;
    private ArrayList<OrdenServicio> listaOrdenesServicio;
    private ArrayList<Mecanico> listaMecanicos;
    private ArrayList<Repuesto> listaRepuestos;


    //Constructor


    public TallerBicicletas(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaClientes = new ArrayList<>();
        this.listaBicicletas = new ArrayList<>();
        this.listaOrdenesServicio = new ArrayList<>();
        this.listaMecanicos = new ArrayList<>();
        this.listaRepuestos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
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

    public ArrayList<Mecanico> getListaMecanicos() {
        return listaMecanicos;
    }
    public void setListaMecanicos(ArrayList<Mecanico> listaMecanicos) {
        this.listaMecanicos = listaMecanicos;
    }

    public ArrayList<Repuesto> getListaRepuestos() {
        return listaRepuestos;
    }
    public void setListaRepuestos(ArrayList<Repuesto> listaRepuestos) {
        this.listaRepuestos = listaRepuestos;
    }

    @Override
    public String toString() {
        return "TallerBicicletas{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", listaClientes=" + listaClientes +
                ", listaBicicletas=" + listaBicicletas +
                ", listaOrdenesServicio=" + listaOrdenesServicio +
                ", listaMecanicos=" + listaMecanicos +
                ", listaRepuestos=" + listaRepuestos +
                '}';
    }
    //CRUD Cliente

    //Buscar Cliente
    public Cliente buscarCliente(String nombre, String identificacion){
        Cliente cliente = null;
        for(Cliente clienteAux: listaClientes){
            if(clienteAux.getNombre().equalsIgnoreCase(nombre) && clienteAux.getIdentificacion().equalsIgnoreCase(identificacion)){
                cliente = clienteAux;
                return cliente;
            }
        }
        return cliente;
    }

    //Registrar Cliente
    public String registrarCliente(String nombre,String identificacion){

        //Verificar que no este registrado
        Cliente clienteEncontrado = buscarCliente(nombre,identificacion);
        if(clienteEncontrado != null){
            return "El cliente ya se encuentra registrado";

        }
        //Creal el cliente
        Cliente nuevoCliente = new Cliente(nombre,identificacion);

        //Agregarlo a la lista
        listaClientes.add(nuevoCliente);
        //Notificar
        return  "El cliente ha sido registrado exitosamente";


    }

    //Vincular al cliente con la bicicleta
    public String vincularClienteBicicleta(String nombre,String identificaion,String serial){
        Cliente cliente = buscarCliente(nombre,identificaion);
        Bicicleta bicicleta = buscarBicicleta(serial);

        //Verificar que cliente y/o bicicleta no existan
        if((cliente == null) && (bicicleta == null)){
            return "Ni el cliente ni la bicicleta se encuentran registrados en el sistema";
        }
        if(bicicleta == null ){
            return "La bicicleta no se encuentra registrada en el sistema";
        }
        if ((cliente == null )) {
            return "El cliente no se encuentra registrado en ele sistema";
        }
        //Verificar si la bicicleta y el cliente ya estan conectadas
        if(cliente.getListaBicicletas().contains(bicicleta)){
            return "El cliente y la bicicleta ya estan conectadas";
        }
        //vincular el cliente y la bicicleta
        cliente.getListaBicicletas().add(bicicleta);
        return "EL cliente y la bicicleta fueron vinculados correctamente";
    }

    //CRUD Bicicleta

    //Buscar Bicicleta
    public Bicicleta buscarBicicleta(String serial){
        Bicicleta bicicleta = null;

        for(Bicicleta bicicletaAux: listaBicicletas){
            if(bicicletaAux.getSerial().equalsIgnoreCase(serial)){
                bicicleta = bicicletaAux;
                return bicicleta;
            }
        }
        return bicicleta;
    }

    //Registrar bicicleta
    public String registrarBicicleta(String serial){
        //Verificar que no este registrada
        for(Bicicleta bicicleta: listaBicicletas){
            if(bicicleta.getSerial().equalsIgnoreCase(serial)){
                return "La bicicleta ya se encuentra registrada";
            }
        }
        //registrar la bicicleta
        Bicicleta bicicleta = new Bicicleta(serial);

        listaBicicletas.add(bicicleta);
        return "La bicicleta fue registrada exitosamente";
    }

    //CRUD ORDEN SERVICIO

    //Crear orden de servicio para una bicicleta especifica
    public String crearOrdenServicioBicicleta(String serial,LocalDate fechaIngreso,String codigo){
        //Comprobar que la bicicelta exista
        Bicicleta bicicleta = buscarBicicleta(serial);
        if(bicicleta == null){
            return "La bicicleta no existe. Es necesario" +
                    " que registre la bicicleta para asignarle una orden de servicio";
        }
        //Se registra la orden de servicio
        registrarOrdenServicio(fechaIngreso,codigo);
        //Busca la orden creada
        OrdenServicio orden = buscarOrdenServicio(fechaIngreso, codigo);
        //Asignar la orden de servicio a la bicicleta
       bicicleta.getListaOrdenesServicio().add(orden);

       //Notificar
        return "Se le ha asignado una orden de servicio a la bicicleta exitosamente";

    }

    //Registrar orden de servicio
    public String registrarOrdenServicio(LocalDate fechaIngreso,String codigo){
        OrdenServicio orden = buscarOrdenServicio(fechaIngreso,codigo);
        //COmprobar que no exista
        if(orden != null){
            return "La orden ya esta registrada";
        }
        if(orden==null){
            orden = new OrdenServicio(codigo, fechaIngreso);
        }
        //Registrar orden
        listaOrdenesServicio.add(orden);
        return "La orden se ha creado correctamente";
    }

    //Buscar Orden Servicio
    public OrdenServicio buscarOrdenServicio(LocalDate fechaIngreso,String codigo){
        OrdenServicio orden = null;

        for(OrdenServicio ordenAux: listaOrdenesServicio){
            if(ordenAux.getFechaIngreso().equals(fechaIngreso) && ordenAux.getCodigo().equalsIgnoreCase(codigo)){
                orden = ordenAux;
                return orden;
            }
        }
        return orden;
    }

    //Asignar a x orden un mecanico
    public String asignarMecanicoOrden(String codigo,LocalDate fechaIngreso,String nombre){
        OrdenServicio orden = buscarOrdenServicio(fechaIngreso, codigo);
        //Se comprueba que exista la orden
        if(orden == null){
            return "No pudo registrarse porque no existe dicha orden";
        }
        //Se crea el mecanico
        Mecanico mecanico = new Mecanico(nombre);
        //Se le asigna el mecanico a la orden
        orden.getListaMecanicos().add(mecanico);
        return "Se ha registrado satisfactoriamente";
    }
    //CRUD Mecanico
    //Registrar mecanico
    public String registrarMecanico(String nombre){

        //Verificar que no este registrado
        for(Mecanico mecanicoAux:listaMecanicos){
            if(mecanicoAux.getNombre().equalsIgnoreCase(nombre)){
                return "El mecanico ya esta registrado";
            }
        }
        //Se crea el mecanico
        Mecanico mecanico = new Mecanico(nombre);
        listaMecanicos.add(mecanico);
        return "El mecanico se ha creado correctamente";
    }
    //Buscar mecanico
    public Mecanico buscarMecanico(String nombre){
        Mecanico mecanico = null;
        for(Mecanico mecanicoAux: listaMecanicos){
            if(mecanicoAux.getNombre().equalsIgnoreCase(nombre)){
                mecanico = mecanicoAux;
                return mecanico;
            }
        }
        return mecanico;
    }
}

