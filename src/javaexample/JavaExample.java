/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author SERKANNAS
 */
public class JavaExample {

    //global variable
    int gv = 100;
    
    interface lambda1 {
        int calistir(int x, int y);        
    }
    
    interface lambda2 {
        int calistir(int x);        
    }
     
    public int f(int x) {
        return x * gv;
    }
    /**
     * @param args the command line arguments
     */
    static int k = 100;
    public static void main(String[] args) {
        
        int j = 5;
        int z = 10;
        
        //Map Reduce
        List<Integer> list1 = Arrays.asList(1,2,3,4);
        int sum = list1.stream().map((x)-> x * x).reduce((x,y)-> x + y).get();
        System.out.println(sum);
        
        System.out.println();
        
        //Metod referans verdik. Foreach() fonksiyonu ile 
        //her bir eleman icin donuyor.
        List<Integer> list2 = Arrays.asList(1,2,3);  
        list2.forEach(x->System.out.println(x));
        list2.forEach(System.out::println); //Metod referans verdik.
        
        //Interface tanimlanmadan direk olarak -> isareti ile kullandik.
        list2.forEach(x -> {
            x += 2 + z + k;
            System.out.println(x);
            int y = x + 2;
            System.out.println(y);
            }
        );
        
        JavaExample example = new JavaExample();
        System.out.println(example.f(j));
        
        lambda1 l = (x,y) -> {
            return x * y;
        };
        lambda2 l2 = (x) -> x * x;
        
        System.out.println(l.calistir(5,8));
        System.out.println(l2.calistir(7));
    }
    
}
