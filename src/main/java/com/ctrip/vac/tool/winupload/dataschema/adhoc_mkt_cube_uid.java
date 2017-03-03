package com.ctrip.vac.tool.winupload.dataschema;

import com.ctrip.vac.tool.winupload.dataschema.meta.DataSchema;

public class adhoc_mkt_cube_uid extends DataSchema {

	public String plancode;
	public String uid;
	
	@Override
	public String getValueString() {
		return plancode + " " + uid;
	}

}
