package com.rhpsoft.hibernate.core.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Employee implements Serializable {
		private static final long serialVersionUID = 1L;
	
		private int employeeId;
		private String firstName;
		private String lastName;
		private String email;
		private Date hireDate;
		private double salary;
		private String phoneNumber;
		
		private int departmentId;
		private String jobId;
		
		
		
		public Employee() {
		}


		public int getEmployeeId() {
			return employeeId;
		}


		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}


		public String getFirstName() {
			return firstName;
		}


		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}


		public String getLastName() {
			return lastName;
		}


		public void setLastName(String lastName) {
			this.lastName = lastName;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public Date getHireDate() {
			return hireDate;
		}


		public void setHireDate(Date hireDate) {
			this.hireDate = hireDate;
		}


		public double getSalary() {
			return salary;
		}


		public void setSalary(double salary) {
			this.salary = salary;
		}


		public String getPhoneNumber() {
			return phoneNumber;
		}


		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}


		public int getDepartmentId() {
			return departmentId;
		}


		public void setDepartmentId(int departmentId) {
			this.departmentId = departmentId;
		}


		public String getJobId() {
			return jobId;
		}


		public void setJobId(String jobId) {
			this.jobId = jobId;
		}


		
		
}	
