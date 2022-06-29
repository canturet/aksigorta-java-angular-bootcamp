package org.egitim.spring.domain;

public class BaseController {

	private DbManager dbManager;

	public DbManager getDbManager() {
		return dbManager;
	}

	public void setDbManager(DbManager dbManager) {
		this.dbManager = dbManager;
	}

}
