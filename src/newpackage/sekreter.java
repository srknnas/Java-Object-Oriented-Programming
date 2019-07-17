/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author SERKANNAS
 */

//abstract class inherit edilen class da abstract olacak veya fonksiyon
//override yapilacak. İki tane yontem var.


//public abstract class sekreter extends calisan {
//
//}

public class sekreter extends calisan {
    //static tanimlandiginda artik o degisken objenin degiskeni degil
    //class'in bir degiskeni olmaktadir.
    private static int sayac = 0;
    private int telefon;
    
    public sekreter() {
        sayac++;
    }
    
    //telefon degiskenine sag tiklayip "Insert Code" diyerek
    //oradan "getter ve setter" secildi.
    public int getTelefon() {
        return telefon;
    }
    
    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }       
    
    public int getSayac() {
        return sayac;
    }
    
    public void setSayac(int x) {
        sayac = x;
    }    
    
    //maas fonksiyonunu override ediyoruz.
    @Override
    public void maas() {
        System.out.println("maaş 100");
    }
    
    public final void yetki() {
        System.out.println("Yetkimi kimseye vermem.");
    }
    
    public static void main(String args[]) {
        sekreter ayse = new sekreter();
        sekreter ali = new sekreter();
        new sekreter();
        System.gc();
        System.out.println(ali.getSayac());
        ali.yetki();
    }
}
