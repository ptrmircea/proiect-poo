package comun;

public class Imbracaminte implements GestiuneStocPret {
    @Override
    public void aplicaReducere(double procent){
        System.out.println("Se aplica o reducere de " + procent + "% la articol.");
    }
    @Override
    public boolean verificaDisponibilitate(int cantitateDorita){
        return false;
    }
}
