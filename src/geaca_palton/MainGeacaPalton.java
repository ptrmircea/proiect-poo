package geaca_palton;
import comun.Imbracaminte;

public class MainGeacaPalton {
    public static void main(String[] args) {
        Imbracaminte imb1 = new Imbracaminte();
        imb1.setBrand("H&M");
        imb1.setMarime("M");
        imb1.setCuloare("Gri");
        imb1.setMaterial("Bumbac");
        imb1.setPret(120);
        imb1.setStoc(10);

        Imbracaminte imb2 = new Imbracaminte("Zara", "L", "Alb", "In", 150, 12);
        Imbracaminte imb3 = new Imbracaminte(imb2);

        System.out.println("Instante Imbracaminte");
        System.out.println(imb1);
        System.out.println(imb2);
        System.out.println(imb3);
        System.out.println("Brand imb1 (cu get): " + imb1.getBrand() + ", Pret: " + imb1.getPret());

        Geaca g1 = new Geaca();
        g1.setBrand("Bershka");
        g1.setMarime("S");
        g1.setCuloare("Albastru");
        g1.setMaterial("Denim");
        g1.setPret(250);
        g1.setStoc(7);
        g1.setTipGeaca("Denim");
        g1.setAreGluga(false);
        g1.setImpermeabila(false);
        g1.setSezon("Primavara");
        g1.setNumarBuzunare(4);

        Geaca g2 = new Geaca("Prada", "L", "Negru", "Poliester", 600, 5,
                "Casual", true, true, "Iarna", 4);
        Geaca g3 = new Geaca(g2);

        System.out.println("Instante Geaca");
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
        System.out.println("Tip geaca g2 (cu get): " + g2.getTipGeaca() + ", Are gluga: " + g2.isAreGluga());

        Palton p1 = new Palton();
        p1.setBrand("Mango");
        p1.setMarime("L");
        p1.setCuloare("Negru");
        p1.setMaterial("Stofa");
        p1.setPret(500);
        p1.setStoc(6);
        p1.setLungime("Mediu");
        p1.setCroiala("Drept");
        p1.setAreCordon(true);
        p1.setNumarNasturi(3);
        p1.setCaptusit(true);

        Palton p2 = new Palton("Massimo Dutti", "M", "Camel", "Lana", 950, 3,
                "Lung", "Cambrat", true, 4, true);
        Palton p3 = new Palton(p2);

        System.out.println("Instante Palton");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println("Croiala p2 (cu get): " + p2.getCroiala() + ", Captusit: " + p2.isCaptusit());
    }

}
