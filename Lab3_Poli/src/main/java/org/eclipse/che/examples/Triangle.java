package org.eclipse.che.examples;

public class Triangle implements Shape{
    
    private double base;
    private double hight;
    
     public Triangle (double base, double hight){
        
        this.base = base;
        this.hight = hight;
    }
    
    public double getarea(){
        
        return (base * hight)/2;       
    }
    
    public String toString(){
        
        return "Triangle[ base " + this.base + " hight " 
        + this.hight + " area " + this.getarea() + " ]" ;
    }
}
