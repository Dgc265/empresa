/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author 53253095e
 */
public class Empleado extends Personal {

    private String departamento = "";
    private int añoContrato;
    private double sueldo;
    private double irpf;

    public Empleado(int añoContrato, double sueldo, double irpf, String dni, String nombre, String direccion, String email) {
        super(dni, nombre, direccion, email);
        this.añoContrato = añoContrato;
        this.sueldo = sueldo;
        this.irpf = irpf;
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
