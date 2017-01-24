package com.ctrip.vac.tool.winupload.dataschema;

import com.ctrip.vac.tool.winupload.dataschema.meta.DataSchema;

public class vs_bonus_indicatrix extends DataSchema {
	public int y;
	public int m;
	public int gn_order2;
	public int grade;
	public double proportion;
	public long amount;
	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getGn_order2() {
		return gn_order2;
	}

	public void setGn_order2(int gn_order2) {
		this.gn_order2 = gn_order2;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public double getProportion() {
		return proportion;
	}

	public void setProportion(double proportion) {
		this.proportion = proportion;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	@Override
	public String getValueString() {
		return y  + "," +
			       m  + "," +
			       gn_order2  + "," +
			       grade  + "," +
			       proportion  + "," +
			       amount;
	}

}
