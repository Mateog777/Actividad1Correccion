package com.mycompany.ejercicior5;
public class EjercicioR5 {

    public static void main(String[] args) {
        double suma = 0;
        double x = 20;
        suma += x;
        double y = 40;
        x = (x+Math.pow(y,2));
        suma = suma + (x/y);
        System.out.println("El valor de la suma es: "+suma);
        
    }
}
