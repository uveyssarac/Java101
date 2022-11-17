public class Main {
    public static void main(String[] args) {

        System.out.print("2 ");
        for(int i=2;i<=100;i++) {
            int control = 0;
            for (int j = 2; j < Math.sqrt(i)+1; j++) { //Sayının kökü kadar olan sayıları for ile dönüyoruz.
                if (i % j == 0) {                      // Sayının kökü kaçsa en fazla o sayıya kadar asal sayı olabilir.
                    control = 1;
                    break;
                }
            }

            if(control==0) {                    //control değeri 1 olmadıysa asaldır.
                System.out.print(i+" ");
            }
        }
    }
}
