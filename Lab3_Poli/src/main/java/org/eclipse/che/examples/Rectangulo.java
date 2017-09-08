package org.eclipse.che.examples;

public class Rectangulo implements Shape {
    
    private double width;
    private double lenght;
    
    public Rectangulo (double width, double lenght){
        
        this.width = width;
        this.lenght = lenght;
    }
    
    public double getarea(){
        
        return this.width *this.lenght;       
    }
    public String toString(){
        
        return "Rectangle[width " + this.width
        + " length " + this.lenght + " area " + this.getarea() + "]";
    }
    
}
