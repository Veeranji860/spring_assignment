package com.practice.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.practice.bo.EmployeeRegBo;

public class EmployeeRegImpl implements IEmployeeReg {
	private static final String EMP_INSERT="INSERT INTO EMP_REG_PRACTICE VALUES(EMP_SEQ.NEXTVAL,?,?,?,?)";
	private DataSource ds;

	/**
	 * @return the ds
	 */
	public DataSource getDs() {
		return ds;
	}

	/**
	 * @param ds the ds to set
	 */
	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	public int insert(EmployeeRegBo empBo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		try {
			con=ds.getConnection();
			ps=con.prepareStatement(EMP_INSERT);
			ps.setString(1, empBo.geteName());
			ps.setFloat(2, empBo.getBasicSalary());
			ps.setFloat(3, empBo.getGrossSalary());
			ps.setFloat(4, empBo.getNetSalary());
			count=ps.executeUpdate();
			
		}catch(Exception e) {
			throw e;
		}
		return count;
	}

}
