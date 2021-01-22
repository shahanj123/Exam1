import java.util.Scanner;
public class Problem10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Positive numbers to sum and enter Negative number to stop the program");
        int num,sum=0;

        while(true){
            num=scan.nextInt();
            if(num < 0)
            break;
            sum +=num;
        }
        System.out.println("Sum is " + sum);

    }
    
}
