package com.ctrip.vac.tool.winupload.dataschema;

import com.ctrip.vac.tool.winupload.dataschema.meta.DataSchema;

public class tmp_room_wyc extends DataSchema {
	
	public Long room;
	
	public Long getRoom() {
		return room;
	}

	public void setRoom(Long room) {
		this.room = room;
	}

	@Override
	public String getValueString() {
		return room.toString();
	}

}
