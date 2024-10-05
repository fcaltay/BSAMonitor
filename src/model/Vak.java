package model;

/**
 * @author Furkan Altay
 * Purpose for the class
 */
public class Vak {
    private String naam;
    private double punten;
    private double cesuur;

    public Vak(String naam, double punten, double cesuur) {
        this.naam = naam;
        this.punten = punten;
        this.cesuur = cesuur;
    }

    public String getNaam() {
        return naam;
    }

    public double getPunten() {
        return punten;
    }

    public double getCesuur() {
        return cesuur;
    }

    public void setPunten(double punten) {
        this.punten = punten;
    }
}
