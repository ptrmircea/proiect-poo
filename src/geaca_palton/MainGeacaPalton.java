package geaca_palton;
import comun.Imbracaminte;

public class MainGeacaPalton {
    public static void main(String[] args) {
        Imbracaminte imb1 = new Imbracaminte();
        Imbracaminte imb2 = new Imbracaminte("Zara", "L", "Alb", "Bumbac", 150, 12);
        Imbracaminte imb3 = new Imbracaminte(imb2);

        System.out.println("Instante Imbracaminte:");
        System.out.println(imb1);
        System.out.println(imb2);
        System.out.println(imb3);

        Geaca g1 = new Geaca();
        Geaca g2 = new Geaca("Prada", "L", "Negru", "Poliester", 600, 5,
                "Casual", true, true, "Iarna", 4);
        Geaca g3 = new Geaca(g2);

        System.out.println("Instante Geaca:");
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);

        Palton p1 = new Palton();
        Palton p2 = new Palton("Massimo Dutti", "M", "Camel", "Lana", 950, 3,
                "Lung", "Cambrat", true, 4, true);
        Palton p3 = new Palton(p2);

        System.out.println("Instante Palton:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }

}
