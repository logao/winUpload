package com.ctrip.vac.tool.winupload.dataschema;

import com.ctrip.vac.tool.winupload.dataschema.meta.DataSchema;

/**
 * Created by bzhu on 2017/8/1.
 */
public class vacation_permission_for_business_manager extends DataSchema {
    public String userNo;
    public String userName;
    public String hasHighPermission;
    public String pm_Eid;
    public String pm_EidName;
    public String pbmEid;
    public String pbmEidName;
    public String saleMode;
    public String startCityRegion;
    public String domain;
    public String destFirstRegion;
    public String destSecRegion;
    public String productPatternName;
    public String updateDt;
    public String role;
    public String loginId;

    public String getValueString() {
        return userNo + "," +
                userName + "," +
                hasHighPermission + "," +
                pm_Eid + "," +
                pm_EidName + "," +
                pbmEid + "," +
                pbmEidName + "," +
                saleMode + "," +
                startCityRegion + "," +
                domain + "," +
                destFirstRegion + "," +
                destSecRegion + "," +
                productPatternName + "," +
                updateDt + "," +
                role + "," +
                loginId;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHasHighPermission() {
        return hasHighPermission;
    }

    public void setHasHighPermission(String hasHighPermission) {
        this.hasHighPermission = hasHighPermission;
    }

    public String getPm_Eid() {
        return pm_Eid;
    }

    public void setPm_Eid(String pm_Eid) {
        this.pm_Eid = pm_Eid;
    }

    public String getPm_EidName() {
        return pm_EidName;
    }

    public void setPm_EidName(String pm_EidName) {
        this.pm_EidName = pm_EidName;
    }

    public String getPbmEid() {
        return pbmEid;
    }

    public void setPbmEid(String pbmEid) {
        this.pbmEid = pbmEid;
    }

    public String getPbmEidName() {
        return pbmEidName;
    }

    public void setPbmEidName(String pbmEidName) {
        this.pbmEidName = pbmEidName;
    }

    public String getSaleMode() {
        return saleMode;
    }

    public void setSaleMode(String saleMode) {
        this.saleMode = saleMode;
    }

    public String getStartCityRegion() {
        return startCityRegion;
    }

    public void setStartCityRegion(String startCityRegion) {
        this.startCityRegion = startCityRegion;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getDestFirstRegion() {
        return destFirstRegion;
    }

    public void setDestFirstRegion(String destFirstRegion) {
        this.destFirstRegion = destFirstRegion;
    }

    public String getDestSecRegion() {
        return destSecRegion;
    }

    public void setDestSecRegion(String destSecRegion) {
        this.destSecRegion = destSecRegion;
    }

    public String getProductPatternName() {
        return productPatternName;
    }

    public void setProductPatternName(String productPatternName) {
        this.productPatternName = productPatternName;
    }

    public String getUpdateDt() {
        return updateDt;
    }

    public void setUpdateDt(String updateDt) {
        this.updateDt = updateDt;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }
}
