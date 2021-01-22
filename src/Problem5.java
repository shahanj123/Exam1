import java.util.Scanner;
public class Problem5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Year");

        int x = scan.nextInt();
        if (x % 4 == 0 ) {
            System.out.println(x + " is a Leap Year");
            
        }else{
            System.out.println(x+ " is not a Leap Year");
        }
        
    }
    
}
