package com.ctrip.vac.tool.winupload.dataschema;

import com.ctrip.vac.tool.winupload.dataschema.meta.DataSchema;

/**
 * Created by longgao on 2017/2/21.
 */
public class tempoperatorno extends DataSchema{
    public String UserNo;
    public String Name;
    public String GroupName;
    public String EID;
    public String EntryDate;
    public String Email;
    public String OperatorNo;

    public String getValueString() {
        return UserNo + "," +
                Name + "," +
                GroupName + "," +
                EID + "," +
                EntryDate + "," +
                Email + "," +
                OperatorNo;
    }

    public String getUserNo() {
        return UserNo;
    }

    public void setUserNo(String userNo) {
        UserNo = userNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGroupName() {
        return GroupName;
    }

    public void setGroupName(String groupName) {
        GroupName = groupName;
    }

    public String getEID() {
        return EID;
    }

    public void setEID(String EID) {
        this.EID = EID;
    }

    public String getEntryDate() {
        return EntryDate;
    }

    public void setEntryDate(String entryDate) {
        EntryDate = entryDate;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getOperatorNo() {
        return OperatorNo;
    }

    public void setOperatorNo(String operatorNo) {
        OperatorNo = operatorNo;
    }
}
