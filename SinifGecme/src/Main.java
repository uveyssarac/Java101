import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik;
        Scanner inp = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz : "); // Matematik notunu kullanıcıdan alma
        mat = inp.nextInt();
        System.out.println("Fizik notunuzu giriniz : "); // Fizik notunu kullanıcıdan alma
        fizik = inp.nextInt();
        System.out.println("Türkçe notunuzu giriniz : "); // Türkçe notunu kullanıcıdan alma
        turkce = inp.nextInt();
        System.out.println("Kimya notunuzu giriniz : "); // Kimya notunu kullanıcıdan alma
        kimya = inp.nextInt();
        System.out.println("Müzik notunuzu giriniz : "); // Müzik notunu kullanıcıdan alma
        muzik = inp.nextInt();

        float avarage;
        if       (mat<0 || mat>100){     //Notun 0-100 arasında olması kontrolü eğer değilse ortalamaya katılmaz
            avarage = (turkce+fizik+kimya+muzik)/4f;
        }else if (turkce<0 || turkce>100){
            avarage = (mat+fizik+kimya+muzik)/4f;
        }else if (fizik<0 || fizik>100){
            avarage = (turkce+mat+kimya+muzik)/4f;
        }else if (kimya<0 || kimya>100){
            avarage = (turkce+fizik+mat+muzik)/4f;
        }else if (muzik<0 || muzik>100){
            avarage = (turkce+fizik+kimya+mat)/4f;
        }else{
            avarage = (mat+turkce+fizik+kimya+muzik)/5f;
        }
        if(avarage>=55){    // Ortalamaya göre sınıf geçme veya kalma durumu kontrolü
            System.out.println("Not ortalamanız : " +avarage+"\nSınıfı geçtiniz.");
        }else {
            System.out.println("Not ortalamanız : " +avarage+"\nSınıfı geçemediniz.");
        }






    }
}