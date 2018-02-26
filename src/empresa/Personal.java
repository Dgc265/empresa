/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.time.LocalDate;

/**
 *
 * @author 53253095e
 */
public class Personal {

    protected String dni;
    protected String nombre;
    protected String direccion;
    protected String email;
    protected String puesto;
    protected LocalDate fechaNacimiento;
    protected LocalDate fechaContrato;
    protected String NSS;

    public Personal(String nombre, String NSS) {
        this.nombre = nombre;
        this.NSS = NSS;
    }

    public Personal(String dni, String nombre, String direccion, String email, String puesto, LocalDate fechaNacimiento, LocalDate fechaContrato, String NSS) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.puesto = puesto;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaContrato = fechaContrato;
        this.NSS = NSS;
    }

   

    
    
     public Personal(String dni, String nombre, String direccion, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        
    }
    public String getPuesto() {
        return puesto;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public LocalDate getFechaContrato() {
        return fechaContrato;
    }

    public String getNSS() {
        return NSS;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setFechaContrato(LocalDate fechaContrato) {
        this.fechaContrato = fechaContrato;
    }
 public boolean comprobarTrabajadroIguales (Personal trabajadorAcomparar){
  boolean Igual=false;
  
  if(this.NSS.equalsIgnoreCase(trabajadorAcomparar.NSS)){
   Igual = true;
  
  }
  return Igual;
  
     
 }
 @Override
 public String toString(){
 return this.nombre+" "+this.NSS+" "+this.direccion+" "+this.dni+" "+this.email+" "+this.puesto;
 }
    

   

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
