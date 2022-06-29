package org.egitim.spring.domain;

public class DbManager {

	/* Attributes */
	private TransactionManager transactionManager;

	/* Construction */
	public DbManager(String connectionURL, String user, String password, int timeoutMinute) {
		// Construction
		// Connection operations
	}

	public void initialize() {
		System.out.println("Datbase Connection Established");
	}

	/* Getters & Setters */
	public TransactionManager getTransactionManager() {
		return transactionManager;
	}

	public void setTransactionManager(TransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

	/* Service Method */
	public boolean insertEntity(Object entity) {
		return true;
	}

	public boolean updateEntity(Object entity) {
		return true;
	}

	/* Destroy */
	/* destroy-method sadece singleton scope için kullanılabiliyor. */
	public void destroy() {
		System.out.println("Database Connection Closed");
	}

}
