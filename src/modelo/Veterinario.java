/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ISC
 */
public class Veterinario {

    private int idVeterinario;
    private String nombre;
    private String apellido;
    private String telefono;
    private String especialidad;
    private String email;

    public Veterinario(int idVeterinario, String nombre, String apellido, String telefono, String especialidad, String email) {
        this.idVeterinario = idVeterinario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.especialidad = especialidad;
        this.email = email;

    }

    public int getIdVeterinario() {
        return this.idVeterinario;

    }

    public void setIdVeterinario(int idVeterinario) {
        this.idVeterinario = idVeterinario;

    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    public String getApellido() {
        return this.apellido;

    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return this.telefono;

    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;

    }

    public String getEspecialidad() {
        return this.especialidad;

    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;

    }

    public String getEmail() {
        return this.email;

    }

    public void setEmail(String email) {
        this.email = email;

    }

    public String toString() {

        return " ID " + idVeterinario +"\n"
                + " Nombre " + nombre + " \n "
                + " Apellidos " + apellido + "\n"
                + " Telefono" + telefono + "\n"
                + " Especialidad " + especialidad + "\n"
                + " Email " + email;

    }

}
