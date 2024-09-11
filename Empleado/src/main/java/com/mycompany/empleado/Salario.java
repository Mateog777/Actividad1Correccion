
package com.mycompany.empleado;
public class Salario {
    private double horasTrabajadas;
    private double valorHora;
    private double porcentajeRetencion;
    public Salario (double horasTrabajadas,double valorHora,double porcentajeRetencion){
        this.horasTrabajadas = horasTrabajadas;
        this.porcentajeRetencion = porcentajeRetencion;
        this.valorHora = valorHora;
    }
public double salarioBruto(){
    return valorHora*horasTrabajadas;
}    
public double retencion(){
    return salarioBruto()*porcentajeRetencion;
}
public double salarioNeto(){
    return salarioBruto()-retencion();
}
}
