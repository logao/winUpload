package com.ctrip.vac.tool.winupload.dataschema;

import com.ctrip.vac.tool.winupload.dataschema.meta.DataSchema;

public class level2_level1_mapping extends DataSchema {

    public String level1;
    public String level2;


    public String getLevel1() {
        return level1;
    }


    public void setLevel1(String level1) {
        this.level1 = level1;
    }


    public String getLevel2() {
        return level2;
    }


    public void setLevel2(String level2) {
        this.level2 = level2;
    }


    @Override
    public String getValueString() {
        return level1 + "," + level2;
    }

}
