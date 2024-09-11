package com.mycompany.ejercicior4;
import java.util.Scanner;
import java.util.InputMismatchException;
public class EjercicioR4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese la edad de Juan:");
        double edadjuan = 0;
        String error = "";
        boolean errorcodigo = false;
        try{
        edadjuan = entrada.nextDouble();
        } catch (InputMismatchException A){
            System.out.println("Valor ingresado no valido");
            errorcodigo = true;
        }
        if (!errorcodigo){
        CalculoEdades calculo = new CalculoEdades(edadjuan);
        System.out.println("La edad de juan es: "+ calculo.getEdadJuan());
        System.out.println("La edad de alberto es: "+ calculo.getEdadAlberto());
        System.out.println("La edad de ana es: "+ calculo.getEdadAna());
        System.out.println("La edad de mamá es: "+ calculo.getEdadMama());


    }}
}
