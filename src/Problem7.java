import java.util.Scanner;
public class Problem7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Movie Theater: Arlington or Fairfax");

        String thea= scan.next();        
        System.out.println("Enter Movie Number");
        int num= scan.nextInt();


        switch(thea){
            case "Arlington":
                switch(num){
                    case 1:
                    System.out.println("Batman");
                    break;
                    case 2:
                    System.out.println("Hobbit");
                    break;
                    case 3:
                    System.out.println("Ironman");
                    break;
                }
            break;
            case "Fairfax":
                switch(num){
                    case 1:
                    System.out.println("Superman");
                    break;
                    case 2:
                    System.out.println("Bill");
                    break;
                    case 3:
                    System.out.println("Steve");
                    break;
                }
        }
    }
}
