package fusta_pantalon;
import comun.Imbracaminte;
public class MainFustaPantaloni {
    public static void main(String[] args) {
        Imbracaminte articol=new Imbracaminte();
        Pantalon pantalon = new Pantalon();
        Fusta fusta = new Fusta();
        //Test Imbracaminte cu procentul de reducere si verificare stoc
        articol.aplicaReducere(20);
        System.out.println("Disponibilitate (20 buc): " + articol.verificaDisponibilitate(3));
        // Test Pantalon cu procentul de reducere și verificare stoc
        pantalon.aplicaReducere(30);
        System.out.println("Disponibilitate (5 buc): " + pantalon.verificaDisponibilitate(2));
        System.out.println("----------------------------------");
        // Test Fusta cu procentul de reducere și verificare stoc
        fusta.aplicaReducere(10);
        System.out.println("Disponibilitate (7 buc): " + fusta.verificaDisponibilitate(4));
    }
}
