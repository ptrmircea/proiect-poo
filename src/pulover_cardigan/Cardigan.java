package pulover_cardigan;

import comun.Imbracaminte;

public class Cardigan extends Imbracaminte {
    @Override
    public void aplicaReducere(double procent) {
        System.out.println("Se aplica o reducere de " + procent + "% la cardigan");
    }
    @Override
    public boolean verificaDisponibilitate(int cantitateDorita) {
        return true;
    }
}
