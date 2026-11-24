package geaca_palton;
import comun.Imbracaminte;
public class Palton extends Imbracaminte {
    private String lungime;
    private String croiala;
    private boolean areCordon;
    private int numarNasturi;
    private boolean captusit;

    public Palton() {
        super();
        this.lungime = "necunoscut";
        this.croiala = "necunoscut";
        this.areCordon = false;
        this.numarNasturi = 0;
        this.captusit = false;
    }

    public Palton(String brand, String marime, String culoare, String material, double pret, int stoc,
                  String lungime, String croiala, boolean areCordon, int numarNasturi, boolean captusit) {
        super(brand, marime, culoare, material, pret, stoc);
        this.lungime = lungime;
        this.croiala = croiala;
        this.areCordon = areCordon;
        this.numarNasturi = numarNasturi;
        this.captusit = captusit;
    }

    public Palton(Palton p) {
        super(p);
        this.lungime = p.lungime;
        this.croiala = p.croiala;
        this.areCordon = p.areCordon;
        this.numarNasturi = p.numarNasturi;
        this.captusit = p.captusit;
    }

    public String getLungime() {
        return lungime;
    }
    public void setLungime(String lungime) {
        this.lungime = lungime;
    }
    public String getCroiala() {
        return croiala;
    }
    public void setCroiala(String croiala) {
        this.croiala = croiala;
    }
    public boolean isAreCordon() {
        return areCordon;
    }
    public void setAreCordon(boolean areCordon) {
        this.areCordon = areCordon;
    }
    public int getNumarNasturi() {
        return numarNasturi;
    }
    public void setNumarNasturi(int numarNasturi) {
        this.numarNasturi = numarNasturi;
    }
    public boolean isCaptusit() {
        return captusit;
    }
    public void setCaptusit(boolean captusit) {
        this.captusit = captusit;
    }

    @Override
    public void aplicaReducere(double procent) {
        super.aplicaReducere(procent);
        System.out.println("Se aplica o reducere de " + procent + "% la palton. Pret nou:"+ getPret()+" lei");
    }
    @Override
    public String toString() {
        return super.toString() + ", Lungime: " + lungime + ", Croiala: " + croiala +
                ", Are cordon: " + (areCordon ? "Da" : "Nu") + ", Nr. nasturi: " + numarNasturi +
                ", Captusit: " + (captusit ? "Da" : "Nu");
    }
}
