package pulovar_cardigan;
import comun.Imbracaminte;

public class Cardigan extends Imbracaminte {
    private int nrNasturi;
    private String tipInchidere;
    private String lungime;
    private boolean areGluga;
    private String culoareCaptuseala;

    public Cardigan() {
        super();
        this.nrNasturi = 0;
        this.tipInchidere ="necunoscuta";
        this.lungime = "necunoscuta";
        this.areGluga = false;
        this.culoareCaptuseala = "necunoscuta";
    }

    // constr cu tt arg (6 pt Imbracaminte + 5 proprii)
    public Cardigan(String brand, String marime, String culoare, String material, double pret, int stoc,
                    int nrNasturi, String tipInchidere, String lungime, boolean areGluga, String culoareCaptuseala) {
        super(brand, marime, culoare, material, pret, stoc);
        this.nrNasturi = nrNasturi;
        this.tipInchidere = tipInchidere;
        this.lungime = lungime;
        this.areGluga = areGluga;
        this.culoareCaptuseala = culoareCaptuseala;
    }

    public Cardigan(Cardigan c) {
        super(c);
        this.nrNasturi = c.nrNasturi;
        this.tipInchidere = c.tipInchidere;
        this.lungime = c.lungime;
        this.areGluga = c.areGluga;
        this.culoareCaptuseala = c.culoareCaptuseala;
    }

    public int getNrNasturi() {
        return nrNasturi;
    }
    public void setNrNasturi(int nrNasturi) {
        this.nrNasturi = nrNasturi;
    }

    public String getTipInchidere() {
        return tipInchidere;
    }
    public void setTipInchidere(String tipInchidere) {
        this.tipInchidere = tipInchidere;
    }

    public String getLungime() {
        return lungime;
    }
    public void setLungime(String lungime) {
        this.lungime = lungime;
    }

    public boolean isAreGluga() {
        return areGluga;
    }
    public void setAreGluga(boolean areGluga) {
        this.areGluga = areGluga;
    }

    public String getCuloareCaptuseala() {
        return culoareCaptuseala;
    }
    public void setCuloareCaptuseala(String culoareCaptuseala) {
        this.culoareCaptuseala = culoareCaptuseala;
    }


    @Override
    public String toString() {
        return "Cardigan - " + super.toString() + ", Nasturi: " + nrNasturi + ", Inchidere: " + tipInchidere
                + ", Lungime: " + lungime + ", Gluga: " + (areGluga ? "da" : "nu")
                + ", Captuseala: " + culoareCaptuseala;
    }
}