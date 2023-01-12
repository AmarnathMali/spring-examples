package com.product;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class DBoperationBean implements DBoperation{
	
private JdbcTemplate jt;
	
	

	public DBoperationBean(JdbcTemplate jt) {
	super();
	this.jt = jt;
}



	/*public List getDetails() {
		List m = jt.queryForList("select * from emp");
		return m;
	}*/

	public Map getEmpDetails(int eid) {
		Map m = jt.queryForMap("select * from emp where id=?",new Object[]{eid});
		return m;
	}

  /* public int deleteDetails(int eid) {
		int result = jt.update("delete from emp where id=?",new Object[]{eid});
		return result;
	}*/
	
	/*public int insertInfo(int eid, String ename, String address) {
		int result = jt.update("insert into emp values(?,?,?)",new Object[]{eid,ename,address});
		return result;
	}*/

	/*public int updateDetails(int eid, String newname, String newaddress) {
		int result = jt.update("update emp set pname=?,address=? where id=?",new Object[]{newname,newaddress,eid});
		return result;
	}*/


	

	

}
