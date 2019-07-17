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

class dizi {
    String isim;
    String yapimci;
    ArrayList <bolum> bolumler = new ArrayList<>();
    
    void bolumEkle(bolum b) {
        bolumler.add(b);
    }
}

class bolum {
    
    String bolumIsim;
    int bolumNumarasi;
    
    public bolum(String bolumIsmi, int bolumNumarasi) {
        this.bolumIsim = bolumIsmi;
        this.bolumNumarasi = bolumNumarasi;
    }    
}

public class JavaExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        dizi d = new dizi();
        d.isim = "komedi";
        d.yapimci = "Serkan NAS";
        d.bolumEkle(new bolum("eşofmanlı", 1));
        d.bolumEkle(new bolum("pijamalı", 2));
        
        bolum b = new bolum("takım elbiseli", 3);
        d.bolumEkle(b);
    }    
}
