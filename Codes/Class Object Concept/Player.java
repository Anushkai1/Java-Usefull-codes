
package obkects;

public class Player {
    String title;
    int id ;
    double length;
    
    //default non parameterized constructor
    Player(){
        this.id = 1;
        this.title = "Loading";
        this.length = .5;
    }
    
    //Parameterized consttuctor
    Player(int id1, String title1, double length1){
        this.id = id1;
        this.title = title1;
        this.length = length1;
    }
    
    Player(int id1, String title1){
        this.id = id1;
        this.title = title1;
    }
    
    Player(int id1, double length1){
        this.id = id1;
        this.length = length1;
    }
        
    public void show(){
        System.out.println(this.title + " showed");
    }
    
    public void close(){
        System.out.println(this.title +" closed");
    }
    

}
