package com.ctrip.vac.tool.winupload.dataschema;

import com.ctrip.vac.tool.winupload.dataschema.meta.DataSchema;

public class vs_sales_indicatrix extends DataSchema {

	public int year_num;
	public int month_num;
	public int day_num;
	public String groupname;
	public int grade;
	public double indicatrix;
	
	
	public String getGroupname() {
		return groupname;
	}


	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}


	public int getYear_num() {
		return year_num;
	}


	public void setYear_num(int year_num) {
		this.year_num = year_num;
	}


	public int getMonth_num() {
		return month_num;
	}


	public void setMonth_num(int month_num) {
		this.month_num = month_num;
	}


	public int getDay_num() {
		return day_num;
	}


	public void setDay_num(int day_num) {
		this.day_num = day_num;
	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public double getIndicatrix() {
		return indicatrix;
	}


	public void setIndicatrix(double indicatrix) {
		this.indicatrix = indicatrix;
	}


	@Override
	public String getValueString() {
		return year_num + "," +
		month_num + "," +
		day_num + "," +
		groupname + "," +
		grade + "," +
		indicatrix;
	}

}
