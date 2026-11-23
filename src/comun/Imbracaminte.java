package comun;

public class Imbracaminte implements GestiuneStocPret {
    private String brand;
    private String marime;
    private String culoare;
    private String material;
    private double pret;
    private int stoc;

    public Imbracaminte() {
        this.brand = "necunoscut";
        this.marime = "M";
        this.culoare = "necunoscut";
        this.material = "necunoscut";
        this.pret = 0;
        this.stoc = 0;
    }

    public Imbracaminte(String brand, String marime, String culoare, String material, double pret, int stoc) {
        this.brand = brand;
        this.marime = marime;
        this.culoare = culoare;
        this.material = material;
        this.pret = pret;
        this.stoc = stoc;
    }

    public Imbracaminte(Imbracaminte i) {
        this.brand = i.brand;
        this.marime = i.marime;
        this.culoare = i.culoare;
        this.material = i.material;
        this.pret = i.pret;
        this.stoc = i.stoc;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMarime() {
        return marime;
    }

    public void setMarime(String marime) {
        this.marime = marime;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public int getStoc() {
        return stoc;
    }

    public void setStoc(int stoc) {
        this.stoc = stoc;
    }

    @Override
    public void aplicaReducere(double procent) {
        pret = pret * (1 - procent / 100);
    }

    @Override
    public boolean verificaDisponibilitate(int cantitateDorita) {
        return stoc >= cantitateDorita;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Marime: " + marime + ", Culoare: " + culoare + ", Material: " + material + ", Pret: " + pret + " lei, Stoc: " + stoc + " buc.";
    }
}
