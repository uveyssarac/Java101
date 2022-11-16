import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Mesafe (KM) : ");
        int distance = inp.nextInt();               // Mesafe bilgisini alma
        if(!(distance>0)){                          // Mesafe pozitif değer kontrolü
            System.out.println("Hatalı veri girdiniz");
            System.exit(0);                   //Veri hatalı ise program sonlanır
        }

        System.out.println("Yaşınızı giriniz : ");  // Yaş bilgisini alma
        int age = inp.nextInt();                    // Yaş pozitif değer kontrolü
        if(!(age>0)){
            System.out.println("Hatalı veri girdiniz");
            System.exit(0);                    //Veri hatalı ise program sonlanır
        }
        System.out.println("Tek yön için : 1, Gidiş dönüş için : 2, değerini giriniz  : ");
        int trip = inp.nextInt();
        if(!(trip==1 || trip ==2)){                    //Yolculuk tipi kontrolü
            System.out.println("Hatalı veri girdiniz");
            System.exit(0);                    //Veri hatalı ise program sonlanır
        }
        float kmPrice=0.10f;                         //Km başına ücret
        float tutar = distance*kmPrice;              //Ücret tutarı
        float ageDiscount=0;
        if(age<12){
            ageDiscount=tutar/2f;
        } else if (age<24) {
            ageDiscount=tutar*0.10f;
        } else if (age>65) {
            ageDiscount=tutar*0.30f;
        }
        float tripDiscount=0;
        if (trip==2){
            tripDiscount=tutar*0.20f;
        }

        tutar=(tutar-ageDiscount-tripDiscount)*trip;

        System.out.println("Normal tutar :"+tutar);




    }
}