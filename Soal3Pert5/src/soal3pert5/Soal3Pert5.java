//Menghitung Nilai Faktorial
package soal3pert5;

import java.util.Scanner;

public class Soal3Pert5 {
    
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("Masukkan nilai n yang lebih besar dari 0");
        } else {
            int faktorial = hitungFaktorial(n);
            System.out.println(n + "! = " + generateFaktorial(n) + " = " + faktorial);
        }
    }

    public static int hitungFaktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int faktorial = 1;
        for (int i = 2; i <= n; i++) {
            faktorial *= i;
        }
        return faktorial;
    }

    public static String generateFaktorial(int n) {
        if (n == 0 || n == 1) {
            return "1";
        }
        StringBuilder faktorial = new StringBuilder();
        for (int i = n; i >= 1; i--) {
            faktorial.append(i);
            if (i > 1) {
                faktorial.append("*");
            }
        }
        return faktorial.toString();
    }
    
}
