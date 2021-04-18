package boj2021;

import java.util.Scanner;

/**
 *
 * @author Java Developer Group
 */
public class Soal7 {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Masukkan banyak makanan/minuman favorit anda : ");
	int banyak = Integer.parseInt(scanner.nextLine());
	
	String[] makanan_minuman = new String[banyak];
	for (int i = 0; i < banyak; i++) {
	    System.out.print("Masukkan makanan/minuman ke-" + (i+1) + " : ");
	    makanan_minuman[i] = scanner.nextLine();
	}
	
	System.out.print("\nMakanan/minuman favorit anda : ");
	for (int i = 0; i < banyak; i++) {
	    System.out.print(makanan_minuman[i]);
	    if(i != banyak && i != banyak-1) {
		System.out.print(", ");
	    } else if(i == banyak-1) {
		System.out.println("");
	    }
	}
    }
}
