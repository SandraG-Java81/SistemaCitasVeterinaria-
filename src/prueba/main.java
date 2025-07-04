package prueba;
import logica.*;
import modelo.*;
import java.time.LocalDateTime;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ControladorCliente controladorCli = new ControladorCliente();
        Cliente cliente = new Cliente("Luz", "García", "555-1234", "Calle Falsa 123");
        Cliente cliente1 = new Cliente("Felipe", "García", "555-1234", "Calle Falsa 123");
        
      controladorCli.agregarCliente();
      // controladorCli.agregarCliente(cliente1);
      controladorCli.mostrarClientes();
      Scanner sc = new Scanner(System.in);
System.out.print("Ingresa el ID del cliente a buscar: ");
String idCliente = sc.nextLine();
       
       //controladorCli.buscarClientes(idCliente);
       
    //   controladorCli.eliminarCliente(idCliente);
       
  //     controladorCli.mostrarClientes();
        // 1. Crear un cliente
    //    Cliente cliente = new Cliente("Sandra", "García", "555-1234", "Calle Falsa 123");
//        System.out.println(cliente);
 //       System.out.println(cliente1);
     
controladorCli.actualizarCliente(idCliente);
 controladorCli.mostrarClientes();
        
        // 2. Crear una mascota
        Mascota mascota = new Mascota(101, "Firulais", "Labrador", 3, TipoMascota.PERRO);

        // 3. Crear un veterinario
        Veterinario veterinario = new Veterinario(10, "Luis", "Ramírez", "555-5678", "Cirugía", "lramirez@veterinaria.com");

        // 4. Fecha y hora de la cita
        LocalDateTime fechaHora = LocalDateTime.of(2025, 6, 20, 10, 30); // 20 junio 2025, 10:30 AM

        // 5. Crear la cita
       // Cita cita = new Cita(1001, cliente, mascota, veterinario, fechaHora, TipoCita.VACUNACION, estadoCita);

        // 6. Mostrar la cita en consola
 //       System.out.println(" Cita registrada con éxito:");
      //  System.out.println(cita);
        
        
        ControladorCitas controlador = new ControladorCitas();
        Cita cita1 = controlador.agendarCita(2, cliente, mascota, veterinario, fechaHora, TipoCita.VACUNACION);
    //         System.out.println(cita1);
             
              
              
     //   controlador.cancelarCita(cita1);
    //     System.out.println(cita1);
         
         
      //   controlador.realizarCita(cita1);
      //   System.out.println(cita1);
    }
       
    
    
    
    
}
