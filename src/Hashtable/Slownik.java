package Hashtable;

import java.util.*;

public class Slownik {
    public static void main(String[] args) {
        HashMap<String, List<String>> słownik = new HashMap<>();
        List<String> angielskie = new ArrayList<String>();
        angielskie.add("peace");
        angielskie.add("room");
        słownik.put("pokój", angielskie);
        słownik.put("zamek", Arrays.asList("castle", "lock"));
        for (Map.Entry <String, List<String>> wpis : słownik.entrySet()){
            System.out.println("Słowo: " + wpis.getKey() + ": ");
            for(String ang : wpis.getValue())
                System.out.println(ang + ", ");
            System.out.println();
        }

    }


}
