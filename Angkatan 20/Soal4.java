package boj2021;

import java.util.Scanner;

/**
 *
 * @author Java Developer Group
 */
public class Soal4 {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Masukkan batasan : ");
	int batas = scanner.nextInt();

	for (int i = 1; i <= batas; i++) {
	    System.out.print(i);
	    if (i != batas) {
		System.out.print(", ");
	    } else if (i == batas) {
		System.out.println("");
	    }
	}
    }
}
