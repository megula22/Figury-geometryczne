package com.company;

public class StudentInformatyki extends Student {
    private double ocena;
    public StudentInformatyki (String imię, String nazwisko, String dataUrodzenia, int rokStudiów, String kierunekStudiów, double ocena){
        super(imię, nazwisko, dataUrodzenia, rokStudiów, kierunekStudiów);
        this.ocena = ocena;
    }
    public String toString(){
        return this.getImię() + ";" + this.getNazwisko() + ";" + this.getDataUrodzenia() + ";" + this.getKierunekStudiów() + ";" + this.getOcena();
    }

    public int getRokStudiów() {
        return super.getRokStudiów();
    }

    public double getOcena() {
        return ocena;
    }
}
