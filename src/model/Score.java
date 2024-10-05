package model;

/**
 * @author Furkan Altay
 * Purpose for the class
 */
public class Score {
    private String vak;
    private double cijfer;
    private  double behaaldePunten = 0.0;

    public Score(String vak, double cijfer) {
        this.vak = vak;
        this.cijfer = cijfer;
    }

    public String getVak() {
        return vak;
    }

    public double getCijfer() {
        return cijfer;
    }

    public double getBehaaldePunten() {
        return behaaldePunten;
    }

    public void setBehaaldePunten(double behaaldePunten) {
        this.behaaldePunten = behaaldePunten;
    }

    public void setCijfer(double cijfer) {
        this.cijfer = cijfer;
    }
}
