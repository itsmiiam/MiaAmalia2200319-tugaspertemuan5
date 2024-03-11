//Menghitung Hasil Penjumlahan deret 
package soal1pert5;

import java.util.Scanner;
public class Soal1Pert5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        int total = hitungPenjumlahan(N);
        String deret = hitungDeret(N);

        System.out.println("Hasil Penjumlahan Deret: " + deret + "=" + total);
    }

    public static int hitungPenjumlahan(int N) {
        int total = 0;
        for (int i = 1; i <= N; i++) {
            total += i;
        }
        return total;
    }

    public static String hitungDeret(int N) {
        String deret = "";
        for (int i = 1; i <= N; i++) {
            deret += i;
            if (i < N) {
                deret += "+";
            }
        }
        return deret;
    }
    
}