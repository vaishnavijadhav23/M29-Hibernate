package org.tnsif.service;

import org.tnsif.entities.Employee;

public interface EmployeeService {

	
	//User defined method for CURD operation
	
	
		void addEmployee(Employee emp);//create
		Employee getEmployee(int id); //retrieve
		void updateEmployee(Employee emp); //update
		//void removeEmployee(Employee emp); //delete
		void deleteEmployee(Employee emp);
		
		
		
}
