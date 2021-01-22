import java.util.Scanner;

public class Problem9 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter the number of rows wanted:");

            int rows= scan.nextInt();

            for (int i = 1; i <= rows; i++)
            {
                for (int j = rows; j > i; j--)
                {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++)
                {
                    System.out.print(i + " ");
                }
                System.out.println();
        }
    }
}
