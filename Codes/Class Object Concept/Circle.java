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
    
    


}
