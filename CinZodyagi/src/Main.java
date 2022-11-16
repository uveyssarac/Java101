import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Doğum yılnızı giriniz : "); //Doğum yılını kullanıcıdan alma
        int year = inp.nextInt();

        year=(year%12)+1;                           //12 ile modunu alma


        switch (year){                              //Switch-case ile sonuç döndürme
            case 1:
                System.out.println("Çin Zodyağı Burcunuz : Maymun");break;
            case 2:
                System.out.println("Çin Zodyağı Burcunuz : Horoz");break;
            case 3:
                System.out.println("Çin Zodyağı Burcunuz : Köpek");break;
            case 4:
                System.out.println("Çin Zodyağı Burcunuz : Domuz");break;
            case 5:
                System.out.println("Çin Zodyağı Burcunuz : Fare");break;
            case 6:
                System.out.println("Çin Zodyağı Burcunuz : Öküz");break;
            case 7:
                System.out.println("Çin Zodyağı Burcunuz : Kaplan");break;
            case 8:
                System.out.println("Çin Zodyağı Burcunuz : Tavşan");break;
            case 9:
                System.out.println("Çin Zodyağı Burcunuz : Ejderha");break;
            case 10:
                System.out.println("Çin Zodyağı Burcunuz : Yılan");break;
            case 11:
                System.out.println("Çin Zodyağı Burcunuz : At");break;
            case 12:
                System.out.println("Çin Zodyağı Burcunuz : Koyun");break;

        }

    }
}