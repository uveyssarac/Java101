import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Doğduğunuz gün : "); // Doğum gününü kullanıcıdan alma
        int day = inp.nextInt();
        System.out.println("Doğduğunuz ay : "); // Doğum ayını kullanıcıdan alma
        int month = inp.nextInt();

        if(month==1){//Ocak
            if(day >21){
                System.out.println("Kova");
            }else{
                System.out.println("Oğlak");
            }
        }else if (month==2) { //Şubat
            if(day >19){
                System.out.println("Balık");
            }else{
                System.out.println("Kova");
            }

        }else if (month==3) { //Mart
            if(day >20){
                System.out.println("Koç");
            }else{
                System.out.println("Balık");
            }

        }else if (month==4) { //Nisan
            if(day >20){
                System.out.println("Boğa");
            }else{
                System.out.println("Koç");
            }

        }else if (month==5) { //Mayıs
            if(day >21){
                System.out.println("İkizler");
            }else{
                System.out.println("Boğa");
            }

        }else if (month==6) { //Haziran
            if(day >22){
                System.out.println("Yengeç");
            }else{
                System.out.println("İkizler");
            }

        }else if (month==7) { //Temmuz
            if(day >22){
                System.out.println("Aslan");
            }else{
                System.out.println("Yengeç");
            }

        }else if (month==8) { //Ağustos
            if(day >22){
                System.out.println("Başak");
            }else{
                System.out.println("Aslan");
            }

        }else if (month==9) { //Eylül
            if(day >22){
                System.out.println("Terazi");
            }else{
                System.out.println("Başak");
            }

        }else if (month==10) { //Ekim
            if(day >22){
                System.out.println("Akrep");
            }else{
                System.out.println("Terazi");
            }

        }else if (month==11) { //Kasım
            if(day >21){
                System.out.println("Yay");
            }else{
                System.out.println("Akrep");
            }

        }else{      //Aralık
            if(day >21){
                System.out.println("Oğlak");
            }else{
                System.out.println("Yay");
            }

        }

    }
}