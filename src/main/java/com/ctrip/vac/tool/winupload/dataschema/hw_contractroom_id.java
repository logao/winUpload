package com.ctrip.vac.tool.winupload.dataschema;

import com.ctrip.vac.tool.winupload.dataschema.meta.DataSchema;

public class hw_contractroom_id extends DataSchema {

	public String countryname;
	public String cityname;
	public String hotelname;
	public String hotelid;
	public String roomid;
	public String roomname;
	public String isdaily_contract;	
	
	@Override
	public String getValueString() {
		return countryname + "," +
				cityname + "," +
				hotelname + "," +
				hotelid + "," +
				roomid + "," +
				roomname + "," +
				isdaily_contract;
	}	
	
	
	public String getCountryname() {
		return countryname;
	}




	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}




	public String getCityname() {
		return cityname;
	}




	public void setCityname(String cityname) {
		this.cityname = cityname;
	}




	public String getHotelname() {
		return hotelname;
	}




	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}




	public String getHotelid() {
		return hotelid;
	}




	public void setHotelid(String hotelid) {
		this.hotelid = hotelid;
	}




	public String getRoomid() {
		return roomid;
	}




	public void setRoomid(String roomid) {
		this.roomid = roomid;
	}




	public String getRoomname() {
		return roomname;
	}




	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}




	public String getIsdaily_contract() {
		return isdaily_contract;
	}




	public void setIsdaily_contract(String isdaily_contract) {
		this.isdaily_contract = isdaily_contract;
	}






}
