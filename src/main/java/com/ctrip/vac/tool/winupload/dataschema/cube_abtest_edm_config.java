package com.ctrip.vac.tool.winupload.dataschema;

import com.ctrip.vac.tool.winupload.dataschema.meta.DataSchema;

public class cube_abtest_edm_config extends DataSchema {
	public String edm_cube_expcode;
	public String plancode_list;
	public String cumstart_date;
	public String cumend_date;
	
	public String getEdm_cube_expcode() {
		return edm_cube_expcode;
	}

	public void setEdm_cube_expcode(String edm_cube_expcode) {
		this.edm_cube_expcode = edm_cube_expcode;
	}

	public String getPlancode_list() {
		return plancode_list;
	}

	public void setPlancode_list(String plancode_list) {
		this.plancode_list = plancode_list;
	}

	public String getCumstart_date() {
		return cumstart_date;
	}

	public void setCumstart_date(String cumstart_date) {
		this.cumstart_date = cumstart_date;
	}

	public String getCumend_date() {
		return cumend_date;
	}

	public void setCumend_date(String cumend_date) {
		this.cumend_date = cumend_date;
	}

	@Override
	public String getValueString() {
		return 
			edm_cube_expcode + "," + 
			plancode_list  + "," + 
			cumstart_date + "," +
			cumend_date;
	}
	
}
