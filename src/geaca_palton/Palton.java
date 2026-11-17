package geaca_palton;
import comun.Imbracaminte;
public class Palton extends Imbracaminte {
    @Override
    public void aplicaReducere(double procent) {
        System.out.println("Se aplica o reducere de " + procent + "% la palton.");
    }
    @Override
    public boolean verificaDisponibilitate(int cantitateDorita) {
        return true;
    }
}
