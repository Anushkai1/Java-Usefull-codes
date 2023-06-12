package Exercise;

public class TestCircle {
    public static void main(String[] args){
        Circle circle1 = new Circle();
        circle1.setRaduis(10.1);
        circle1.setColour("Brown");
        
        circle1.getPerimeter();
        circle1.getArea();
        
        Circle circle2 = new Circle();
        circle2.setRaduis(15.58);
        circle2.setColour("Pink");
        
        circle2.getPerimeter();
        circle2.getArea();
    }
}

