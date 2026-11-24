package pulovar_cardigan;

import comun.Imbracaminte;

public class Pulovar extends Imbracaminte {
    private String tipGuler;
    private String grosime;
    private double compozitieLana;   // procent de lana, 0-100
    private String anotimp;
    private boolean esteUnisex;

    public Pulovar() {
        super();
        this.tipGuler = "necunoscut";
        this.grosime = "necunoscuta";
        this.compozitieLana = 0;
        this.anotimp ="necunoscut";
        this.esteUnisex = false;
    }

    // constr cu tt arg (6 pt imbracaminte + 5 proprii)
    public Pulovar(String brand, String marime, String culoare, String material, double pret, int stoc,
                   String tipGuler, String grosime, double compozitieLana, String anotimp, boolean esteUnisex) {
        super(brand, marime, culoare, material, pret, stoc);
        this.tipGuler = tipGuler;
        this.grosime = grosime;
        this.compozitieLana = compozitieLana;
        this.anotimp = anotimp;
        this.esteUnisex = esteUnisex;
    }

    public Pulovar(Pulovar p) {
        super(p);
        this.tipGuler = p.tipGuler;
        this.grosime = p.grosime;
        this.compozitieLana = p.compozitieLana;
        this.anotimp = p.anotimp;
        this.esteUnisex = p.esteUnisex;
    }

    public String getTipGuler() {
        return tipGuler;
    }
    public void setTipGuler(String tipGuler) {
        this.tipGuler = tipGuler;
    }

    public String getGrosime() {
        return grosime;
    }
    public void setGrosime(String grosime) {
        this.grosime = grosime;
    }

    public double getCompozitieLana() {
        return compozitieLana;
    }
    public void setCompozitieLana(double compozitieLana) {
        this.compozitieLana = compozitieLana;
    }

    public String getAnotimp() {
        return anotimp;
    }
    public void setAnotimp(String anotimp) {
        this.anotimp = anotimp;
    }

    public boolean isEsteUnisex() {
        return esteUnisex;
    }
    public void setEsteUnisex(boolean esteUnisex) {
        this.esteUnisex = esteUnisex;
    }

    @Override
    public String toString() {
        return "Pulovar - " + super.toString() + ", Guler: " + tipGuler + ", Grosime: " + grosime
                + ", Lana: " + compozitieLana + "%, Anotimp: " + anotimp
                + ", Unisex: " + (esteUnisex ? "da" : "nu");
    }
}