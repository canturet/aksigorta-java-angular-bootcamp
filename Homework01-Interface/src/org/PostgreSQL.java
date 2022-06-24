package org;

public class PostgreSQL implements IDatabase {

	@Override
	public void create() {
		System.out.println("PostgreSQL - Oluştur");
	}

	@Override
	public void read() {
		System.out.println("PostgreSQL - Oku");
	}

	@Override
	public void update() {
		System.out.println("PostgreSQL - Güncelle");
	}

	@Override
	public void delete() {
		System.out.println("PostgreSQL - Sil");
	}

}