import java.util.Scanner;

public class kode14 {
    public static void main(String[] args) {
        int N, i = 1;
        Scanner masukan = new Scanner(System.in);
        System.out.print("Nilai N >0 = ");
        N = masukan.nextInt();
        System.out.print("Print i dengan WHILE (ringkas): \n");
        while (i <= N) {
            System.out.println(i++);
        }
    }
}
