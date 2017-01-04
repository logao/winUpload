package com.ctrip.vac.tool.winupload.dataschema;

import com.ctrip.vac.tool.winupload.dataschema.meta.DataSchema;

public class vs_cr_indicatric extends DataSchema {
	public String date;
	public int gn_order1;
	public String gn1;
	public int grade_order;
	public String grade_name;
	public double indicatrix;
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getGn_order1() {
		return gn_order1;
	}

	public void setGn_order1(int gn_order1) {
		this.gn_order1 = gn_order1;
	}

	public String getGn1() {
		return gn1;
	}

	public void setGn1(String gn1) {
		this.gn1 = gn1;
	}

	public int getGrade_order() {
		return grade_order;
	}

	public void setGrade_order(int grade_order) {
		this.grade_order = grade_order;
	}

	public String getGrade_name() {
		return grade_name;
	}

	public void setGrade_name(String grade_name) {
		this.grade_name = grade_name;
	}

	public double getIndicatrix() {
		return indicatrix;
	}

	public void setIndicatrix(double indicatrix) {
		this.indicatrix = indicatrix;
	}

	@Override
	public String getValueString() {
		return date + "," +
				gn_order1 + "," +
				gn1 + "," +
				grade_order + "," +
				grade_name + "," +
				indicatrix;
	}

}
