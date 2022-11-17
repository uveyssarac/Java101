import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("C(n,r)");
        System.out.print("n değerini giriniz : ");         // data from user
        int n = scan.nextInt();

        System.out.print("r değerini giriniz : ");         // data from user
        int r = scan.nextInt();

        System.out.println(comb(n,r));

    }

    static int comb(int n, int r){
        int nfact=1, rfact=1, nrfact=1, sum=0;
        for (int i = 1; i < n; i++) {   // n faktöriyel
            nfact+=i*nfact;
        }
        for (int i = 1; i < r; i++) {   // r faktöriyel
            rfact+=i*rfact;
        }
        for (int i = 1; i < n-r; i++) { //n-r faktöriyel
            nrfact+=i*nrfact;
        }
        sum= nfact/(rfact*nrfact);    // toplam
        return sum;

    }
}