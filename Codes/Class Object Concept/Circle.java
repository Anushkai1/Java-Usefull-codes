package Exercise;

import java.text.DecimalFormat;

public class Circle {
    
    private static final DecimalFormat zero = new DecimalFormat("0.00");
    private double radius;
    private String colour;
            
            
    //Setters
    public void setRaduis(double r){
        radius = r;
    }
    
    public void setColour(String s){
        colour = s;
    }
    
    
    //Getters
    public double getRadious(){
        return radius;
    }
    
    public String getcolour(){
        return colour;
    }
    
    
    //Calculaters
    public Double getPerimeter(){
        double a =  2*radius*Math.PI;     
        System.out.println("The perimeter of circle1 is\t:\t"+ zero.format(a));
        return a;
    }
   
    
   public double getArea(){
       double a = Math.PI * radius * radius;
       System.out.println("The area of circle1 is\t\t:\t"+zero.format(a) + "\n-----------------------------------------------");
       return  a;
   }

}
