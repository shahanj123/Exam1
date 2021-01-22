import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) throws Exception {
        //Question 1
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");

        int x= scan.nextInt();

        String ans = (x < 100) ? "less then 100":"greater then 100";

        System.out.println(x + " is " + ans);

    }
}