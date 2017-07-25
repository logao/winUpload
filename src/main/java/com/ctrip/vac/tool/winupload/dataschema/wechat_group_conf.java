package com.ctrip.vac.tool.winupload.dataschema;

import com.ctrip.vac.tool.winupload.dataschema.meta.DataSchema;

/**
 * Created by longgao on 2017/7/24.
 */
public class wechat_group_conf extends DataSchema {
    public String wenxino;
    public String mobile;
    public String mno;
    public String eid;
    public String issample;
    public String batchno;

    public String getWenxino() {
        return wenxino;
    }

    public void setWenxino(String wenxino) {
        this.wenxino = wenxino;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMno() {
        return mno;
    }

    public void setMno(String mno) {
        this.mno = mno;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getIssample() {
        return issample;
    }

    public void setIssample(String issample) {
        this.issample = issample;
    }

    public String getBatchno() {
        return batchno;
    }

    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }

    public String getValueString() {
        return wenxino + "," +
                mobile + "," +
                mno + "," +
                eid + "," +
                issample + "," +
                batchno;
    }
}
