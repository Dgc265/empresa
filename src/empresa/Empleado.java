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
public class Empleado extends Personal {

    private String departamento = "";
    private int añoContrato;
    private double sueldo;
    private double irpf;

    public Empleado(double sueldo, String nombre, String NSS) {
        super(nombre, NSS);
        this.sueldo = sueldo;
    }

    public Empleado(String dni, String nombre, String direccion, String email, String puesto, LocalDate fechaNacimiento, LocalDate fechaContrato, String NSS) {
        super(dni, nombre, direccion, email, puesto, fechaNacimiento, fechaContrato, NSS);
    }

    
    public Empleado(int añoContrato, double sueldo, double irpf, String dni, String nombre, String direccion, String email) {
        super(dni, nombre, direccion, email);
        this.añoContrato = añoContrato;
        this.sueldo = sueldo;
        this.irpf = irpf;
    }
    public double calcularPaga(){
    double netoMensual=0;
    netoMensual= this.sueldo/12;
    return netoMensual;
    }
    public void Irfp(){
    if(sueldo<=12.450){
    this.irpf=19;
    }
    if(12.450>sueldo && sueldo<=20.000){
    this.irpf=24;
    }
    }
    public double sueldoMensual(){
    double mensual=0;
    mensual=(this.sueldo/12)-((this.sueldo/12)*(this.irpf/100));
    
    return mensual;
    }

    public String getDepartamento() {
        return departamento;
    }

    public int getAñoContrato() {
        return añoContrato;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setAñoContrato(int añoContrato) {
        this.añoContrato = añoContrato;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setIrpf(double irpf) {
        this.irpf = irpf;
    }

    public double getSueldo() {
        return sueldo;
    }

    public double getIrpf() {
        return irpf;
    }

}
