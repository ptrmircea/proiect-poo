package fusta_pantalon;
import comun.Imbracaminte;
public class Pantalon extends Imbracaminte{
    @Override
    public void aplicaReducere(double procent) {
        System.out.println("Se aplica o reducere de " + procent + "% la " + "pantalon.");
    }
    @Override
    public boolean verificaDisponibilitate(int cantitateDorita) {
        return true;
    }
}