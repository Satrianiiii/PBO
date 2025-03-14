import java.util.Scanner;

public class kode15 {
    public static void main(String[] args) {
        int Sum = 0, x;
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan nilai x (int), akhiri dg 999: ");
        x = masukan.nextInt();
        
        if (x == 999) {
            System.out.print("Kasus kosong \n");
        } else {
            Sum = x;
            for (;;) {
                System.out.print("Masukkan nilai x (int), akhiri dg 999: ");
                x = masukan.nextInt();
                if (x == 999) break;
                else Sum += x;
            }
        }

        System.out.println("Hasil penjumlahan = " + Sum);
        masukan.close(); // Tutup scanner agar tidak ada warning
    }
}
