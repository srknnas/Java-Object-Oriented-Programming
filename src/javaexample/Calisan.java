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
public class Calisan extends insan implements NewInterface{
    
    double maas;
    
    /**
     *
     * @param oran
     */
    @Override
    public void zam(double oran) {
        maas = maas + (maas * (oran/100));
    }
    
    //yasi degiskeni tanimli olmamasina ragmen insan class'i
    //inherit edildiğinden bu degiskenleri veya fonksiyonlari
    //kullanabiliyoruz.
    public void zam2(double oran) {        
        yemek();                
        maas = maas + (maas * (oran/100)) + yasi;
    }
}
