package com.ctrip.vac.tool.winupload.dataschema;

import com.ctrip.vac.tool.winupload.dataschema.meta.DataSchema;

public class hw_core_hotelid extends DataSchema {

    public Long hotel;

    @Override
    public String getValueString() {
        return hotel.toString();
    }

}
