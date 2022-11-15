import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("a sayısını giriniz : "); // a sayıyını kullanıcıdan alma
        int a = inp.nextInt();
        System.out.println("b sayısını giriniz : "); // b sayıyını  kullanıcıdan alma
        int b = inp.nextInt();
        System.out.println("c sayısını giriniz : "); // c sayıyını kullanıcıdan alma
        int c = inp.nextInt();
        String result="";

        if(a<b && a<c){             //En küçük a ise result stringine a eklenir.
            result+="a";
            if(b<c){               //b>c b ise result stringine a eklenir.Değilse sıralamaya c<b diye eklenir
                result+="<b<c";
            }else{
                result+="<c<b";
            }
        } else if (b<a && b<c) {//En küçük b ise result stringine a eklenir.
            result+="b";
            if(a<c){
                result+="<a<c";     //a<c b ise result stringine a eklenir.Değilse sıralamaya c<a diye eklenir
            }else{
                result+="<c<a";
            }
        } else{                 //En küçük c ise result stringine a eklenir.
            result+="c";
            if(b<a){                //b<a b ise result stringine a eklenir.Değilse sıralamaya a<b diye eklenir
                result+="<b<a";
            }else{
                result+="<a<b";
            }
        }
        System.out.println(result); //Sonda da result yazdırılır

    }
}