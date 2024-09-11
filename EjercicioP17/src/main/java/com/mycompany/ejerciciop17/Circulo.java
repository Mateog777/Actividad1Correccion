package com.mycompany.ejerciciop17;
public class Circulo {
    private int radio;
    public Circulo(int radio){
        this.radio = radio;
    }
public double area(){
    return Math.PI * Math.pow(radio, 2);
}
public double circunferencia(){
    return 2 * Math.PI * radio;
}
}
