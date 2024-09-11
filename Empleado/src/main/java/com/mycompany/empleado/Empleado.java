package com.mycompany.empleado;
public class Empleado {

    public static void main(String[] args) {
    double horasTrabajadas = 48;
    double valorHora = 5000;
    double porcentajeRetencion = 0.125;
    Salario salario = new Salario(horasTrabajadas, valorHora, porcentajeRetencion);
        System.out.println("El salario bruto es: "+ salario.salarioBruto());
        System.out.println("La retencion en la fuente es: "+ salario.retencion());
        System.out.println("El salario neto es: "+ salario.salarioNeto());    
    }
}
