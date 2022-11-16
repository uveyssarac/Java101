import java.util.Scanner;

public class Main {
    static int usluSayi(int taban, int us){
        if (us != 0) {
            return (taban * usluSayi(taban, us - 1));
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        int taban=sc.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int us=sc.nextInt();
        System.out.println(usluSayi(taban,us));
    }
}