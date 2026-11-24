package tricou_camasa;

import comun.Imbracaminte;

public class MainTricouCamasa {
    public static void main(String[] args) {
        Imbracaminte articolFaraArg = new Imbracaminte();
        Tricou tricouFaraArg = new Tricou();
        Camasa camasaFaraArg = new Camasa();

        System.out.println("Constructori fara argumente:");
        System.out.println("Articol: " + articolFaraArg);
        System.out.println("Tricou: " + tricouFaraArg);
        System.out.println("Camasa: " + camasaFaraArg);

        Imbracaminte articol = new Imbracaminte("Levi's", "32", "albastru", "denim", 150.0, 5);
        Tricou tricou = new Tricou("Nike", "M", "albastru", "bumbac", 100.0, 20, true, true, "rotund", "regular");
        Camasa camasa = new Camasa("Zara", "L", "alb", "bumbac", 200.0, 8, true, true, "clasic", "slim");

        System.out.println();
        System.out.println("Constructori cu toate argumentele:");
        System.out.println("Articol: " + articol);
        System.out.println("Tricou: " + tricou);
        System.out.println("Camasa: " + camasa);

        Imbracaminte copieArticol = new Imbracaminte(articol);
        Tricou copieTricou = new Tricou(tricou);
        Camasa copieCamasa = new Camasa(camasa);

        copieArticol.setBrand("Adidas");
        copieTricou.setBrand("Puma");
        copieCamasa.setBrand("Hugo Boss");

        System.out.println();
        System.out.println("Constructori de copiere:");
        System.out.println("Articol original: " + articol);
        System.out.println("Articol copie: " + copieArticol);
        System.out.println("Tricou original: " + tricou);
        System.out.println("Tricou copie: " + copieTricou);
        System.out.println("Camasa original: " + camasa);
        System.out.println("Camasa copie: " + copieCamasa);

        articol.setBrand("Wrangler");
        articol.setMarime("34");
        articol.setCuloare("negru");
        articol.setMaterial("bumbac");
        articol.setPret(180.0);
        articol.setStoc(12);

        tricou.setMarime("L");
        tricou.setAreImprimeu(false);
        tricou.setManecaScurta(false);
        tricou.setTipGuler("V");
        tricou.setCroiala("slim");

        camasa.setCuloare("albastru");
        camasa.setEleganta(false);
        camasa.setManecaLunga(false);
        camasa.setTipGuler("polo");
        camasa.setCroiala("regular");

        System.out.println();
        System.out.println("Set si get:");
        System.out.println("Articol: " + articol.getBrand() + ", " + articol.getMarime() + ", " + articol.getCuloare() + ", " + articol.getMaterial() + ", " + articol.getPret() + ", " + articol.getStoc());
        System.out.println("Tricou: " + tricou.getMarime() + ", imprimeu " + tricou.isAreImprimeu() + ", maneca scurta " + tricou.isManecaScurta() + ", guler " + tricou.getTipGuler() + ", croiala " + tricou.getCroiala());
        System.out.println("Camasa: " + camasa.getCuloare() + ", eleganta " + camasa.isEleganta() + ", maneca lunga " + camasa.isManecaLunga() + ", guler " + camasa.getTipGuler() + ", croiala " + camasa.getCroiala());

        articol.aplicaReducere(50);
        tricou.aplicaReducere(10);
        camasa.aplicaReducere(25);

        System.out.println();
        System.out.println("Dupa reducere:");
        System.out.println("Articol pret: " + articol.getPret());
        System.out.println("Tricou pret: " + tricou.getPret());
        System.out.println("Camasa pret: " + camasa.getPret());

        System.out.println();
        System.out.println("Disponibilitate:");
        System.out.println("Articol, 10 buc: " + articol.verificaDisponibilitate(10));
        System.out.println("Tricou, 5 buc: " + tricou.verificaDisponibilitate(5));
        System.out.println("Camasa, 10 buc: " + camasa.verificaDisponibilitate(10));

        System.out.println();
        System.out.println("Dupa modificari:");
        System.out.println(articol);
        System.out.println(tricou);
        System.out.println(camasa);
    }
}
