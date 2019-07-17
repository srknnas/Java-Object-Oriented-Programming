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

class Insan {
    static int sayac;
    int boy;
    int kilo;
    int yas;
    
    public Insan() {
        System.out.println("Bir insan objesi olusturuldu.");
        sayac++;
        yas = 1;        
    }
    
    //Polymorphism (cok sekilcilik)
    public Insan(int yas, int kilo, int boy) {
        this(); //Default constructor cagrilir.
        this.yas = yas;
        this.kilo = kilo;
        this.boy = boy;
    }
}

public class JavaExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Insan veli = new Insan(20, 70, 170);
        Insan ali = new Insan(); //default constructor
        //Erisilemeyen obje
        //Aynı zamanda constructor'un tekrar calismasini saglar.
        new Insan(); 
        System.gc(); //erisilemeyen objeleri temizler.         
        
        ali.boy = 180;
        ali.kilo = 80;
        
        System.out.println("Ali'nin özellikleri " + ali.boy + ", " + ali.kilo);        
        System.out.println("Veli'nin özellikleri " + veli.boy + ", " + veli.kilo);   
        System.out.println("Sayac değeri: " + Insan.sayac);
    }    
}
