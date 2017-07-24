package com.ctrip.vac.tool.winupload.dataschema;

import com.ctrip.vac.tool.winupload.dataschema.meta.DataSchema;

/**
 * Created by longgao on 2017/7/21.
 */
public class vdpauth extends DataSchema {
    public String emp_name;
    public String depa_region;
    public String dest_region;
    public String loginid;
    public String valid_date;

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getDepa_region() {
        return depa_region;
    }

    public void setDepa_region(String depa_region) {
        this.depa_region = depa_region;
    }

    public String getDest_region() {
        return dest_region;
    }

    public void setDest_region(String dest_region) {
        this.dest_region = dest_region;
    }

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    public String getValid_date() {
        return valid_date;
    }

    public void setValid_date(String valid_date) {
        this.valid_date = valid_date;
    }

    public String getValueString() {
        return emp_name + "," +
                depa_region + "," +
                dest_region + "," +
                loginid + "," +
                valid_date;
    }
}
