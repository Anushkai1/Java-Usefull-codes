import java.util.Scanner;

public class Exerxise_2 {

    public static void main(String[] args) {
        int a , total=0;
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i<5; i++){
            System.out.print("Enter an integer number\t:\t");
            total+=sc.nextInt();
        }

        double avg =(double) total/5;
        System.out.println("he average is\t:\t"+avg);
        
        a = (int) avg;
        String s = String.valueOf(a);
        int b = Integer.parseInt(s+s);
        System.out.println("The value is\t:\t"+ (a + b / a));
    }
    
}
