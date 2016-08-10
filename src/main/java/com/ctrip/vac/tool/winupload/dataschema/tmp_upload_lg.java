package com.ctrip.vac.tool.winupload.dataschema;

import com.ctrip.vac.tool.winupload.dataschema.meta.DataSchema;

public class tmp_upload_lg extends DataSchema {
	public String c1;
	public String c2;
	public String c3;
	public String c4_date;
	
	public String getC4_date() {
		return c4_date;
	}

	public void setC4_date(String c4_date) {
		this.c4_date = c4_date;
	}

	@Override
	public String getValueString() {
		return 
				c1 + "," + 
				c2  + "," + 
				c3 + "," + 
				c4_date;
	}

	public String getC1() {
		return c1;
	}

	public void setC1(String c1) {
		this.c1 = c1;
	}

	public String getC2() {
		return c2;
	}

	public void setC2(String c2) {
		this.c2 = c2;
	}

	public String getC3() {
		return c3;
	}

	public void setC3(String c3) {
		this.c3 = c3;
	}
}
