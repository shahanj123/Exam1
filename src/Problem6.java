import java.util.Scanner;
public class Problem6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Letter");

        char let= scan.next().charAt(0);
        switch(let) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(let + " is a vowel");
                break;
            default:
                System.out.println(let + " is a consonant");


        }

    }
    
}
