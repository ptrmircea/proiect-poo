package pulovar_cardigan;
import comun.Imbracaminte;

public class Pulovar extends Imbracaminte {
    @Override
    public void aplicaReducere(double procent) {
        System.out.println("Se aplica o reducere de " + procent + "% la pulovar");
    }
    @Override
    public boolean verificaDisponibilitate(int cantitateDorita) {
        return true;
    }
}
