package geaca_palton;
import comun.Imbracaminte;
public class Geaca extends Imbracaminte{
    private String tipGeaca;
    private boolean areGluga;
    private boolean impermeabila;
    private String sezon;
    private int numarBuzunare;

    public Geaca() {
        super();
        this.tipGeaca = "necunoscut";
        this.areGluga = false;
        this.impermeabila = false;
        this.sezon = "necunoscut";
        this.numarBuzunare = 0;
    }

    public Geaca(String brand, String marime, String culoare, String material, double pret, int stoc,
                 String tipGeaca, boolean areGluga, boolean impermeabila, String sezon, int numarBuzunare) {
        super(brand, marime, culoare, material, pret, stoc);
        this.tipGeaca = tipGeaca;
        this.areGluga = areGluga;
        this.impermeabila = impermeabila;
        this.sezon = sezon;
        this.numarBuzunare = numarBuzunare;
    }

    public Geaca(Geaca g) {
        super(g);
        this.tipGeaca = g.tipGeaca;
        this.areGluga = g.areGluga;
        this.impermeabila = g.impermeabila;
        this.sezon = g.sezon;
        this.numarBuzunare = g.numarBuzunare;
    }

    public String getTipGeaca() {
        return tipGeaca;
    }
    public void setTipGeaca(String tipGeaca) {
        this.tipGeaca = tipGeaca;
    }
    public boolean isAreGluga() {
        return areGluga;
    }
    public void setAreGluga(boolean areGluga) {
        this.areGluga = areGluga;
    }
    public boolean isImpermeabila() {
        return impermeabila;
    }
    public void setImpermeabila(boolean impermeabila) {
        this.impermeabila = impermeabila;
    }
    public String getSezon() {
        return sezon;
    }
    public void setSezon(String sezon) {
        this.sezon = sezon;
    }
    public int getNumarBuzunare() {
        return numarBuzunare;
    }
    public void setNumarBuzunare(int numarBuzunare) {
        this.numarBuzunare = numarBuzunare;
    }

    @Override
    public void aplicaReducere(double procent) {
        super.aplicaReducere(procent);
        System.out.println("Se aplica o reducere de " + procent + "% la geaca.Pret nou: "+getPret()+" lei");
    }
    @Override
    public String toString() {
        return super.toString() + ", Tip geaca: " + tipGeaca + ", Are gluga: " + (areGluga ? "Da" : "Nu") +
                ", Impermeabila: " + (impermeabila ? "Da" : "Nu") + ", Sezon: " + sezon + ", Nr. buzunare: " + numarBuzunare;
    }
}
