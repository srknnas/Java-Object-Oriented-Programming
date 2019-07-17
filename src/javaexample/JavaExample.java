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
  
    interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }
  
    public void sayHello() {
     
        //
        class EnglishGreeting implements HelloWorld {
            String name = "world";
            
            @Override
            public void greet() {
                greetSomeone("world");
            }
            
            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }
        
        HelloWorld englishGreeting = new EnglishGreeting();        
        
        HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";
            
            @Override
            public void greet() {
                greetSomeone("tout le monde");
            }
            
            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };
        
        //Class yaratilmadan islem yapildi. Sadece interface kullanildi.
        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";
            
            @Override
            public void greet() {
                greetSomeone("mundo");
            }
            
            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, " + name);
            }
        };
        
        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
    }

    public static void main(String... args) {
        JavaExample myApp = new JavaExample();
        myApp.sayHello();
    }            
}
