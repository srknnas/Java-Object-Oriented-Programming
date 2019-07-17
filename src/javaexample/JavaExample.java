/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample;
//deneme paketinin icindeki herseyi import ettik.
import deneme.*;

/**
 *
 * @author SERKANNAS
 */
public class JavaExample {

    //JavaExample sinifinin icinde degisken tanimladik. Main kismi statik
    //oldugundan degiskenler ve fonksiyonlarda statik olmak zorunda.
    private static int z = 5;
    static int x = 10;
    static int f(int y) {
        x = y * 2;
        return x;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(z);
        //Baska paketin icindeki sinifa ulasma
        Yaz yaz = new Yaz();
        yaz.basarili();
        
        //Statik değişkenler 
        System.out.println(x);
        System.out.println(f(6));
        System.out.println(x);
        System.out.println();
                
        Calisan serkan = new Calisan();
        serkan.boy = 168;
        serkan.kilo = 67;
        serkan.yasi = 31;
        System.out.println("Serkan'nin yasi: " + serkan.yasi);
        System.out.println("Serkan'nin boyu: " + serkan.boy);
        System.out.println("Serkan'nin kilosu: " + serkan.kilo);
        System.out.println();
        
        Calisan veli = new Calisan();
        veli.boy = 168;
        veli.kilo = 67;
        veli.yasi = 31;
        System.out.println("Veli'nin yasi: " + veli.yasi);
        System.out.println("Veli'nin boyu: " + veli.boy);
        System.out.println("Veli'nin kilosu: " + veli.kilo);
        serkan.yemek();
        veli.yemek();
        System.out.println("Veli'nin kilosu: " + veli.kilo);
        veli.maas = 100;
        veli.zam(20);
        System.out.println("Veli'nin maaşı: " + veli.maas);
        veli.zam(30);
        System.out.println("Veli'nin maaşı: " + veli.maas);
        veli.zam2(100);
        System.out.println("Veli'nin maaşı: " + veli.maas);
        System.out.println("Veli'nin kilosu: " + veli.kilo);
    }    
}
