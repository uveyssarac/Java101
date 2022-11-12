import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp= new Scanner(System.in);
        System.out.println("Kilometreyi giriniz : ");
        int km= inp.nextInt();
        float tutar=(km*2.20f)+10;
        if(tutar<20){
            tutar=20;
        }
        System.out.println("Ödenecek tutar : " +tutar);
    }
}