package com.mycompany.ejerciciop17;
import java.util.Scanner;
import java.util.InputMismatchException;
public class EjercicioP17 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int c = 0;
        boolean error = false;
        System.out.println("Ingrese el radio del circulo: ");
        try{
        c = entrada.nextInt();
        }catch(InputMismatchException A){
            error = true;
            System.out.println("El valor ingresado es invalido");
        }if (!error){
            Circulo circulo = new Circulo(c);
            System.out.println("El valor del area es: " + circulo.area());
            System.out.println("El valor de la circunferencia es: "+ circulo.circunferencia());

    }
}}
