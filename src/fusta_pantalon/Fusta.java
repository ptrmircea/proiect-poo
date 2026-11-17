package fusta_pantalon;
import comun.Imbracaminte;
public class Fusta extends Imbracaminte {
    @Override
    public void aplicaReducere(double procent) {
        System.out.println("Se aplica o reducere de " + procent + "% la fusta.");
    }
    @Override
    public boolean verificaDisponibilitate(int cantitateDorita) {
        return true;
    }
}
