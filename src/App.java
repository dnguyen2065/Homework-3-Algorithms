import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        // AFTER ENTERING THE PALINDROME QUESTIONS 2 AND 3 WILL PRINT IMMEDIATELY AFTER
        // WITH LABELS
        // Q1---------------------------------------
        System.out.println("Q1---------------------------------------");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter text to check palindrome: ");
        String string = myObj.nextLine();
        Palindrome p = new Palindrome();
        boolean finalBool = p.palindromeCheck(string, 0);
        System.out.println(finalBool);
        // Q2--------------------------------------
        System.out.println("Q2---------------------------------------");
        InversionCount ic = new InversionCount();
        int[] intArr = { 4, 1, 2, 3, 6, 8, 1, 2, 123, 5, 7, 56, 34, 3245, 8, 978, 0,
                954, 34, 345, };
        System.out.println(ic.easyInversionCount(intArr));
        System.out.println(ic.fastInversionCount(intArr));
        // Q3---------------------------------------
        System.out.println("Q3---------------------------------------");
        BinaryReflectedGrayCode brcg = new BinaryReflectedGrayCode();
        ArrayList<String> input = brcg.BRCG(4);
        brcg.grayCodesAreFun(brcg.nameSequence(input), input);
    }
}
