package tricou_camasa;

import comun.Imbracaminte;

public class Tricou extends Imbracaminte {
    @Override
    public void aplicaReducere(double procent) {
        System.out.println("S-a aplicat o reducere de " + procent + "% la tricou.");
    }
}
