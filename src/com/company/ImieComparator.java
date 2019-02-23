package com.company;

import java.util.Comparator;

public class ImieComparator implements Comparator<Osoba> {
    public  ImieComparator (){}
    @Override
    public  int compare (Osoba o1, Osoba o2){
        return o1.getImię().compareTo(o2.getImię());
    }
}
