import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    System.out.println("Enter Number");
    int x = scan.nextInt();

    if (x <200 && x % 2==0){
        System.out.println(x + " is a vaild number");
    }else{
        System.out.println("Invaild Number");
    }
    
    }
    
    
}
