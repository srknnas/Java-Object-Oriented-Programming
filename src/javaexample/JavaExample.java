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
public class JavaExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int val1 = 26;
        int val2 = 0x1a;
        int val3 = 0b11010;
        //okunmayı kolaylastirmak icin altcizgi kullanilabilir.
        double val4 = 1__23.4; 
        double val5 = 1.234e2;
        float val6 = 123.4f;
        
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
        System.out.println(val5);
        System.out.println(val6);
        System.out.println();
        
        //array'ler pointer gibi calisir.
        int a[] = {1, 2, 377, 44, 3, 4, 5};
        int b[] = a; //shallow copy
        int c[] = new int[7];
        //Sadce kopyalama yapar. Referans olarak gecirmez.
        System.arraycopy(a, 0, c, 0, 7); //deep copy;
        System.out.println(b[2]);
        a[2] = 378;
        System.out.println(b[2]);
        for(int i = 0; i < 7; i++)
            System.out.println("Dizinin " + i + "'inci elemanı " + c[i]);        
        System.out.println();
        
        //instanceof, herhnagi bir nesnenin belirtilen türe ait olup 
        //olmadigini kontrol eder. Tipleri de karsilastirir.
        Parent parent = new Parent();
        if(parent instanceof Parent)
            System.out.println("true dondu.");            
        System.out.println();
        
        int bx = 13; // 0b1101
        System.out.println(bx >> 1); //0b0110
        System.out.println(bx << 1); //0b11010
        System.out.println(bx & 7); //0b1101 & 0b0111 = 0b0101 
        
        int n = 8;
        System.out.println((n < 10)?"n sayisi 10'dan küçüktür.":"n sayisi "
                + "10'dan büyüktür.");
    }    
}
