package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Klasa Sklep służy do tworzenia sklepu na potrzeby programu obsługującego osoby
 * @author Gosia Kielik
 * @bersion 1.0
 * @since   2019-02-02
 */
public class Sklep {        //dokumentacja z komentarzy zielonych
    private String nazwa;
    private double utarg;
    private List<Towar> towaryWSklepie;

    /**
     * Konstruktor bezparametrowy
     */
    public Sklep() {
        nazwa = "supersklep";
        utarg = 0;
        towaryWSklepie = new ArrayList<>();
    }

    /**
     * Konstruktor umożliwiający nadawanie nazwy sklepowi
     *
     * @param nazwa nazwa sklepu
     */
    public Sklep(String nazwa) {
        this.nazwa = nazwa;
        utarg = 0;
        towaryWSklepie = new ArrayList<>();
    }

    public double dodajUtarg(double kwota) {
        utarg += kwota;
        return utarg;
    }

    /**
     * Metedo pobiera nazwę sklepu @link Sklep#utarg
     *
     * @return nazwa sklepu
     */
    public String getNazwaSklepu() {
        return nazwa;
    }

    public void załadujTowary() {
        Towar t1 = new Towar("buty zamszowe 42", 156.78);
        Towar t2 = new Towar("buty robocze 40", 77.00);
        towaryWSklepie.add(t1);
        towaryWSklepie.add(t2);
    }

    public List<Towar> getListaTowary() {   //wyświetlanie listy towarów komuś, zadeklarowanie w nowej Arrayliście
        List<Towar> nowa = new ArrayList<>();   //
        for (Towar towar : towaryWSklepie) {  //
            Towar nowy = new Towar(towar.nazwa, towar.cena);       //w pętli do nowego obiektu przekazać nazwę i cenę, żeby jak ktoś dokona zmiany to ona nie przejdzie
            nowa.add(nowy);
        }
        return nowa;
    }

public void wczytajTowary() {
    towaryWSklepie = new ArrayList<>();
    String plik = nazwa + ".txt";
    System.out.println("Czytam towary z pliku: <<" + plik + "<<");
    File file = new File(plik);
    if (file.exists())
        System.out.println("Nie ma pliku: " + plik);
        try {
        Scanner skan = new Scanner(file);
        while (skan.hasNextLine()) {
            String linia = skan.nextLine();
            String[] wyrazy = linia.split(";");
            double cena = Double.parseDouble(wyrazy[1]);
            Towar nowy = new Towar(wyrazy[0], cena);
            towaryWSklepie.add(nowy);
        }
        skan.close();
    }
    catch (FileNotFoundException ex)
    {
        System.out.println(ex.getMessage());
    }
    catch (Exception exc)
    {
        System.out.println("Błąd czytania: " + exc.getMessage());
    }



        {
            System.out.println("Plik z towarami istnieje!");
        }
    }
    public void wyświetlTowaryWSklepie () {
        for (Towar towar : towaryWSklepie)
            System.out.println("W sklepie: " + towar.toString());
    }

}
