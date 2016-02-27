package EmployeeGroup.EmpBackEndPro;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rhpsoft.beans.Employee;
import com.rhpsoft.beans.EmployeeDAOImpl;

public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDAOImpl emp;

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		emp = (EmployeeDAOImpl) context.getBean("myJdbcBean");

		List<Employee> empList = new ArrayList<Employee>();

		/*empList = emp.getListOfEmployees();

		for (Employee e : empList) {
			System.out.println(e.getLAST_NAME() + "     ======     " + e.getDEPARTMENT_ID() + "     ======    "
					+ e.getEMAIL() + "     ======		" + e.getEMPLOYEE_ID() + "    ======    " + e.getJOB_ID()
					+ "     ======     " + e.getHIRE_DATE());

		}*/

	empList =	emp.getListOfEmployeesByDepartment(20);
		
	for (Employee e : empList) {
		System.out.println(e.getLAST_NAME() + "     ======     " + e.getDEPARTMENT_ID() + "     ======    "
				+ e.getEMAIL() + "     ======		" + e.getEMPLOYEE_ID() + "    ======    " + e.getJOB_ID()
				+ "     ======     " + e.getHIRE_DATE());

	}
		
	}

}
