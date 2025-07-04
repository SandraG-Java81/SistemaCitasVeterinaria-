/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.time.LocalDateTime;

/**
 *
 * @author ISC
 */
public class Cita {
 
    private int idCita;
    private Cliente cliente;
    private Mascota mascota;
    private Veterinario veterinario;
    private LocalDateTime fechaHora;
    private TipoCita tipoCita;
    private EstadoCita estadoCita;

    public Cita(int idCita, Cliente cliente, Mascota mascota, Veterinario veterinario,
                LocalDateTime fechaHora, TipoCita tipoCita) {
        this.idCita = idCita;
        this.cliente = cliente;
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.fechaHora = fechaHora;
        this.tipoCita = tipoCita;
        this.estadoCita= EstadoCita.PROGRAMADA;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public TipoCita getTipoCita() {
        return tipoCita;
    }

    public void setTipoCita(TipoCita tipoCita) {
        this.tipoCita = tipoCita;
    }
    
    public EstadoCita getEstadoCita(){
    return this.estadoCita;
    }
    
    public void setEstadoCita(EstadoCita estadoCita){
        this.estadoCita=estadoCita;
    
    
    }

    @Override
    public String toString() {
        return "Cita ID: " + idCita +
               "\nCliente: " + cliente.getNombre() + " " + cliente.getApellido() +
               "\nMascota: " + mascota.getNombre() +
               "\nVeterinario: " + veterinario.getNombre() + " " + veterinario.getApellido() +
               "\nFecha y hora: " + fechaHora +
               "\nTipo de cita: " + tipoCita+
                "\n Estado de cita: " + estadoCita;
    }
}