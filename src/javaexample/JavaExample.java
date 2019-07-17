/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author SERKANNAS
 */
class benimException extends Exception {
     public benimException(String message) {
        super(message);
    }
}

class deneme1 {
    void g() throws benimException {
        f(10);
    }
    
    void f(int x) throws benimException {
        throw new benimException("Hata var1");
    }       
}

class deneme2 {
    void h() throws FileNotFoundException {
        throw new FileNotFoundException("Hata var2");
    }
}

public class JavaExample {

    /**
     * @param args the command line arguments
     * @throws javaexample.benimException
     */
    public static void main(String[] args) {
        File f = new File("a.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            int a[] = new int[10];
            System.out.println(a[20]);
        }
        catch(FileNotFoundException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
            e.printStackTrace();
            System.out.println();
        }
        catch(Exception e) {
            System.out.println(e.toString());
            System.out.println();
        }
        
        try {
            deneme1 d = new deneme1();
            d.f(5);
            d.g();
            
            deneme2 d2 = new deneme2();
            d2.h();
        }
        catch(benimException b) {
            b.printStackTrace();
            System.out.println();
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
            System.out.println();
        }
    }    
}
