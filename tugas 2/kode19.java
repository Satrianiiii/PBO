import java.util.Scanner;

public class kode19 {
    public static void main(String[] args) {
        int T;
        Scanner masukan = new Scanner(System.in);
        System.out.print("Contoh IF tiga kasus \n");
        System.out.print("Temperatur (der. C) = ");
        T = masukan.nextInt();

        if (T < 0) {
            System.out.print("Wujud air beku \n" + T);
        } else if (T <= 100) {
            System.out.print("Wujud air cair \n" + T);
        } else {
            System.out.print("Wujud air uap/gas \n" + T);
        }
    }
}
