import java.util.ArrayList;
import java.util.Collections;

public class BinaryReflectedGrayCode {
    public ArrayList<String> BRCG(int n) {
        ArrayList<String> L = new ArrayList<>();
        ArrayList<String> L1 = new ArrayList<>();
        ArrayList<String> L2 = new ArrayList<>();
        if (n == 1) {

            L.add("0");
            L.add("1");
        } else {

            L1 = BRCG(n - 1);
            for (int i = L1.size() - 1; i >= 0; i--) {
                L2.add(L1.get(i));
            }
            for (int i = 0; i < L1.size(); i++) {
                L1.set(i, "0" + L1.get(i));
            }
            for (int j = 0; j < L2.size(); j++) {
                L2.set(j, "1" + L2.get(j));
            }
            L.addAll(L1);
            L.addAll(L2);

        }
        return L;
    }

    public ArrayList<String> nameSequence(ArrayList<String> arr) {
        ArrayList<String> orderedList = new ArrayList<>();
        int Alice = 3;
        int Bob = 2;
        int Chris = 1;
        int Dylan = 0;
        String[] split;
        for (int i = 0; i < arr.size(); i++) {
            split = arr.get(i).split("");
            if (split[Alice].equals("1")) {
                orderedList.add("Alice");
            } else if (split[Bob].equals("1")) {
                orderedList.add("Bob");
            } else if (split[Chris].equals("1")) {
                orderedList.add("Chris");
            } else if (split[Dylan].equals("1")) {
                orderedList.add("Dylan");
            }

        }
        return orderedList;

    }

}
