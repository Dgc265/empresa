/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 53253095e
 */
public class GestionEmpresa {

    private String nombreEmpresa;
    private String cif;
    Set<Personal> Plantilla = new HashSet<>();

    public GestionEmpresa(String nombreEmpresa, String cif) {
        this.nombreEmpresa = nombreEmpresa;
        this.cif = cif;
    }
    public boolean contratarEmpleado(int añoContrato, double sueldo, double irpf, String dni, String nombre, String direccion, String email){
    boolean contratado=true;
    Empleado empleado = new Empleado(añoContrato, sueldo, irpf, dni,nombre, direccion,email);
        Plantilla.add(empleado);
    return contratado;
    }
    public boolean contratarConsultor(double costeHora, String dni, String nombre, String direccion, String email){
    boolean contratado=true;
    Consultor consultor = new Consultor(costeHora, dni, nombre, direccion, email);
        Plantilla.add(consultor);
    return contratado;
    }
    
    public boolean despedir (String dni){
    boolean despedido=false;
        for (Personal personal1 : Plantilla) {
        if(personal1.getDni().equalsIgnoreCase(dni)){
        Plantilla.remove(personal1);
        despedido=true;
        }
            
        }
    
    
    return despedido;
    }
    public String lista(){
        String nombre="";
    
        for (Personal persona : Plantilla) {
            
            nombre += persona.getClass().getSimpleName()+": ";
            
            if (persona instanceof Empleado) {
                Empleado empleado = (Empleado) persona;
                nombre+=empleado.getNombre()+" "+empleado.sueldoMensual()+" "+empleado.getDepartamento()+" "+empleado.getAñoContrato()+"\n";
            }
            if (persona instanceof Consultor) {
                Consultor consultor = (Consultor) persona;
                nombre+=consultor.getNombre()+" "+consultor.getCosteHora()+"\n";
                
            }

        }
        return nombre;
    }
    
    

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public void setPersonal(Set<Personal> personal) {
        this.Plantilla = personal;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public String getCif() {
        return cif;
    }

    public Set<Personal> getPersonal() {
        return Plantilla;
    }

}
