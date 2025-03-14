import java.util.Scanner;

public class kode17 {
    public static void main(String[] args) {
        int Sum = 0, x;
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan nilai x (int), akhiri dg 999: ");
        x = masukan.nextInt();
        while (x != 999) {
            Sum += x;
            System.out.print("Masukkan nilai x (int), akhiri dg 999: ");
            x = masukan.nextInt();
        }
        System.out.println("Hasil penjumlahan = " + Sum);
    }
}
