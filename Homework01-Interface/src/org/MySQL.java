package org;

public class MySQL implements IDatabase {

	@Override
	public void create() {
		System.out.println("MySQL - Oluştur");
	}

	@Override
	public void read() {
		System.out.println("MySQL - Oku");
	}

	@Override
	public void update() {
		System.out.println("MySQL - Güncelle");
	}

	@Override
	public void delete() {
		System.out.println("MySQL - Sil");
	}

}