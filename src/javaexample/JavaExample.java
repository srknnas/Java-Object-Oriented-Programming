/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample;

import java.util.ArrayList;

/**
 *
 * @author SERKANNAS
 */

class Calisan {    
    String isim;
    Yonetici yonetici;    
    
    public Calisan () {

    }
    
    public Calisan(String isim) {
        this.isim = isim;
    }
}

class Yonetici extends Calisan {
    ArrayList <Calisan> calisan = new ArrayList<>();
    
    public Yonetici(String isim) {
        super(isim);
    }
    
    public void addCalisan(Calisan alt) {
        this.calisan.add(alt);
        alt.yonetici = this;
    }
}


public class JavaExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Yonetici ali = new Yonetici("ali");
        Calisan veli = new Calisan("veli");
        Calisan ahmet = new Calisan("ahmet");
        ali.addCalisan(ahmet);
        ali.addCalisan(veli);
        System.out.println("Ahmet'in yöneticisi " + ahmet.yonetici.isim);
        System.out.println("Veli'nin yöneticisi " + veli.yonetici.isim);
        System.out.println("Ali'nin çalışanları " + ali.calisan.get(0).isim);
        System.out.println("Ali'nin çalışanları " + ali.calisan.get(1).isim);
        System.out.println("Ali'nin çalışan sayisi " + ali.calisan.size());
    }
    
}
