/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
import java.time.LocalDateTime;
import modelo.*;
/**
 *
 * @author ISC
 */
public class ControladorCitas {
    
    
    
    public Cita  agendarCita(int idCita, Cliente cliente, Mascota mascota, Veterinario veterinario,
                LocalDateTime fechaHora, TipoCita tipoCita){
    
    return  new Cita (idCita, cliente, mascota, veterinario,fechaHora,tipoCita);
    
  }
    
    
    public void cancelarCita(Cita cita){
    
    cita.setEstadoCita(EstadoCita.CANCELADA);
    
    }
    
    public void realizarCita(Cita cita){
        cita.setEstadoCita(EstadoCita.REALIZADA);
    
    
    }
    
    
    
    
    
}
