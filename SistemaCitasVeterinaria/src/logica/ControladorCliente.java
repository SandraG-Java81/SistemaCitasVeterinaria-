/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.*;

/**
 *
 * @author ISC
 */
public class ControladorCliente {

    Scanner consola = new Scanner(System.in);

    ArrayList<Cliente> lista = new ArrayList<>();

    public void agregarCliente() {

        System.out.println("Ingresa los datos del cliente");

        String nombre;

        do {
            System.out.println("Ingresa el nombre:");
            nombre = consola.nextLine();
            if (!esNombreValido(nombre)) {
                System.out.println(" Nombre inválido. Solo letras y espacios ");
            }
        } while (!esNombreValido(nombre));

        String apellido;
        do {

            System.out.println("Ingresa los apellidos: ");
            apellido = consola.nextLine();
            if (!esApellidoValido(apellido)) {

                System.out.println("Apellido  inválido ");

            }

        } while (!esApellidoValido(apellido));

        String telefono;

        do {
            System.out.println("Ingresa el numero de telefono = ");
            telefono = consola.nextLine();

            if (!esTelefonoValido(telefono)) {
                System.out.println(" Telefono inválido");
            }

        } while (!esTelefonoValido(telefono));

        String direccion;

        do {

            System.out.println("Ingresa la direccion  = ");
            direccion = consola.nextLine();
            if (!esDireccionValido(direccion)) {
                System.out.println(" Direccion inválida");

            }

        } while (!esDireccionValido(direccion));

        Cliente cliente = new Cliente(nombre, apellido, telefono, direccion);

        lista.add(cliente);

    }

    public void mostrarClientes() {

        for (Cliente cliente : lista) {

            System.out.println(cliente);
        }

    }

    public void buscarClientes(String idCliente) {

        boolean encontrado = false;
        for (Cliente c : lista) {
            if (c.getIdCliente().equals(idCliente)) {
                System.out.println("Cliente encontrado: " + c);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Cliente con ID " + idCliente + " no encontrado.");
        }
    }

    public void eliminarCliente(String idCliente) {

        boolean encontrado = false;
        for (int i = 0; i < lista.size(); i++) {

            Cliente c = lista.get(i);

            if (c.getIdCliente().equals(idCliente)) {
                lista.remove(i);

                System.out.println("Cliente elimnado" + c.getNombre());

                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Cliente con ID " + idCliente + " no encontrado.");
        }

    }

    public void actualizarCliente(String idCliente) {
        boolean encontrado = false;

        for (Cliente c : lista) {

            if (c.getIdCliente().equals(idCliente)) {

                System.out.println("""
                       ¿Qué deseas actualizar ?
                       1.- Apellido
                       2.- Telefono
                       3.- Direccion 
                       
                       """);
                int opc = Integer.parseInt(consola.nextLine());

                switch (opc) {

                    case 1 ->
                        actualizarApellido(c, consola);

                    case 2 ->
                        actualizarTelefono(c, consola);

                    case 3 ->
                        actualizarDireccion(c, consola);

                    default ->
                        System.out.println("Opción erronea");

                }

                encontrado = true;
                break;

            }

        }
        if (!encontrado) {
            System.out.println("Cliente con ID " + idCliente + " no encontrado.");
        }

    }

    private void actualizarApellido(Cliente c, Scanner consola) {

        String apellido;

        do {
            System.out.println("Ingresa el Apellido");
            apellido = consola.nextLine();

            if (!esApellidoValido(apellido)) {

                System.out.println(" Apellido inválido ");

            }

        } while (!esApellidoValido(apellido));

        c.setApellido(apellido);

        System.out.println(c.getApellido() + " Apellido actualizado ");

    }

    private void actualizarTelefono(Cliente c, Scanner consola) {
        System.out.println("Ingresa el telefono");
        String telefono = consola.nextLine();

        c.setTelefono(telefono);

        System.out.println(c.getTelefono() + "Telefono actualizado");

    }

    private void actualizarDireccion(Cliente c, Scanner consola) {

        String direccion;
        do {
            System.out.println("Ingresa la dirección");
            direccion = consola.nextLine();

            if (!esDireccionValido(direccion)) {

                System.out.println(" Dirección inválida = ");

            }

        } while (!esDireccionValido(direccion));

        c.setDireccion(direccion);

        System.out.println(c.getDireccion() + "Direccion actualizada");

    }

    private boolean esNombreValido(String nombre) {

        return nombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$");

    }

    private boolean esApellidoValido(String apellido) {

        return apellido.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$");

    }

    private boolean esTelefonoValido(String telefono) {
        return telefono.matches("^55\\d{8}$");

    }

    private boolean esDireccionValido(String direccion) {
        return direccion.matches("^[a-zA-Z0-9áéíóúÁÉÍÓÚñÑ\\s#.,\\-]+$");

    }

}
