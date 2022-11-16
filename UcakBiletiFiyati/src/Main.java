import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Mesafe (KM) : ");
        int distance = inp.nextInt();           // Mesafe bilgisini alma
        if(!(distance>0)){                      // Mesafe pozitif değer kontrolü
            System.out.println("Hatalı veri girdiniz");
            System.exit(0);
        }

        System.out.println("Yaşınızı giriniz : "); // Yaş bilgisini alma
        int age = inp.nextInt();                    // Yaş pozitif değer kontrolü
        if(!(age>0)){
            System.out.println("Hatalı veri girdiniz");
            System.exit(0);
        }
        System.out.println("Tek yön için : 1, Gidiş dönüş için : 2, değerini giriniz  : ");
        int trip = inp.nextInt();
        if(!(age==1 || age ==2)){
            System.out.println("Hatalı veri girdiniz");
            System.exit(0);
        }
        float kmPrice=0.10f; //Km başına ücret

        System.out.println("Normal tutar :"+distance*kmPrice*trip);

    }
}