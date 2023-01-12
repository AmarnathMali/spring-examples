package com.product;

import java.util.List;
import java.util.Map;

public interface DBoperation {

	//public int insertInfo(int eid,String ename,String address);
	  //public int updateDetails(int eid,String newname,String newaddress);
	  //public int deleteDetails(int eid);
	 //public List getDetails();
		public Map getEmpDetails(int eid);

}
