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
        if(!(trip==1 || trip ==2)){                   //Yolculuk tipi kontrolü
            System.out.println("Hatalı veri girdiniz");
            System.exit(0);                    //Veri hatalı ise program sonlanır
        }

        float kmPrice=0.10f;                         //Km başına ücret
        float tutar = distance*kmPrice;              //Normal ücret tutarı

        System.out.println("İndirimsiz Tutar"+ tutar);
        if(age<12){                                  //Yaş indirimi hesaplama
            tutar=tutar-(tutar/2f);
            System.out.println("Yaş indirimi : "+tutar*0.50f);
        } else if (age<24) {
            tutar=tutar-(tutar*0.10f);
            System.out.println("Yaş indirimi : "+tutar*0.10f);
        } else if (age>65) {
            tutar=tutar-(tutar*0.30f);
            System.out.println("Yaş indirimi : "+tutar*0.30f);
        }else{
            System.out.println("yaş indirimi : 0 ");
        }


        if (trip==2){                               //Gidiş Dönüş Bilet İndirimi
            tutar=tutar-(tutar*0.20f);
        }
        System.out.println("Gidiş Dönüş Bilet İndirimi : "+tutar*0.20f);
        tutar=tutar*trip;                           //Toplam tutar

        System.out.println("Tutar :"+tutar);




    }
}