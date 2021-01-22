import java.util.Scanner;
public class Problem14 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter Count");
        int n1 = 1, n2 = 0, n3, count=scan.nextInt(),i;
        for (i = 0; i < count; ++i){
            n3 = n1+n2;
            System.out.println(n3);
            
            n2=n2+1;
            n1=n3; 
        }
    }
}
