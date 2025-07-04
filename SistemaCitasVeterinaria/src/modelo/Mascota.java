/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ISC
 */
public class Mascota {
    
    private int idMascota;
    private String nombre;
    private String raza;
    private int edad;
    private TipoMascota tipoMascota;
  
    
    
    public Mascota(int idMascota, String nombre, String raza, int edad , TipoMascota tipoMascota){
        this.idMascota=idMascota;
        this.nombre=nombre;
        this.raza=raza;
        this.tipoMascota=tipoMascota;
             
    }
    
    
  public  int getIdMascota(){
    return  this.idMascota;
    
    }
    
   public void setIdMascota(int idMascota){
    this.idMascota=idMascota;
    
    }
    
    public  String getNombre(){
    
    return this.nombre;
    }
    
    public  void setNombre(String nombre){
    this.nombre=nombre;
    
    }
    
    public  String getRaza(){
    return this.raza;
    
    }
    
   public  void setRaza(String raza){
    this.raza=raza;
    
    }
    
   public int getEdad(){
   return this.edad;
   }
   
   public  void  setEdad(int edad){
   this.edad=edad;
   
   }
    
    
    public  TipoMascota getTipoMascota(){
    return this.tipoMascota;
    
    }
    
    public  void setTipoMascota(TipoMascota tipoMascota){
    this.tipoMascota=tipoMascota;
    }
    
    public String toString(){
    return "ID"+idMascota+"Nombre"+nombre+"Raza"+raza+"Edad"+edad+ "Tipo de Mascota"+idMascota;
    
    }
    
    
    
    
    
    
    
    
}
