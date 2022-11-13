import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float armut=2.14f;
        float elma=3.67f;
        float domates=1.11f;
        float muz=0.95f;
        float patlican=5.00f;
        float toplam=0;
        Scanner inp= new Scanner(System.in);

        System.out.println("Armut kaç kilo : ");
        int kilo= inp.nextInt();
        toplam+=kilo*armut;

        System.out.println("Elma kaç kilo : ");
        kilo= inp.nextInt();
        toplam+=kilo*elma;

        System.out.println("Domates kaç kilo : ");
        kilo= inp.nextInt();
        toplam+=kilo*domates;

        System.out.println("Muz kaç kilo : ");
        kilo= inp.nextInt();
        toplam+=kilo*muz;

        System.out.println("Patlıcan kaç kilo : ");
        kilo= inp.nextInt();
        toplam+=kilo*patlican;

        System.out.println("Toplam tutar : "+toplam+" TL");
    }
}