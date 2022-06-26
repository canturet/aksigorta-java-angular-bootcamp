package org;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		System.out.println("1 - MySQL");
		System.out.println("2 - PostgreSQL");
		System.out.print("İşlem yapmak istediğiniz veritabanı : ");
		Scanner scanner = new Scanner(System.in);
		int selectDatabase = scanner.nextInt();

		IDatabase database = null;

		if (selectDatabase == 1) {
			database = new MySQL();

		} else if (selectDatabase == 2) {
			database = new PostgreSQL();

		} else {
			System.err.println("Hatalı giriş yaptınız.");
			System.exit(0);
		}

		switch (operation()) {
		case 1:
			database.create();
			break;
		case 2:
			database.read();
			break;
		case 3:
			database.update();
			break;
		case 4:
			database.delete();
			break;
		default:
			System.err.println("Hatalı giriş yaptınız.");
			System.exit(0);
		}

	}

	private static int operation() {
		System.out.println("1 - Oluştur");
		System.out.println("2 - Oku");
		System.out.println("3 - Güncelle");
		System.out.println("4 - Sil");
		System.out.print("Yapmak istediğiniz işlem tipi : ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

}