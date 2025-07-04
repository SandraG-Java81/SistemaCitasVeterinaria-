/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ISC
 */
import java.time.LocalDate;
public class Cliente {
    private static  int contador =1;
    private  String idCliente;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    
    
    public  Cliente (String nombre, String apellido, String telefono, String direccion){
       int añoActual=LocalDate.now().getYear();
       String id=String.valueOf(añoActual).substring(2);
      this.idCliente= id+"CLI"+String.format("%03d", contador);
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
        this.direccion=direccion;
    
    contador++;
    }
    
    
  public String getIdCliente()
  {
 return this.idCliente;
  }
  
   
  
  public String getNombre()
  {
  return this.nombre;
  
  }
  
  public void setNombre(String nombre)
  {
      this.nombre=nombre;
  
  }
  
  public String getApellido()
  {
      return this.apellido;
  }
  
  public void setApellido(String apellido)
    {
    this.apellido=apellido;
    }
  
  public String getTelefono()
  {
  return this.telefono;
  }
  
  public void setTelefono(String telefono)
  {
  this.telefono=telefono;
  }
  
  public String getDireccion()
  {
  return this.direccion;
  }
  
  public void setDireccion(String direccion)
  {
  this.direccion=direccion;
  }
  
  
  public String toString()
  {
  return " ID "+idCliente + ", Nombre " + nombre + ", Apellido " + apellido + " , Telefono " + telefono + " , Direccion " + direccion;
   
  
  }
  
}
