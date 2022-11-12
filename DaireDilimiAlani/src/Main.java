import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp= new Scanner(System.in);
        System.out.println("Yarıçapı giriniz : ");
        int r= inp.nextInt();
        System.out.println("Merkez açısını giriniz : ");
        int a= inp.nextInt();
        double alan =(3.14*(r*r)*a)/360;
        System.out.println(String.format("Daire dilimi alanı : " + new DecimalFormat("##.##").format(alan)));
    }
}