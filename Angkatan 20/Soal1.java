package boj2021;

import java.util.Scanner;

/**
 *
 * @author Java Developer Group
 */
public class Soal1 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Masukkan sebuah katan dengan panjang 5 huruf : ");
	String kata = scanner.next();
	char karakter = kata.charAt(2);
	System.out.println("Karakter yang berada di posisi tengah adalah : \"" + karakter + "\"");
    }
    
}
