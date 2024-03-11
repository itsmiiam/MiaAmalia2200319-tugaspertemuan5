//Menghitung BatasAwal-BatasAkhir Bilangan Ganjil
package soal2pert5;

import java.util.Scanner;

public class Soal2Pert5 {
    
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai batas awal: ");
        int batasAwal = input.nextInt();
        System.out.print("Masukkan nilai batas akhir: ");
        int batasAkhir = input.nextInt();

        int jumlahGanjil = hitungBilanganGanjil(batasAwal, batasAkhir);

        System.out.println("Banyak bilangan ganjil dari " + batasAwal + " hingga " + batasAkhir + " adalah: " + jumlahGanjil);
    }

    public static int hitungBilanganGanjil(int batasAwal, int batasAkhir) {
        int hitung = 0;
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 != 0) {
                hitung++;
            }
        }
        return hitung;
    }
}
