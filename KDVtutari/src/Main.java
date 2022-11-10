import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp= new Scanner(System.in);
        double kdvsiz= inp.nextDouble();
        double kdvli=0.0;
        if(kdvsiz>0 && kdvsiz<=1000){
            kdvli= kdvsiz+(kdvsiz*18/100);
        }else if(kdvsiz>1000){
            kdvli= kdvsiz+(kdvsiz*8/100);
        }
        System.out.println(kdvli);
    }
}