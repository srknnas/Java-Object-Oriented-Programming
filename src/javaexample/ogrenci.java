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
public class ogrenci extends ders.insan1{
    void setBoy() {
        //boy protected bir veri oldugundan dolayi farklı paket icerisinde
        //olsa bile inherit olarak alabiliyoruz.
        boy = 180;
        System.out.println(boy);
    }
    public static void main(String args[]) {
        ogrenci veli = new ogrenci();
        veli.setBoy();
    }
}
