/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.io.IOException;

/**
 *
 * @author 53253095e
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        GestionEmpresa empresa = new GestionEmpresa("robots", "41548");
        int opcion=0;
        do{ System.out.println("1.Contrar"
                + "\n2.Ver empleados"
                + "\n3.Despedir"
                + "\n0.Para salir");
        opcion = Integer.parseInt(in.readLine());
        if(opcion==1){
        contratar(empresa);
        }
        if(opcion==2){
        listaEmpleado(empresa);
        }
        if(opcion==3){
        despedir(empresa);
        }
        
        
        }while(opcion!=0);
        

    }

    public static void contratar(GestionEmpresa empresa) throws IOException {
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        int opcion = 0;
        System.out.println("1.Para contratar un empleado"
                + "2.Para contrar un consultor");
        opcion = Integer.parseInt(in.readLine());
        if (opcion == 1) {
            System.out.println("Introduce el año de contrato");
            int añoContrato = Integer.parseInt(in.readLine());
            System.out.println("Intorduce el sueldo anual");
            double sueldo = Double.parseDouble(in.readLine());
            System.out.println("Introduce el irpf a aplicar");
            double irpf = Double.parseDouble(in.readLine());
            System.out.println("Introduce el dni");
            String dni = in.readLine();
            System.out.println("Introduce el nombre");
            String nombre = in.readLine();
            System.out.println("Introduce la dirrecion");
            String direccion = in.readLine();
            System.out.println("Introduce el email");
            String email = in.readLine();
            empresa.contratarEmpleado(añoContrato, sueldo, irpf, dni, nombre, direccion, email);

        }
        if (opcion == 2) {
            System.out.println("Introduce el coste de hora: ");
            double costeHora = Double.parseDouble(in.readLine());
            System.out.println("Introduce el dni");
            String dni = in.readLine();
            System.out.println("Introduce el nombre");
            String nombre = in.readLine();
            System.out.println("Introduce la dirrecion");
            String direccion = in.readLine();
            System.out.println("Introduce el email");
            String email = in.readLine();

            empresa.contratarConsultor(costeHora, dni, nombre, direccion, email);

        }

    }

    public static void listaEmpleado(GestionEmpresa empresa) {
        System.out.println(empresa.lista());

    }

    public static void despedir(GestionEmpresa empresa) throws IOException {
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        System.out.println("Introduce el dni de la persona a despedir: ");
        String dni = in.readLine();
        boolean despedido = empresa.despedir(dni);
        if (despedido == true) {
            System.out.println("El empleado ha sido despedido");
        } else {
            System.out.println("El empleado no ha podido ser depedido");
        }

    }

}
