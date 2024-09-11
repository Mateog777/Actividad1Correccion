
package com.mycompany.ejercicior4;

public class CalculoEdades {
    private double edadjuan;
    private double edadalberto = 0;
    private double edadana = 0;
    private double edadmama = 0;    
    public CalculoEdades (double edadjuan) {
        this.edadjuan = edadjuan;
    }    
public double getEdadJuan(){
    return edadjuan;
}    
public double getEdadAlberto(){
    return ((2.0/3.0)*edadjuan);
}
public double getEdadAna(){
    return ((4.0/3.0)*edadjuan);
}
public double getEdadMama (){
    return getEdadJuan() + getEdadAlberto() + getEdadAna();
}
       
}
