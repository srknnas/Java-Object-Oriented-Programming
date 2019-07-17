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

public class JavaExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Insan ali = new Insan();
        ali.kilo = 80;
        Muhendis veli = new Muhendis(20000, 180, 80);
        veli.boy = 168;
        System.out.println(veli.boy);
        veli.kilo = 67;
        veli.yemek();
        System.out.println(veli.kilo);
        //veli.maas = 10000;
        veli.zam(2000);
        veli.zam((float)0.5);
        System.out.println(veli.maas);
        ali.yemek();
        System.out.println(ali.kilo);
        veli.yemek(10);
        System.out.println(veli.kilo);
    }
    
}
