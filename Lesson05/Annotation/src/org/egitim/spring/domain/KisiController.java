package org.egitim.spring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class KisiController {

	private KisiService kisiService;

	@Autowired
	private DatabaseOperator databaseOperator;

	private ReportService reportService;

	private FileService fileService;

	@Autowired
	private DateUtility dateUtility;

	@Autowired
	public KisiController(ReportService reportService) {
		this.reportService = reportService;
	}

	public KisiService getKisiService() {
		return kisiService;
	}

	@Autowired
	public void setKisiService(KisiService kisiService) {
		this.kisiService = kisiService;
	}

	public DatabaseOperator getDatabaseOperator() {
		return databaseOperator;
	}

	public void setDatabaseOperator(DatabaseOperator databaseOperator) {
		this.databaseOperator = databaseOperator;
	}

	public ReportService getReportService() {
		return reportService;
	}

	public void setReportService(ReportService reportService) {
		this.reportService = reportService;
	}

	public FileService getFileService() {
		return fileService;
	}

	public void setFileService(FileService fileService) {
		this.fileService = fileService;
	}

	public DateUtility getDateUtility() {
		return dateUtility;
	}

	public void setDateUtility(DateUtility dateUtility) {
		this.dateUtility = dateUtility;
	}

}
