package rozgrzewka;

import java.util.ArrayList;
import java.util.List;

public class zadaniaDodatkowe {

    public static void main(String[] args) {
        int[] tab = {1, 5, 3, 5, 9, 1};

        List<String> stringList = new ArrayList<>();

        stringList.add("Tomek");
        stringList.add("Marysia");
        stringList.add("Mieczyslaw");
        stringList.add("Ola");

        second(tab);
        System.out.println("================================");
        printNumbers(tab, "odd");

        System.out.println("================================");
        List<String> longestStrings = longestString(stringList);

        for (String longestString : longestStrings) {
            System.out.println(longestString);
        }


    }

    public static void second(int[] tab) {
        for (int i = 0; i < tab.length; i++) {

            if (i % 2 == 0) {
                System.out.println(tab[i]);
            }
        }


    }

    public static void printNumbers(int[] tab, String s) {
        if (s.equals("odd")) {
            for (int i = 0; i < tab.length; i++) {
                if (i % 2 != 0) {
                    System.out.println(tab[i]);
                }
            }
        } else if (s.equals("even")) {
            for (int i = 0; i < tab.length; i++) {
                if (i % 2 == 0) {
                    System.out.println(tab[i]);
                }
            }
        }
    }

    public static List longestString(List<String> stringList) {
        List<String> longestStrings = new ArrayList<>();
        String longStr = stringList.get(0);
        int index = 0;
        while (index <= 1){
            longStr = stringList.get(0);
        for (String s : stringList) {
            if (s.length() > longStr.length()) {
                longStr = s;


            }
        }

        longestStrings.add(longStr);
        stringList.remove(longStr);
        index++;
    }
    return longestStrings;
}
}





