import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Check amount and tip percent");

        int bill = scan.nextInt();
        double tip=scan.nextDouble();

        double total= bill + bill*tip;
        System.out.println("Total amount is " + total);

    }
}
