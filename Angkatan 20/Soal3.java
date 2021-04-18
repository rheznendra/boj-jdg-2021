package boj2021;

import java.util.Scanner;

/**
 *
 * @author Java Developer Group
 */
public class Soal3 {
    
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.print("Masukkan sebuah kata/kalimat : ");
	String word = scanner.nextLine();
	
	word = word.toUpperCase();
	System.out.println("Hasil : " + word);
    }
}
