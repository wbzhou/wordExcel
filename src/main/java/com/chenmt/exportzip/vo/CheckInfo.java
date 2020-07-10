package com.chenmt.exportzip.vo;

/**
 * @author :zhouwenbin
 * @time   :2020/7/9
 * @comment:
 **/

public class CheckInfo {
	private String number;
	private String checkDate;
	private String outDate;
	private String report;
	private String conclusion;


	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCheckDate() {
		return checkDate;
	}

	public void setCheckDate(String checkDate) {
		this.checkDate = checkDate;
	}

	public String getReport() {
		return report;
	}

	public void setReport(String report) {
		this.report = report;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}
}
