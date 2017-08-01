package com.ctrip.vac.tool.winupload.dataschema;

import com.ctrip.vac.tool.winupload.dataschema.meta.DataSchema;

/**
 * Created by bzhu on 2017/8/1.
 */
public class vacation_permission_for_business_manager extends DataSchema {
    public String UserNo;
    public String UserName;
    public String HasHighPermission;
    public String Pm_Eid;
    public String Pm_EidName;
    public String PbmEid;
    public String PbmEidName;
    public String SaleMode;
    public String StartCityRegion;
    public String Domain;
    public String DestFirstRegion;
    public String DestSecRegion;
    public String ProductPatternName;
    public String UpdateDt;
    public String Role;
    public String LoginId;

    public String getUserNo() {
        return userno;
    }

    public void setUserNo(String userno) {
        this.userno = userno;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public String getHasHighPermission() {
        return hashighpermission;
    }

    public void setHasHighPermission(String hashighpermission) {
        this.hashighpermission = hashighpermission;
    }

    public String getPm_Eid() {
        return pm_eid;
    }

    public void setPm_Eid(String pm_eid) {
        this.pm_eid = pm_eid;
    }

    public String getPm_EidName() {
        return pm_eidname;
    }

    public void setPm_EidName(String pm_eidname) {
        this.pm_eidname = pm_eidname;
    }

    public String getPbmEid() {
        return pbmeid;
    }

    public void setPbmEid(String pbmeid) {
        this.pbmeid = pbmeid;
    }

    public String getPbmEidName() {
        return pbmeidname;
    }

    public void setPbmEidName(String pbmeidname) {
        this.pbmeidname = pbmeidname;
    }

    public String getSaleMode() {
        return salemode;
    }

    public void setSaleMode(String salemode) {
        this.salemode = salemode;
    }

    public String getStartCityRegion() {
        return startcityregion;
    }

    public void setStartCityRegion(String startcityregion) {
        this.startcityregion = startcityregion;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getDestFirstRegion() {
        return destfirstregion;
    }

    public void setDestFirstRegion(String destfirstregion) {
        this.destfirstregion = destfirstregion;
    }

    public String getDestSecRegion() {
        return destsecregion;
    }

    public void setDestSecRegion(String destsecregion) {
        this.destsecregion = destsecregion;
    }

    public String getProductPatternName() {
        return productpatternname;
    }

    public void setProductPatternName(String productpatternname) {
        this.productpatternname = productpatternname;
    }

    public String getUpdateDt() {
        return updatedt;
    }

    public void setUpdateDt(String updatedt) {
        this.updatedt = updatedt;
    }

    public String getRole() {
        return myrole;
    }

    public void setRole(String myrole) {
        this.myrole = myrole;
    }

    public String getLoginId() {
        return loginid;
    }

    public void setLoginId(String loginid) {
        this.loginid = loginid;
    }

    public String getValueString() {
        return UserNo + "," +
                UserName + "," +
                HasHighPermission + "," +
                Pm_Eid + "," +
                Pm_EidName + "," +
                PbmEid + "," +
                PbmEidName + "," +
                SaleMode + "," +
                StartCityRegion + "," +
                Domain + "," +
                DestFirstRegion + "," +
                DestSecRegion + "," +
                ProductPatternName + "," +
                UpdateDt + "," +
                Role + "," +
                LoginId;
    }
}
