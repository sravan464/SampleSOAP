package com.rhpsoft.Interfaces;

public interface IQueryConstants {
	String GET_ALL_EMP="select EMPLOYEE_ID,LAST_NAME,EMAIL,HIRE_DATE,JOB_ID,DEPARTMENT_ID from employees";
	String GET_ALL_EMP_BY_DEP="select EMPLOYEE_ID,LAST_NAME,EMAIL,HIRE_DATE,JOB_ID,DEPARTMENT_ID from employees where DEPARTMENT_ID = ? ";
    String INSERT_EMP="insert into employees(EMPLOYEE_ID,LAST_NAME,EMAIL,HIRE_DATE,JOB_ID,DEPARTMENT_ID) values(?,?,?,?,?,?) ";
}
