
package com.mycompany.ejerciciop14;
public class CuadradoCubo {
    private int a;
    public CuadradoCubo(int a){
        this.a = a;
    }
public double cuadrado(){
    return Math.pow(a, 2);
}  
public double cubo(){
    return Math.pow(a, 3);
}
}
