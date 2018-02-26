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
public class Consultor extends Personal {

    private double costeHora;
    private double hotasTrabajadasMes;

    public Consultor(double costeHora, String dni, String nombre, String direccion, String email) {
        super(dni, nombre, direccion, email);
        this.costeHora = costeHora;
    }

    public double getCosteHora() {
        return costeHora;
    }

    public double getHotasTrabajadasMes() {
        return hotasTrabajadasMes;
    }

    public void setCosteHora(double costeHora) {
        this.costeHora = costeHora;
    }

    public void setHotasTrabajadasMes(double hotasTrabajadasMes) {
        this.hotasTrabajadasMes = hotasTrabajadasMes;
    }

}
