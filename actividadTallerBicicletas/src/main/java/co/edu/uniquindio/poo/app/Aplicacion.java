package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.TallerBicicletas;

import javax.swing.*;

public class Aplicacion {
    public static void main(String[] args) {
        TallerBicicletas tallerBicicletas = new TallerBicicletas("El mejor", "El bosque");
        boolean bandera = false;
        while (!bandera) {
            int numeroEscogido = (Integer.valueOf(JOptionPane.showInputDialog(null, "Bienvenido al taller mecanico, para acceder a " +
                    "las distintas funcionalidades ingrese el numero correspondiente:" +
                    "\n(1).Cliente" +
                    "\n(2).Bicicleta" +
                    "\n(3).Orden de Servicio" +
                    "\n(4).Mecanico" +
                    "\n(5).Salir")));

            switch (numeroEscogido) {
                case 1:
                    boolean flag = false;
                    while (!flag) {
                        int numero = Integer.valueOf(JOptionPane.showInputDialog(null, "Ingrese el numero correspondiente para acceder a las funcionalidades de Cliente" +
                                "\n(1).Registrar cliente" +
                                "\n(2).Vincular al cliente con la bicicleta" +
                                "\n(3).Regresar"));

                        switch (numero) {
                            case 1:
                                String nombre = JOptionPane.showInputDialog(null, "ingrese el nombre del cliente");
                                String identificacion = JOptionPane.showInputDialog(null, "Ingrese el numero de identificaion");
                                String mensaje = tallerBicicletas.registrarCliente(nombre, identificacion);
                                JOptionPane.showMessageDialog(null, mensaje);
                                break;
                            case 2:
                                nombre = JOptionPane.showInputDialog(null, "ingrese el nombre del cliente");
                                identificacion = JOptionPane.showInputDialog(null, "Ingrese el numero de identificaion");
                                String serialBici = JOptionPane.showInputDialog(null, "Ingrese el serial de la bicicleta");
                                mensaje = tallerBicicletas.vincularClienteBicicleta(nombre, identificacion, serialBici);
                                JOptionPane.showMessageDialog(null, mensaje);
                                break;
                            case 3:
                                flag = true;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Introduzca un numero valido");
                                break;
                        }
                    }
                    break;
                case 2:
                    flag = false;
                    while (!flag) {
                        int numero = Integer.valueOf(JOptionPane.showInputDialog(null, "Introduzca el valor de la funcionalidad que desea utilizar para bicicleta" +
                                "\n(1).Registrar bicicleta" +
                                "\n(2)Vincular la bicicleta con el cliente" +
                                "\n(3).Regresar"));
                        switch (numero) {
                            case 1:
                                String serial = JOptionPane.showInputDialog(null, "Ingrese el serial de la bicicleta");
                                String mensaje = tallerBicicletas.registrarBicicleta(serial);
                                JOptionPane.showMessageDialog(null, mensaje);
                                break;
                            case 2:
                                String nombre = JOptionPane.showInputDialog(null, "ingrese el nombre del cliente");
                                String identificacion = JOptionPane.showInputDialog(null, "Ingrese el numero de identificaion");
                                String serialBici = JOptionPane.showInputDialog(null, "Ingrese el serial de la bicicleta");
                                mensaje = tallerBicicletas.vincularClienteBicicleta(nombre, identificacion, serialBici);
                                JOptionPane.showMessageDialog(null, mensaje);
                                break;
                            case 3:
                                flag = true;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Introduzca un numero valido");
                                break;
                        }
                    }
            }
        }
    }
}
