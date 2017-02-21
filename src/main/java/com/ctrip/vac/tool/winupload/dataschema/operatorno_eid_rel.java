package com.ctrip.vac.tool.winupload.dataschema;

import com.ctrip.vac.tool.winupload.dataschema.meta.DataSchema;

/**
 * Created by longgao on 2017/2/21.
 */
public class operatorno_eid_rel extends DataSchema {
    public String OperatorNo;
    public String StartDate;
    public String EndDate;
    public String EID;

    @Override
    public String getValueString() {
        return OperatorNo + "," +
                StartDate + "," +
                EndDate + "," +
                EID;
    }

    public String getOperatorNo() {
        return OperatorNo;
    }

    public void setOperatorNo(String operatorNo) {
        OperatorNo = operatorNo;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String endDate) {
        EndDate = endDate;
    }

    public String getEID() {
        return EID;
    }

    public void setEID(String EID) {
        this.EID = EID;
    }
}
