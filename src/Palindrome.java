
public class Palindrome {

    Palindrome() {

    }

    public boolean palindromeCheck(String input, int index) {

        String filteredInput = input.toLowerCase().replaceAll("\\s", "").replaceAll("\\p{Punct}", "");
        String[] split = filteredInput.split("");
        if (input.length() == 0 || input.length() == 1) {
            return true;
        } else if (split[index] == split[split.length - index]) {

            return palindromeCheck(input, index + 1);
        } else {
            return false;
        }

        // return true;
    }
}
