package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Tree {
    public static void main(String[] args) {

        TreeSet<Osoba> osoby = new TreeSet<Osoba>(new NazwiskoComparator());
        osoby.add(new Osoba("Jan", "Kowalski", "1980-11-02"));
        osoby.add(new Osoba("Anna", "Zamojska", "1988-03-02"));
        osoby.add(new Osoba("Janina", "Kot", "1988-04-02"));
        osoby.add(new Osoba("Antoni", "Robak", "1995-12-02"));


        for (Osoba o : osoby)
            System.out.println(o);
            System.out.println();


        TreeSet<Osoba> treeSet2 = new TreeSet<Osoba> (new ImieComparator());
        treeSet2.addAll(osoby);
        for (Osoba o : treeSet2)
            System.out.println(o);


    }

    }


