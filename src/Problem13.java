import java.util.Scanner;
public class Problem13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         
        System.out.println("Enter input string to be cleaned from white spaces:");
         
        String inputString = scan.nextLine();
         
        // \s+ means all white spaces in between words 
        String stringWithoutSpaces = inputString.replaceAll("\s+", "");
         
        System.out.println("Input String : "+inputString);
         
        System.out.println("Input String Without Spaces : "+stringWithoutSpaces);
    
    }
}
