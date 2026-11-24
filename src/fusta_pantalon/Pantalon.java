package fusta_pantalon;
import comun.Imbracaminte;
public class Pantalon extends Imbracaminte {
    private boolean cuCurea;
    private boolean cuBuzunare;
    private String model;
    private String talie;
    public Pantalon() {
        super();
        this.cuCurea = false;
        this.cuBuzunare = false;
        this.model = "necunoscut";
        this.talie = "necunoscut";
    }
    public Pantalon(String brand, String marime, String culoare, String material, double pret, int stoc, boolean cuCurea, boolean cuBuzunare, String model, String talie) {
        super(brand, marime, culoare, material, pret, stoc);
        this.cuCurea = cuCurea;
        this.cuBuzunare = cuBuzunare;
        this.model = model;
        this.talie = talie;
    }
    public Pantalon(Pantalon p) {
        super(p);
        this.cuCurea = p.cuCurea;
        this.cuBuzunare = p.cuBuzunare;
        this.model = p.model;
        this.talie = p.talie;
    }
    public boolean isCuCurea() {
        return cuCurea;
    }
    public void setCuCurea(boolean cuCurea) {
        this.cuCurea = cuCurea;
    }
    public boolean isCuBuzunare() {
        return cuBuzunare;
    }
    public void setCuBuzunare(boolean cuBuzunare) {
        this.cuBuzunare = cuBuzunare;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getTalie() {
        return talie;
    }
    public void setTalie(String talie) {
        this.talie = talie;
    }
    @Override
    public String toString() {
        return "Pantalon - " + super.toString() + ", Curea: " + (cuCurea ? "da" : "nu") + ", Buzunare: " + (cuBuzunare ? "da" : "nu") + ", Model: " + model + ", Talie: " + talie;
    }
}