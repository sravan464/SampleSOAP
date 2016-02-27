 package com.rhpsoft.beans;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.rhpsoft.Interfaces.IEmployeeDAO;
import com.rhpsoft.Interfaces.IQueryConstants;

public class EmployeeDAOImpl implements IEmployeeDAO {
	private JdbcTemplate jdbcTemplate;
	/*public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}*/
	public List<Employee> getListOfEmployees() {
		List<Employee> emp = new ArrayList<Employee>();
		try 
		{
			emp = jdbcTemplate.query(IQueryConstants.GET_ALL_EMP, new EmpMapper());
		} catch (DataAccessException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;
	}
	public static final class EmpMapper implements RowMapper<Employee> {
		public Employee mapRow(ResultSet rs, int RowNum) throws SQLException {
			Employee emp = new Employee();
			emp.setEMPLOYEE_ID(rs.getInt("EMPLOYEE_ID"));
			emp.setLAST_NAME(rs.getString("LAST_NAME"));
			emp.setEMAIL(rs.getString("EMAIL"));
			emp.setHIRE_DATE(rs.getDate("HIRE_DATE"));
			emp.setJOB_ID(rs.getString("JOB_ID"));
			emp.setDEPARTMENT_ID(rs.getInt("DEPARTMENT_ID"));
			return emp;
		}
	}
	public List<Employee> getListOfEmployeesByDepartment(int departmentID) {
		// TODO Auto-generated method stub
		Object[] parameters = { departmentID };
		List<Employee> emp = new ArrayList<Employee>();
		emp = jdbcTemplate.query(IQueryConstants.GET_ALL_EMP_BY_DEP, parameters, new EmpMapper());
		return emp;
	}
	public int createEmployee(Employee e) {
		// TODO Auto-generated method stub
		return 0;
	}
}