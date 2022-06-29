package org.egitim.spring.domain;

public class KisiController extends BaseController {

	public boolean insertKisi(Kisi kisi) {
		return getDbManager().insertEntity(kisi);
	}

	public boolean updateKisi(Kisi kisi) {
		return getDbManager().updateEntity(kisi);
	}

}
