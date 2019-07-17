/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample;

/**
 *
 * @author SERKANNAS
 */
public class Muhendis extends Insan {
    
    int maas;   
    
    public Muhendis() {
        //maas = 7000;
        
        //Constructor cagiriyor.
        this(7000);
    }   

    public Muhendis(int maas) {
        if(maas > 0)            
            this.maas = maas;
        else
            this.maas = 4000;
    }
    
    public Muhendis(int maas, int boy, int kilo) {        
        super(boy, kilo);
        this.maas = maas;
    }
    
    int zam() {
        maas++;
        return maas;
    } 
    
    //overloading
    int zam(int zamMiktari) {
        maas += zamMiktari;
        return maas;
    }    
    
    //overloading
    float zam(float zamOrani) {
        maas *= (1 + zamOrani);
        return maas;
    }
    
    //Overriding
    @Override
    void yemek() {
        kilo = kilo + 2;
    }
    
    void yemek(int kilo) {
        this.kilo += kilo;
    }
}
