package pulover_cardigan;
import comun.Imbracaminte;

public class MainPulovarCardigan {
    public static void main(String[] args) {
        //creare obiecte cu constr. fara param.
        Imbracaminte articol = new Imbracaminte();
        Pulovar pulovar = new Pulovar();
        Cardigan cardigan = new Cardigan();

        //test Imbracaminte
        articol.aplicaReducere(15);
        System.out.println("disponibilitate 5 bucati: " + articol.verificaDisponibilitate(5));
        //test Pulovar
        pulovar.aplicaReducere(25);
        System.out.println("disponibilitate 4 bucati: " + pulovar.verificaDisponibilitate(4));
        //test Cardigan
        cardigan.aplicaReducere(50);
        System.out.println("disponibilitate 2 bucati : " + cardigan.verificaDisponibilitate(2));
    }
}