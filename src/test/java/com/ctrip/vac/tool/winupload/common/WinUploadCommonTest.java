package com.ctrip.vac.tool.winupload.common;

import junit.framework.Assert;
import org.junit.Test;

import com.ctrip.vac.tool.winupload.dataschema.meta.DataSchema;



public class WinUploadCommonTest {

	@Test
	public void testGetDataSchema() throws Exception {
		
//		DataSchema caect = WinUploadCommon.getDataSchema("CubeAbtestEdmConfigTmp");
//		DataSchema hch = WinUploadCommon.getDataSchema("HwCoreHotelid");
//		
//		Assert.assertEquals("getDataSchema CubeAbtestEdmConfigTmp faile", caect.getTableName(), "winupload_CubeAbtestEdmConfigTmp");
//		Assert.assertEquals("getDataSchema HwCoreHotelid faile", hch.getTableName(), "winupload_HwCoreHotelid");
	}

	@Test
	public void testGetDbDataType() {
		WinUploadCommon.getDbDataType("test_column","class java.lang.Long");
	}
	
}
