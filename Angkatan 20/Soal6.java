package boj2021;

import java.util.Scanner;

/**
 *
 * @author Java Developer Group
 */
public class Soal6 {

    public static void main(String[] args) {
	String nama = null, alamat = null, jurusan = null, kelas = null;
	int umur = 0, no_ktp = 0, menu = 0, menu_jurusan = 0, menu_kelas = 0, total = 0;
	char jk = '-';
	boolean loop = true;
	Scanner scanner = new Scanner(System.in);

	System.out.println("=======================");
	System.out.print("Masukkan nomor ktp anda : ");
	no_ktp = Integer.parseInt(scanner.nextLine());
	System.out.print("Masukkan nama anda : ");
	nama = scanner.nextLine();
	System.out.print("Masukkan alamat anda : ");
	alamat = scanner.nextLine();
	while (loop) {
	    System.out.print("Masukkan jenis kelamin anda (L/P) anda : ");
	    jk = scanner.next().charAt(0);
	    if (jk == 'L' || jk == 'P') {
		loop = false;
	    } else {
		System.out.println("Jenis Kelamin tidak valid. Silahkan ulangi kembali.");
	    }
	}
	System.out.print("Masukkan umur anda : ");
	umur = Integer.parseInt(scanner.next());
	System.out.println("=======================\n\n");
	loop = true;
	while (loop) {
	    System.out.println("========MENU========");
	    System.out.println("1. Jurusan Penerbangan");
	    System.out.println("2. Jenis Kelas Tiket Penerbangan");
	    System.out.println("3. Nota");
	    System.out.println("4. Exit");
	    System.out.print("Silahkan pilih pilihan anda [1-4] : ");
	    menu = Integer.parseInt(scanner.next());
	    if (menu >= 1 && menu <= 4) {
		if (menu == 1) {
		    System.out.println("=========Jurusan Penerbangan=========");
		    System.out.println("1. Jakarta - Surabaya");
		    System.out.println("2. Surabaya - Medan");
		    System.out.println("3. Surabaya - Denpasar");
		    System.out.println("4. Jakarta - Denpasar");
		    System.out.print("Silahkan pilih jurusan anda : ");
		    menu_jurusan = Integer.parseInt(scanner.next());
		    if (menu_jurusan == 1) {
			jurusan = "Jakarta - Surabaya";
		    } else if (menu_jurusan == 2) {
			jurusan = "Surabaya - Medan";
		    } else if (menu_jurusan == 3) {
			jurusan = "Surabaya - Denpasar";
		    } else if (menu_jurusan == 4) {
			jurusan = "Jakarta - Denpasar";
		    }
		} else if (menu == 2) {
		    if (menu_jurusan != 0) {
			System.out.println("=========Jurusan Penerbangan=========");
			System.out.println(jurusan);
			System.out.println("=========Kelas Penerbangan=========");
			if (menu_jurusan == 1) {
			    System.out.println("1. Ekonomi (Rp. 1.000.000)");
			    System.out.println("2. Bisnis (Rp. 1.500.000)");
			} else if (menu_jurusan == 2) {
			    System.out.println("1. Ekonomi (Rp. 700.000)");
			    System.out.println("2. Bisnis (Rp. 1.200.000)");
			} else if (menu_jurusan == 3) {
			    System.out.println("1. Ekonomi (Rp. 500.000)");
			    System.out.println("2. Bisnis (Rp. 1.000.000)");
			} else if (menu_jurusan == 2) {
			    System.out.println("1. Ekonomi (Rp. 1.500.000)");
			    System.out.println("2. Bisnis (Rp. 2.000.000)");
			}
			System.out.print("Pilih kelas penerbangan [1-2] : ");
			menu_kelas = Integer.parseInt(scanner.next());
			
			if(menu_kelas == 1) {
			    kelas = "Ekonomi";
			} else if(menu_kelas == 2) {
			    kelas = "Bisnis";
			}

			if (menu_jurusan == 1) {
			    if (menu_kelas == 1) {
				total = 1000000;
			    } else if (menu_kelas == 2) {
				total = 1500000;
			    }
			    System.out.println("1. Ekonomi (Rp. 1.000.000)");
			    System.out.println("2. Bisnis (Rp. 1.500.000)");
			} else if (menu_jurusan == 2) {
			    if (menu_kelas == 1) {
				total = 700000;
			    } else if (menu_kelas == 2) {
				total = 1200000;
			    }
			    System.out.println("1. Ekonomi (Rp. 700.000)");
			    System.out.println("2. Bisnis (Rp. 1.200.000)");
			} else if (menu_jurusan == 3) {
			    if (menu_kelas == 1) {
				total = 500000;
			    } else if (menu_kelas == 2) {
				total = 1000000;
			    }
			    System.out.println("1. Ekonomi (Rp. 500.000)");
			    System.out.println("2. Bisnis (Rp. 1.000.000)");
			} else if (menu_jurusan == 4) {
			    if (menu_kelas == 1) {
				total = 1500000;
			    } else if (menu_kelas == 2) {
				total = 2000000;
			    }
			    System.out.println("1. Ekonomi (Rp. 1.500.000)");
			    System.out.println("2. Bisnis (Rp. 2.000.000)");
			}
		    } else {
			System.out.println("Silahkan pilihan jurusan penerbangan terlebih dahulu.");
		    }
		} else if (menu == 3) {
		    if (menu_jurusan != 0 && menu_kelas != 0) {
			System.out.println("=========Tiket Penerbangan=========");
			System.out.println("Nomor KTP : " + no_ktp);
			System.out.println("Nama : " + nama);
			System.out.println("Alamat : " + alamat);
			System.out.println("Jenis Kelamin : " + jk);
			System.out.println("Umur : " + umur);
			System.out.println("Jurusan Penerbangan : " + jurusan);
			System.out.println("Kelas Penerbangan : " + kelas);
			if (umur >= 0 && umur <= 5) {
			    total = (int) (total - (total*0.30));
			}
			System.out.println("Total Bayar : " + total);
		    } else {
			System.out.println("Silahkan pilih jurusan atau kelas penerbangan terlebih dahulu.");
		    }
		} else if (menu == 4) {
		    loop = false;
		}
	    }
	}
    }
}
