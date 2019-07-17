/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample;
import ders.insan1;
/**
 *
 * @author SERKANNAS
 */
public class JavaExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ders.insan2 ali = new ders.insan2();
        insan1 veli = new insan1();
        insan2 ali = new insan2();
        
        //Veli'nin boyuna hem paket disinda hem de bos 
        //oldugundan ulasilamamaktadir.
        //Aynı paket içerisinde olmadiklarindan veli.boy gozukmemektedir.
        veli.yas = 29;         
        //veli.boy = 180;
        
        //ali'nin boyu bos olmasina ragmen ayni paket icinde
        //oldugundan erisim saglandi.
        ali.yas = 30;
        ali.boy = 180;
        System.out.println("Ali'nin yaşı " + ali.yas);
        System.out.println("Ali'nin boyu " + ali.boy);
    }
    
}
