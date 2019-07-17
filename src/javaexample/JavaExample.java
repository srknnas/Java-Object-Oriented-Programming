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

class ogrenci {
    String Ogrenci;
    devam devamRolu;
    double notOrtalamasi;
    seviye egitimSeviyesi;
    int devam;
}

abstract class devam {
    public abstract boolean devamsiz(int devam);
}

class parttime extends devam {
    int s1;
    @Override
    public boolean devamsiz(int devam) {
        return false;
    }     
}

class fulltime extends devam{
    @Override
    public boolean devamsiz(int devam) {
        return devam > 100;
    }
}

abstract class seviye {
    public abstract boolean mezuniyet(double not);
}

class lisans extends seviye {
    @Override
    public boolean mezuniyet(double not) {
        return not >= 2;
    }
}

class lisanustu extends seviye {
    @Override
    public boolean mezuniyet(double not) {
        return not >= 3;
    }    
}

public class JavaExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ogrenci ali = new ogrenci();
        ali.devamRolu = new fulltime();
        ali.devam = 150;
        System.out.println("Ali devamsizliktan kaldi mi? " + ali.devamRolu.devamsiz(ali.devam));
        ali.devamRolu = new parttime();
        ali.devam = 150;
        System.out.println("Ali devamsizliktan kaldi mi? " + ali.devamRolu.devamsiz(ali.devam));
        ali.notOrtalamasi = 2.5;
        ali.egitimSeviyesi = new lisans();
        System.out.println("Ali mezun olabilir mi? " + ali.egitimSeviyesi.mezuniyet(ali.notOrtalamasi));
        ali.egitimSeviyesi = new lisanustu();
        System.out.println("Ali mezun olabilir mi? " + ali.egitimSeviyesi.mezuniyet(ali.notOrtalamasi));
    }   
}
