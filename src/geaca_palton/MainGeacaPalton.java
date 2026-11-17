package geaca_palton;
import comun.GestiuneStocPret;
import comun.Imbracaminte;

public class MainGeacaPalton {
    public static void main(String[] args){
        Imbracaminte articol=new Imbracaminte();
        Geaca geaca=new Geaca();
        Palton palton=new Palton();

        //Test Imbracaminte
        articol.aplicaReducere(10);
        System.out.println("Disponibilitate (3 buc): " + articol.verificaDisponibilitate(3));

        //Test Geaca
        geaca.aplicaReducere(20);
        System.out.println("Disponibilitate (2 buc): " + geaca.verificaDisponibilitate(2));

        //Test Palton
        palton.aplicaReducere(30);
        System.out.println("Disponibilitate (1 buc): " + palton.verificaDisponibilitate(1));
    }
}
