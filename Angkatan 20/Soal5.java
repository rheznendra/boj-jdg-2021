package boj2021;

import java.util.Scanner;

/**
 *
 * @author Java Developer Group
 */
public class Soal5 {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int jenis = 0, jumlah = 0, buah = 0, lusin = 0;

	while (true) {
	    System.out.println("==========Konversi Satuan==========");
	    System.out.println("1. Lusin");
	    System.out.println("2. Gross");
	    System.out.println("3. Kodi");
	    System.out.println("4. Rim");
	    System.out.print("Pilih jenis satuan [1-4] : ");
	    jenis = scanner.nextInt();

	    if (jenis >= 1 && jenis <= 4) {
		System.out.print("Masukkan banyak jumlah : ");
		jumlah = scanner.nextInt();
		System.out.println("\n=============HASIL=============");
		if (jenis == 1) {
		    buah = jumlah * 12;
		    System.out.println(jumlah + " Lusin adalah " + buah + " buah.");
		} else if (jenis == 2) {
		    lusin = jumlah * 12;
		    buah = jumlah * 144;
		    System.out.println(jumlah + " Gross adalah " + lusin + " lusin.");
		    System.out.println(jumlah + " Gross adalah " + buah + " buah.");
		} else if(jenis == 3) {
		    buah = jumlah * 20;
		    System.out.println(jumlah + " Kodi adalah " + buah + " buah.");
		} else if(jenis == 4) {
		    buah = jumlah * 500;
		    System.out.println(jumlah + " Rim adalah " + buah + " buah.");
		}
		System.out.println("");
	    } else {
		System.out.println("Pilihan tidak valid. Silahkan ulangi kembali.\n");
	    }
	}
    }
}
