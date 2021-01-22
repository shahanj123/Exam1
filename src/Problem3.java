import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Count");
        int n1 = 0, n2 = 1, n3, count=scan.nextInt(),i;
        for (i = 1; i < count; ++i){
            n3 = n1+n2;
            System.out.println(n3);
            
            n1=n2;
            n2=n3;
            
        }
    }
}
