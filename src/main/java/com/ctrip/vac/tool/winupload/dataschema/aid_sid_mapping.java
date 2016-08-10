package com.ctrip.vac.tool.winupload.dataschema;

import com.ctrip.vac.tool.winupload.dataschema.meta.DataSchema;

public class aid_sid_mapping extends DataSchema {
	public Long allianceid;
	public String alliancename;
	public Long sid;
	public String sitename;
	public String level2;
	public int PC;
	public int H5;
	public Long UV;
	public String level3;
	
	
	
	public Long getAllianceid() {
		return allianceid;
	}

	public void setAllianceid(Long allianceid) {
		this.allianceid = allianceid;
	}

	public String getAlliancename() {
		return alliancename;
	}

	public void setAlliancename(String alliancename) {
		this.alliancename = alliancename;
	}

	public Long getSid() {
		return sid;
	}

	public void setSid(Long sid) {
		this.sid = sid;
	}

	public String getSitename() {
		return sitename;
	}

	public void setSitename(String sitename) {
		this.sitename = sitename;
	}

	public String getLevel2() {
		return level2;
	}

	public void setLevel2(String level2) {
		this.level2 = level2;
	}

	public int getPC() {
		return PC;
	}

	public void setPC(int pC) {
		PC = pC;
	}

	public int getH5() {
		return H5;
	}

	public void setH5(int h5) {
		H5 = h5;
	}

	public Long getUV() {
		return UV;
	}

	public void setUV(Long uV) {
		UV = uV;
	}



	public String getLevel3() {
		return level3;
	}



	public void setLevel3(String level3) {
		this.level3 = level3;
	}



	@Override
	public String getValueString() {
		return allianceid + "," +
				alliancename + "," +
				sid + "," +
				sitename + "," +
				level2 + "," +
				PC + "," +
				H5 + "," +
				UV + "," +
				level3;
	}

}
