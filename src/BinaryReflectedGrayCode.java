import java.util.ArrayList;
import java.util.Collections;

import javax.swing.SortingFocusTraversalPolicy;

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
        String[] split2;
        for (int i = 0; i < arr.size() - 1; i++) {
            split = arr.get(i).split("");
            split2 = arr.get(i + 1).split("");
            if (!split[Alice].equals(split2[Alice])) {
                orderedList.add("Alice");
            } else if (!split[Bob].equals(split2[Bob])) {
                orderedList.add("Bob");
            } else if (!split[Chris].equals(split2[Chris])) {
                orderedList.add("Chris");
            } else if (!split[Dylan].equals(split2[Dylan])) {
                orderedList.add("Dylan");
            }

        }
        return orderedList;

    }

    public void grayCodesAreFun(ArrayList<String> names, ArrayList<String> GC) {
        System.out.println("Index, Gray Code, Child(ren) in Photo, Action");
        int counterA = 0;
        int counterB = 0;
        int counterC = 0;
        int counterD = 0;
        ArrayList<String> photoList = new ArrayList<>();
        ArrayList<String> actionList = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            System.out.print(i + " | ");
            System.out.print(GC.get(i + 1) + " | ");
            if (names.get(i).equals("Alice")) {
                counterA++;
                if (counterA % 2 != 0) {
                    photoList.add(names.get(i));
                    actionList.add(names.get(i) + " In");
                } else {
                    photoList.remove(names.get(i));
                    actionList.add(names.get(i) + " Out");
                }
            }
            if (names.get(i).equals("Bob")) {
                counterB++;
                if (counterB % 2 != 0) {
                    photoList.add(names.get(i));
                    actionList.add(names.get(i) + " In");
                } else {
                    photoList.remove(names.get(i));
                    actionList.add(names.get(i) + " Out");
                }
            }
            if (names.get(i).equals("Chris")) {
                counterC++;
                if (counterC % 2 != 0) {
                    photoList.add(names.get(i));
                    actionList.add(names.get(i) + " In");
                } else {
                    photoList.remove(names.get(i));
                    actionList.add(names.get(i) + " Out");
                }
            }
            if (names.get(i).equals("Dylan")) {
                counterD++;
                if (counterD % 2 != 0) {
                    photoList.add(names.get(i));
                    actionList.add(names.get(i) + " In");
                } else {
                    photoList.remove(names.get(i));
                    actionList.add(names.get(i) + " Out");
                }
            }

            for (int j = 0; j < photoList.size(); j++) {
                System.out.print(photoList.get(j));
                if (j != photoList.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print(" | ");
            for (int k = 0; k < actionList.size(); k++) {
                System.out.print(actionList.get(k));
                if (k != actionList.size() - 1) {
                    System.out.print(", ");
                }

            }
            System.out.println("");
            actionList.clear();

        }
    }

}
