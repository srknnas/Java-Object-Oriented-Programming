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
class Insan {
    int boy;
}

//Cloneable interface olması lazım clone() fonksiyonunu kullanmak icin
class Ogrenci extends Insan implements Cloneable{
    
    Object kopyala() throws CloneNotSupportedException {
        return this.clone(); //ikinci obje olusturuldu. Farklilar.
    }
    
    //Bu sekilde ogrencinin butun ozelliklerini manuel olarak tasimaktansa
    //clone() fonksiyonu ile tasimak daha kolay
    Ogrenci kopyala2() {
        Ogrenci temp = new Ogrenci();
        temp.boy = this.boy;
        return temp;
    }
    
    //equals fonksiyonunu Override ettik.
    @Override
    public boolean equals(Object rhs){
        return this.boy == ((Ogrenci)rhs).boy;
    }
    
    //toString fonksiyonunu Override ettik.
    @Override
    public String toString() {
        return "Bu objenin boyu " + this.boy;
    }    
}

public class JavaExample {

    /**
     * @param args the command line arguments
     * @throws java.lang.CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        //shallow copy (sig kopyalama)
        Insan ali = new Insan();
        Insan ahmet = ali; 
        ali.boy = 180;
        System.out.println("Ahmet'in boyu " + ahmet.boy);
        
        System.out.println();
        
        if(ali == ahmet)
            System.out.println("Ali ile Ahmet eşitler 1");
        //Override edilmemis equals fonksiyonu
        //Insan sinifi ile olusturuldugundan dolayi.
        if(ali.equals(ahmet))
            System.out.println("Ali ile Ahmet eşitler 2");
        
        System.out.println();
        
        ahmet.boy = 170;
        if(ali == ahmet)
            System.out.println("Ali ile Ahmet eşitler 3");
        //Override edilmemis equals fonksiyonu
        //Insan sinifi ile olusturuldugundan dolayi.
        if(ali.equals(ahmet))
            System.out.println("Ali ile Ahmet eşitler 4");
        
        System.out.println();
        
        Ogrenci ayse = new Ogrenci();        
        ayse.boy = 160;
        Ogrenci fatma = (Ogrenci)ayse.kopyala(); //Deep Copy (Derin Kopyalama)
        //Ogrenci fatma = ayse.kopyala2();
        System.out.println("Ayşe'nin boyu " + ayse.boy);
        System.out.println("Fatma'nin boyu " + fatma.boy);
        
        System.out.println();
        
        ayse.boy = 180;
        System.out.println("Ayşe'nin boyu " + ayse.boy);
        System.out.println("Fatma'nin boyu " + fatma.boy);
        
        System.out.println();
        
        fatma.boy = 190;
        System.out.println("Ayşe'nin boyu " + ayse.boy);
        System.out.println("Fatma'nin boyu " + fatma.boy);
        
        System.out.println();
        
        if(ayse == fatma)
            System.out.println("Ayşe ile Fatma eşitler 1");
        if(ayse.equals(fatma))
            System.out.println("Ayşe ile Fatma eşitler 2");
        ayse.boy = 190;
        if(ayse.equals(fatma))
            System.out.println("Ayşe ile Fatma eşitler 3");
        
        System.out.println();
        
        System.out.println(ayse);
        System.out.println(ayse.hashCode());
    }
    
}
