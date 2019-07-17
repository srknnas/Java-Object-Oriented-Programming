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
public class Insan {
    int boy;
    int kilo;
    
    public Insan() {
        
    }
    
    public Insan(int boy, int kilo) {
        if(boy > 0 && kilo > 0) {
            this.boy = boy;
            this.kilo = kilo;
            System.out.println("Yeni bir insan olusturuldu.");
        }        
    }
    
    void yemek() {
        kilo++;
    }
}
