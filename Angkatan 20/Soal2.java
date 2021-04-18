package boj2021;

import java.util.Scanner;

/**
 *
 * @author Java Developer Group
 */
public class Soal2 {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.print("Masukkan kelipatan : ");
	int kelipatan = scanner.nextInt();
	System.out.print("Masukkan batasan : ");
	int batas = scanner.nextInt();

	for (int i = 1; i <= batas; i++) {
	    if (i % kelipatan == 0) {
		if (i != 1 && i != kelipatan) {
		    System.out.print(", ");
		}
		System.out.print(i);
	    } else if (i == batas) {
		System.out.println("");
	    }
	}
    }
}
