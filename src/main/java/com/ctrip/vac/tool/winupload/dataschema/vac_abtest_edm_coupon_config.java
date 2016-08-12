package com.ctrip.vac.tool.winupload.dataschema;

import com.ctrip.vac.tool.winupload.dataschema.meta.DataSchema;

public class vac_abtest_edm_coupon_config extends DataSchema {

	public String edm_expcode;
	public String ab_expcode_list;
	public String cumstart_date;
	public String cumend_date;
	public String promotionid_list;
	public String edm_sourcetype;	
	
	public String getEdm_expcode() {
		return edm_expcode;
	}

	public void setEdm_expcode(String edm_expcode) {
		this.edm_expcode = edm_expcode;
	}

	public String getAb_expcode_list() {
		return ab_expcode_list;
	}

	public void setAb_expcode_list(String ab_expcode_list) {
		this.ab_expcode_list = ab_expcode_list;
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

	public String getPromotionid_list() {
		return promotionid_list;
	}

	public void setPromotionid_list(String promotionid_list) {
		this.promotionid_list = promotionid_list;
	}

	public String getEdm_sourcetype() {
		return edm_sourcetype;
	}

	public void setEdm_sourcetype(String edm_sourcetype) {
		this.edm_sourcetype = edm_sourcetype;
	}


	@Override
	public String getValueString() {
		return edm_expcode + "," +
				ab_expcode_list + "," +
				cumstart_date + "," +
				cumend_date + "," +
				promotionid_list + "," +
				edm_sourcetype;
	}

}
