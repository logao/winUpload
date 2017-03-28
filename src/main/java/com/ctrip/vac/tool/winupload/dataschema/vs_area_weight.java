package com.ctrip.vac.tool.winupload.dataschema;

import com.ctrip.vac.tool.winupload.dataschema.meta.DataSchema;

public class vs_area_weight extends DataSchema {

	public String area;
	public String weight;
	public int od;
	
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}


	public int getOd() {
		return od;
	}

	public void setOd(int od) {
		this.od = od;
	}

	@Override
	public String getValueString() {
		return area + "," +
				weight + "," +
				od;
	}

}
