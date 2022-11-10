import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner inp = new Scanner(System.in);
        mat = inp.nextInt();
        fizik = inp.nextInt();
        kimya = inp.nextInt();
        turkce = inp.nextInt();
        tarih = inp.nextInt();
        muzik = inp.nextInt();

        float ort = (mat+fizik+kimya+turkce+tarih+muzik)/6f;
        String sonuc= (ort>60)? "Sınıfı geçti":"Sınıfta kaldı";
        System.out.println(sonuc);
    }
}