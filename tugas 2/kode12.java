import java.util.Scanner;

public class kode12 {
    public static void main(String[] args) {
        int N, i;
        Scanner masukan = new Scanner(System.in);
        System.out.print("Nilai N >0 = ");
        N = masukan.nextInt();
        i = 1;
        System.out.print("Print i dengan REPEAT: \n");
        do {
            System.out.println(i);
            i++;
        } while (i <= N);
    }
}
