package com.ctrip.vac.tool.winupload.dataschema;

import com.ctrip.vac.tool.winupload.dataschema.meta.DataSchema;

/**
 * Created by longgao on 2017/4/18.
 */
public class vs_funnel_indicatrix extends DataSchema {

    public String date;
    public String name;
    public long indicatrix;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getIndicatrix() {
        return indicatrix;
    }

    public void setIndicatrix(long indicatrix) {
        this.indicatrix = indicatrix;
    }

    public String getValueString() {
        Object[] ol = {date, name, indicatrix};
        return DataSchema.createString(ol);
    }


}
