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
class veriTipi<T1, T2> {
    int id;
    String isim;
    T1 degisken1;
    T2 degisken2;
}

class calisan <benimTipim> {
    benimTipim maas;
    String isim;
}

public class JavaExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList();
        String s1 = "Serkan";
        String s2 = "Nas";
        list1.add(s1);
        list1.add(s2);
        
        
        ArrayList<veriTipi> list2 = new ArrayList();
        veriTipi vt = new veriTipi();
        vt.id = 100;
        vt.isim = "ali";
        vt.degisken1 = "deneme1"; //obje oldugundan hata vermedi.
        vt.degisken2 = 100; //obje oldugundan hata vermedi.
        list2.add(vt);
        
        
        calisan<Double> ali = new calisan<>();
        ali.maas = 12.3;
        calisan<Integer> veli = new calisan<>();
        veli.maas = 12;
        calisan<veriTipi<String, Integer>> ahmet = new calisan<>();
        ahmet.isim = "gt";
        ahmet.maas= new veriTipi<>(); //obje olusturuldu.
        ahmet.maas.id = 1;
        ahmet.maas.isim = "para";
        ahmet.maas.degisken1 = "deneme"; //String olmasi gerekiyor.
        ahmet.maas.degisken2 = 10; //Integer olmasi gerekiyor.
    }    
}
