package com.ctrip.vac.tool.winupload.dataschema;

import com.ctrip.vac.tool.winupload.dataschema.meta.DataSchema;

public class vs_sales_indicatrix extends DataSchema {
    public String date;
    public String group_order;
    public String group_name;
    public String grade_order;
    public String grade_name;
	public double indicatrix;

	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getGroup_order() {
		return group_order;
	}


	public void setGroup_order(String group_order) {
		this.group_order = group_order;
	}


	public String getGroup_name() {
		return group_name;
	}


	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}


	public String getGrade_order() {
		return grade_order;
	}


	public void setGrade_order(String grade_order) {
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
				group_order + "," +
				group_name + "," +
				grade_order + "," +
				grade_name + "," +
				indicatrix;
	}

}
