
package com.ctrip.vac.tool.winupload.dataschema;

import com.ctrip.vac.tool.winupload.dataschema.meta.DataSchema;

/**
 * Created by bzhu on 2017/2/23.
 */
public class complaintscategory_cs1009 extends DataSchema{
    public int ProductTypeID;
    public String SubReason;
    public String SubShortName;
    public String Process;
	public int CustomerPrice;
	
    public String getValueString() {
        return ProductTypeID + "," +
                SubReason + "," +
                SubShortName + "," +
                Process + "," +
				CustomerPrice;
    }

    public int getProductTypeID() {
        return ProductTypeID;
    }

    public void setProductTypeID(int productTypeID) {
        ProductTypeID = productTypeID;
    }

    public String getSubReason() {
        return SubReason;
    }

    public void setSubReason(String subReason) {
        SubReason = subReason;
    }

    public String getSubShortName() {
        return SubShortName;
    }

    public void setSubShortName(String subShortName) {
        SubShortName = subShortName;
    }

    public String getProcess() {
        return Process;
    }

    public void setProcess(String process) {
        Process = process;
    }

	public int getCustomerPrice() {
        return CustomerPrice;
    }

    public void setCustomerPrice(int customerPrice) {
        CustomerPrice = customerPrice;
    }
	
}

