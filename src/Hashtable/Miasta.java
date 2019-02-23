package Hashtable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Miasta {
    public static void main(String[] args) {
        Hashtable<String, Integer> miasta = new Hashtable<>();
        miasta.put("Poznań", 500000);
        miasta.put("Berlin", 1700000);
        miasta.put("Praga", 600000);
        miasta.put("Wilno", 650000);
        miasta.put("Bratysława", 700000);

        Hashtable<String, String> miastaKraje = new Hashtable<>();
        miastaKraje.put("Polska", "Poznań");
        miastaKraje.put("Niemcy", "Berlin");
        miastaKraje.put("Czechy", "Praga");
        miastaKraje.put("Litwa", "Wilno");
        miastaKraje.put("Słowacja", "Bratysława");

        for(Map.Entry<String,String> wpis : miastaKraje.entrySet()){
            String miasto = wpis.getValue();
            System.out.println("Miasto: " + miasto);
            for(Map.Entry<String, Integer> wpis2 : miasta.entrySet())
                if (wpis2.getKey().equals(miasto))
                    System.out.println("Kraj= " + wpis.getKey() + " miasto= " + wpis.getValue() + " " + wpis2.getValue());

        }


    }
}
