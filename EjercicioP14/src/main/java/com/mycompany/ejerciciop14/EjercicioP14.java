package com.mycompany.ejerciciop14;
import java.util.Scanner;
import java.util.InputMismatchException;
public class EjercicioP14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int a = 0;
        boolean error = false;
        System.out.println("Ingrese el numero: ");
        try{
        a = entrada.nextInt();
        }catch(InputMismatchException A){
            error = true;
            System.out.println("El valor ingresado es invalido");
        }if (!error){
            CuadradoCubo numero = new CuadradoCubo(a);
            System.out.println("El valor del cuadrado es: " + numero.cuadrado());
            System.out.println("El valor del cubo es: "+ numero.cubo());
            
            
            
        }

    }
}
