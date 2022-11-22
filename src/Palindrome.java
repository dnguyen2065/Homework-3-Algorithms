import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Palindrome {

    public boolean palindromeCheck(String input, int index) {

        String filteredInput = input.toLowerCase().replaceAll("\\s", "").replaceAll("\\p{Punct}", "");
        String[] split = filteredInput.split("");
        List<String> splitList = new LinkedList<String>(Arrays.asList(split));
        String string = "";
        if (splitList.size() == 1 || splitList.size() == 0) {
            return true;
        } else if (splitList.get(index).equals(splitList.get((splitList.size() - 1) - index))) {
            splitList.remove(index);
            splitList.remove((splitList.size() - 1) - index);
            string = splitList.toString();
            return palindromeCheck(string, index);
        } else {
            return false;
        }
    }
}
