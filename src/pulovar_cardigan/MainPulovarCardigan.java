package pulovar_cardigan;

import comun.Imbracaminte;

public class MainPulovarCardigan {
    public static void main(String[] args) {

        Imbracaminte articolFaraArg = new Imbracaminte();
        Pulovar pulovarFaraArg = new Pulovar();
        Cardigan cardiganFaraArg = new Cardigan();

        System.out.println("Constructori fara argumente:");
        System.out.println("Articol: " + articolFaraArg);
        System.out.println("Pulovar: " + pulovarFaraArg);
        System.out.println("Cardigan: " + cardiganFaraArg);

        Imbracaminte articol = new Imbracaminte("Zara", "L", "negru", "bumbac", 100.0, 15);
        Pulovar pulovar = new Pulovar("ZaraKnit", "L", "bej", "lana merinos", 200.0, 10,
                "pe gat", "gros", 90.0, "iarna", true);
        Cardigan cardigan = new Cardigan("Mango", "S", "crem", "bumbac organic", 150.0, 8,
                7, "nasturi", "lung", false, "gri");

        System.out.println();
        System.out.println("Constructori cu toate argumentele:");
        System.out.println("Articol: " + articol);
        System.out.println("Pulovar: " + pulovar);
        System.out.println("Cardigan: " + cardigan);

        Imbracaminte copieArticol = new Imbracaminte(articol);
        Pulovar copiePulovar = new Pulovar(pulovar);
        Cardigan copieCardigan = new Cardigan(cardigan);

        copieArticol.setBrand("Adidas");
        copiePulovar.setBrand("Tommy");
        copieCardigan.setBrand("Reserved");

        System.out.println();
        System.out.println("Constructori de copiere :");
        System.out.println("Articol original: " + articol);
        System.out.println("Articol copie: " + copieArticol);
        System.out.println("Pulovar original: " + pulovar);
        System.out.println("Pulovar copie: " + copiePulovar);
        System.out.println("Cardigan original: " + cardigan);
        System.out.println("Cardigan copie: " + copieCardigan);

        // met. set si get
        pulovar.setMarime("M");
        pulovar.setCuloare("gri");
        pulovar.setTipGuler("rotund");
        pulovar.setGrosime("subtire");
        pulovar.setCompozitieLana(60.0);
        pulovar.setAnotimp("toamna");
        pulovar.setEsteUnisex(false);

        cardigan.setMarime("M");
        cardigan.setCuloare("verde");
        cardigan.setNrNasturi(5);
        cardigan.setTipInchidere("fermoar");
        cardigan.setLungime("scurt");
        cardigan.setAreGluga(true);
        cardigan.setCuloareCaptuseala("alb");

        System.out.println();
        System.out.println("Set si get:");
        System.out.println("Pulovar: " + pulovar.getMarime() + ", " + pulovar.getCuloare()
                + ", guler " + pulovar.getTipGuler() + ", grosime " + pulovar.getGrosime()
                + ", lana " + pulovar.getCompozitieLana() + "%, anotimp " + pulovar.getAnotimp()
                + ", unisex " + pulovar.isEsteUnisex());
        System.out.println("Cardigan: " + cardigan.getMarime() + ", " + cardigan.getCuloare()
                + ", nasturi " + cardigan.getNrNasturi() + ", inchidere " + cardigan.getTipInchidere()
                + ", lungime " + cardigan.getLungime() + ", gluga " + cardigan.isAreGluga()
                + ", captuseala " + cardigan.getCuloareCaptuseala());

        // met. intf  aplicaReducere
        System.out.println();
        System.out.println("Reducere:");
        System.out.println("Articol pret inainte: " + articol.getPret());
        articol.aplicaReducere(10);
        System.out.println("Articol pret dupa 10%: " + articol.getPret());

        System.out.println("Pulovar pret inainte: " + pulovar.getPret());
        pulovar.aplicaReducere(25);
        System.out.println("Pulovar pret dupa 25%: " + pulovar.getPret());

        System.out.println("Cardigan pret inainte: " + cardigan.getPret());
        cardigan.aplicaReducere(20);
        System.out.println("Cardigan pret dupa 20%: " + cardigan.getPret());

        //  met din interfata  verificaDisponibilitate
        System.out.println();
        System.out.println("Disponibilitate:");
        System.out.println("Articol, 10 buc (stoc " + articol.getStoc() + "): " + articol.verificaDisponibilitate(10));
        System.out.println("Pulovar, 4 buc (stoc " + pulovar.getStoc() + "): " + pulovar.verificaDisponibilitate(4));
        System.out.println("Cardigan, 20 buc (stoc " + cardigan.getStoc() + "): " + cardigan.verificaDisponibilitate(20));


        Imbracaminte x = pulovar;
        Imbracaminte y = cardigan;

        System.out.println();
        System.out.println("Polimorfism (se apeleaza toString din clasa reala a obiectului):");
        System.out.println(x);
        System.out.println(y);

        // set finala a obiectelor
        System.out.println();
        System.out.println("Dupa modificari:");
        System.out.println(articol);
        System.out.println(pulovar);
        System.out.println(cardigan);
    }
}