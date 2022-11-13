import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        float boy= inp.nextFloat();
        System.out.println("Lütfen kilonuzu giriniz : ");
        float kilo= inp.nextFloat();
        float vki= kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz : "+ vki);
    }
}