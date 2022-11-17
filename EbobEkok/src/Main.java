import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz : ");         // data from user
        int n1 = scan.nextInt();
        System.out.print("2. sayıyı giriniz : ");
        int n2 = scan.nextInt(), ekok;

        ekok= (n1 > n2) ? n1 : n2;

        while(true)
        {
            if( ekok % n1 == 0 && ekok % n2 == 0 )
            {
                System.out.printf("%d ve %d sayılarının EKOK'u %d dir.", n1, n2, ekok);
                break;
            }
            ++ekok;
        }
    }
}