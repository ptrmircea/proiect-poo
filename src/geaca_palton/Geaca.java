package geaca_palton;
import comun.Imbracaminte;
public class Geaca extends Imbracaminte{
    @Override
    public void aplicaReducere(double procent) {
        System.out.println("Se aplica o reducere de " + procent + "% la geaca.");
    }
    @Override
    public boolean verificaDisponibilitate(int cantitateDorita) {
        return true;
    }
}
