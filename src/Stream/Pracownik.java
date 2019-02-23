package Stream;

import java.time.LocalDate;

public class Pracownik {
    private String imię;
    private String nazwisko;
    private Double pensja;
    private LocalDate dataUrodzenia;

    public Pracownik(String imię, String nazwisko, Double pensja, String dataUrodzenia) {
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.pensja = pensja;
        this.dataUrodzenia = LocalDate.parse(dataUrodzenia);
    }

    public String getImię() {
        return imię;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public Double getPensja() {
        return pensja;
    }

    public LocalDate getDataUrodzenia(){
        return dataUrodzenia;
    }
    @Override
    public String toString(){
        return this.getImię() + ";" + this.getNazwisko() + ";" + this.getPensja() + ";" + this.getDataUrodzenia();
    }
}