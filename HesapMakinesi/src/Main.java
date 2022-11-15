import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz : "); // 1. sayıyı kullanıcıdan alma
        int number1 = inp.nextInt();

        System.out.println("2. sayıyı giriniz : "); // 2. sayıyı kullanıcıdan alma
        int number2 = inp.nextInt();

        System.out.println("Toplama = 1\nÇıkarma = 2\nÇarpma = 3\nBölme = 4\nYapmak istediğiniz işleme karşılık gelen sayıyı seçiniz :");
        int select = inp.nextInt();              //  Hangi işlem yapılacağının seçimi

        float sonuc=0f;
        switch (select) {                        // switch case yapısı
            case 1:
                sonuc=number1+number2;
                break;
            case 2:
                sonuc=number1-number2;
                break;
            case 3:
                sonuc=number1*number2;
                break;
            case 4:
                sonuc=(float) number1/number2;
                break;
        }
        System.out.println(sonuc);
    }
}