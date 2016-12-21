package com.ctrip.vac.tool.winupload.dataschema;

import com.ctrip.vac.tool.winupload.dataschema.meta.DataSchema;

public class vs_sales_indicatrix_avg extends DataSchema {
    public String date;
    public int group_order;
    public String group_name;
	public double indicatrix;
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getGroup_order() {
		return group_order;
	}

	public void setGroup_order(int group_order) {
		this.group_order = group_order;
	}

	public String getGroup_name() {
		return group_name;
	}

	public void setGroup_name(String group_name) {
		this.group_name = group_name;
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
				indicatrix;
	}

}
