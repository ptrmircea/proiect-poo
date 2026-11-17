package tricou_camasa;

import comun.Imbracaminte;

public class MainTricouCamasa {
    public static void main(String[] args) {
        Tricou tricou = new Tricou();
        Camasa camasa = new Camasa();
        Imbracaminte articol = new Imbracaminte();

        tricou.aplicaReducere(3);
        System.out.println("Verificare stoc tricouri (1 buc): " + tricou.verificaDisponibilitate(1));

        camasa.aplicaReducere(10);
        System.out.println("Verificare stoc camasi (1 buc): " + camasa.verificaDisponibilitate(1));

        articol.aplicaReducere(2);
        System.out.println("Verificare stoc articole (1 buc): " + articol.verificaDisponibilitate(1));
    }
}
