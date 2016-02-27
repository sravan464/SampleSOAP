package com.rhpsoft.Interfaces;

import java.util.List;

import com.rhpsoft.beans.Employee;

public interface IEmployeeDAO {
	
	public List<Employee> getListOfEmployees();
	public List<Employee> getListOfEmployeesByDepartment(int departmentID);
	public int createEmployee(Employee e);

}
