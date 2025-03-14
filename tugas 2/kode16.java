import java.util.Scanner;

public class kode16 {
    public static void main(String[] args) {
        int Sum = 0, x;
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan nilai x (int), akhiri dg 999: ");
        x = masukan.nextInt();
        if (x == 999) {
            System.out.print("Kasus kosong \n");
        } else {
            do {
                Sum += x;
                System.out.print("Masukkan nilai x (int), akhiri dg 999: ");
                x = masukan.nextInt();
            } while (x != 999);
            System.out.println("Hasil penjumlahan = " + Sum);
        }
    }
}
