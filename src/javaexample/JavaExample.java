/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample;

import java.time.LocalDateTime;

/**
 *
 * @author SERKANNAS
 */

class producer extends Thread {
    data d;
    public producer (data d) {
        this.d = d;
    }
    
    //Ilerde Thread calistirildigi zaman bu fonksiyon calistirilacak.
    @Override
    public void run() {  
        while(true) {
            try {
                synchronized(d) {
                    if(d.bayrak == false) {
                        d.deger++;
                        System.out.println("üretici " + d.deger); 
                        d.bayrak = true;
                        System.out.println(LocalDateTime.now());
                    }
                }            
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}

//Thread icin bu kullanım daha dogru
class consumer implements Runnable {
    data d; 
    public consumer(data d) {
        this.d = d;
    }    
    
    //Ilerde Thread calistirildigi zaman bu fonksiyon calistirilacak.
    @Override
    public void run() {    
        while(true) {
            try {
                synchronized(d) {
                    if(d.bayrak == true) {
                        d.deger--;
                        System.out.println("tuketici " + d.deger);
                        d.bayrak = false;
                        System.out.println(LocalDateTime.now());
                        Thread.sleep(1000);
                    }
                }                
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class data {
    int deger;
    boolean bayrak;
}

public class JavaExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        data d = new data();
        d.deger = 100;
        d.bayrak = false;
        producer p = new producer(d);
        consumer c = new consumer(d); 
        Thread t = new Thread(c);
        p.start();        
        t.start();
    }
}
    