package tricou_camasa;

import comun.Imbracaminte;

public class Camasa extends Imbracaminte {
    private boolean eleganta;
    private boolean manecaLunga;
    private String tipGuler;
    private String croiala;

    public Camasa() {
        super();
        this.eleganta = false;
        this.manecaLunga = false;
        this.tipGuler = "necunoscut";
        this.croiala = "necunoscut";
    }

    public Camasa(String brand, String marime, String culoare, String material, double pret, int stoc, boolean eleganta, boolean manecaLunga, String tipGuler, String croiala) {
        super(brand, marime, culoare, material, pret, stoc);
        this.eleganta = eleganta;
        this.manecaLunga = manecaLunga;
        this.tipGuler = tipGuler;
        this.croiala = croiala;
    }

    public Camasa(Camasa c) {
        super(c);
        this.eleganta = c.eleganta;
        this.manecaLunga = c.manecaLunga;
        this.tipGuler = c.tipGuler;
        this.croiala = c.croiala;
    }

    public boolean isEleganta() {
        return eleganta;
    }

    public void setEleganta(boolean eleganta) {
        this.eleganta = eleganta;
    }

    public boolean isManecaLunga() {
        return manecaLunga;
    }

    public void setManecaLunga(boolean manecaLunga) {
        this.manecaLunga = manecaLunga;
    }

    public String getTipGuler() {
        return tipGuler;
    }

    public void setTipGuler(String tipGuler) {
        this.tipGuler = tipGuler;
    }

    public String getCroiala() {
        return croiala;
    }

    public void setCroiala(String croiala) {
        this.croiala = croiala;
    }

    @Override
    public String toString() {
        return "Camasa - " + super.toString() + ", Eleganta: " + (eleganta ? "da" : "nu") + ", Maneca lunga: " + (manecaLunga ? "da" : "nu") + ", Guler: " + tipGuler + ", Croiala: " + croiala;
    }
}
