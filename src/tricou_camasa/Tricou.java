package tricou_camasa;

import comun.Imbracaminte;

public class Tricou extends Imbracaminte {
    private boolean areImprimeu;
    private boolean manecaScurta;
    private String tipGuler;
    private String croiala;

    public Tricou() {
        super();
        this.areImprimeu = false;
        this.manecaScurta = false;
        this.tipGuler = "necunoscut";
        this.croiala = "necunoscut";
    }

    public Tricou(String brand, String marime, String culoare, String material, double pret, int stoc, boolean areImprimeu, boolean manecaScurta, String tipGuler, String croiala) {
        super(brand, marime, culoare, material, pret, stoc);
        this.areImprimeu = areImprimeu;
        this.manecaScurta = manecaScurta;
        this.tipGuler = tipGuler;
        this.croiala = croiala;
    }

    public Tricou(Tricou t) {
        super(t);
        this.areImprimeu = t.areImprimeu;
        this.manecaScurta = t.manecaScurta;
        this.tipGuler = t.tipGuler;
        this.croiala = t.croiala;
    }

    public boolean isAreImprimeu() {
        return areImprimeu;
    }

    public void setAreImprimeu(boolean areImprimeu) {
        this.areImprimeu = areImprimeu;
    }

    public boolean isManecaScurta() {
        return manecaScurta;
    }

    public void setManecaScurta(boolean manecaScurta) {
        this.manecaScurta = manecaScurta;
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
        return "Tricou - " + super.toString() + ", Imprimeu: " + (areImprimeu ? "da" : "nu") + ", Maneca scurta: " + (manecaScurta ? "da" : "nu") + ", Guler: " + tipGuler + ", Croiala: " + croiala;
    }
}
