package fusta_pantalon;
import comun.Imbracaminte;
public class Fusta extends Imbracaminte {
    private boolean cuFermoar;
    private boolean captusita;
    private String lungime;
    private String tipCroi;
    public Fusta() {
        super();
        this.cuFermoar = false;
        this.captusita = false;
        this.lungime = "necunoscut";
        this.tipCroi = "necunoscut";
    }
    public Fusta(String brand, String marime, String culoare, String material, double pret, int stoc, boolean cuFermoar, boolean captusita, String lungime, String tipCroi) {
        super(brand, marime, culoare, material, pret, stoc);
        this.cuFermoar = cuFermoar;
        this.captusita = captusita;
        this.lungime = lungime;
        this.tipCroi = tipCroi;
    }
    public Fusta(Fusta f) {
        super(f);
        this.cuFermoar = f.cuFermoar;
        this.captusita = f.captusita;
        this.lungime = f.lungime;
        this.tipCroi = f.tipCroi;
    }
    public boolean isCuFermoar() {
        return cuFermoar;
    }
    public void setCuFermoar(boolean cuFermoar) {
        this.cuFermoar = cuFermoar;
    }
    public boolean isCaptusita() {
        return captusita;
    }
    public void setCaptusita(boolean captusita) {
        this.captusita = captusita;
    }
    public String getLungime() {
        return lungime;
    }
    public void setLungime(String lungime) {
        this.lungime = lungime;
    }
    public String getTipCroi() {
        return tipCroi;
    }
    public void setTipCroi(String tipCroi) {
        this.tipCroi = tipCroi;
    }
    @Override
    public String toString() {
        return "Fusta - " + super.toString() + ", Fermoar: " + (cuFermoar ? "da" : "nu") + ", Captusita: " + (captusita ? "da" : "nu") + ", Lungime: " + lungime + ", Croi: " + tipCroi;
    }
}
