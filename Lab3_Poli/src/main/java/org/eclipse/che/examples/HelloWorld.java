package org.eclipse.che.examples;

public class HelloWorld {
    public static void main(String... argvs) {
       Shape a1, b1, c1;
       
       a1 = new Rectangulo  (10,10); //toma su form de rectangulo - polimorfimos
       System.out.println(a1.toString());
       
       
       b1 = new Triangle (10,4); //toma su forma de triangulo - polimorfismos 
       System.out.println(b1.toString());
       
       c1 = new Rectangulo (5,5); // toma su forma de rectangulo - polimorfismo 
       System.out.println(c1.toString());
       
    }
}
