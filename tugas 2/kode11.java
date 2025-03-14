import java.util.Scanner;

public class kode11 {
    public static void main(String[] args) {
        int N, i;
        Scanner masukan = new Scanner(System.in);
        System.out.print("Nilai N >0 = ");
        N = masukan.nextInt();
        i = 1;
        System.out.print("Print i dengan ITERATE: \n");
        for (;;) {
            System.out.println(i);
            if (i == N) break;
            else i++;
        }
    }
}

