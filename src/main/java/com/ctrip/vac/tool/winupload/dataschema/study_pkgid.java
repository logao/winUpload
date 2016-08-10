package com.ctrip.vac.tool.winupload.dataschema;

import com.ctrip.vac.tool.winupload.dataschema.meta.DataSchema;

public class study_pkgid extends DataSchema {

	public Long pkgid;
		
	public Long getPkgid() {
		return pkgid;
	}

	public void setPkgid(Long pkgid) {
		this.pkgid = pkgid;
	}

	@Override
	public String getValueString() {
		return pkgid.toString();
	}

}
