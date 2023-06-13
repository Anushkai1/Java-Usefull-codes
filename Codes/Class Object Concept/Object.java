
package obkects;

public class Object {

    public static void main(String[] args) {
        Player p1 = new Player();
        p1.reprt();
        
        Player p2 = new Player(2, "sdf", 2.5);
        p2.reprt();
      
        Player p3 = new Player(2, "sdf");
        p3.reprt();
              
        Player p4 = new Player(2, 3);
        p4.reprt();
                  
    }
    

    
}
