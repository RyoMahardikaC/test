import java.util.Scanner;

import java.util.Scanner;

/**
 * Program untuk menghitung luas trapesium berdasarkan panjang dua sisi dan tinggi.
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, t, luas;

        System.out.println("Menghitung luas trapesium");
        System.out.println("==========================");

        // Meminta pengguna memasukkan nilai panjang sisi pertama (a).
        System.out.print("Masukkan nilai panjang sisi pertama (a): ");
        a = input.nextDouble();

        // Meminta pengguna memasukkan nilai panjang sisi kedua (b).
        System.out.print("Masukkan nilai panjang sisi kedua (b): ");
        b = input.nextDouble();

        // Meminta pengguna memasukkan nilai tinggi (t).
        System.out.print("Masukkan nilai tinggi (t): ");
        t = input.nextDouble();

        // Menghitung luas trapesium menggunakan rumus (a + b) / 2 * t.
        luas = (a + b) / 2 * t;

        // Menampilkan hasil perhitungan luas trapesium.
        System.out.print("Luas trapesium: " + luas);
    }
}
