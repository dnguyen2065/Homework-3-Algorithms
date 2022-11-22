import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter text to check palindrome: ");
        String string = myObj.nextLine();
        Palindrome p = new Palindrome();
        boolean finalBool = p.palindromeCheck(string, 0);
        System.out.println(finalBool);
    }
}
