package org.tnsif.client;
import org.tnsif.entities.Employee;
import org.tnsif.service.*;
public class Client {
	public static void main(String[] args) {
		EmployeeService service =new EmployeeServiceImpl();
		Employee emp =new Employee();
		
//		//create
//		emp.setId(104);
//		emp.setName("Nova");
//		service.addEmployee(emp);
//		System.out.println("data added successfully in the database");
//		
		
//		//update
//		emp=service.getEmployee(101);
//		emp.setName("vaish");
//		service.updateEmployee(emp);
//		System.out.println("data updated successfully from the database");		

		//delete
		emp=service.getEmployee(105);
		service.deleteEmployee(emp);
		System.out.println("data deleted successfully from the database");
		
	}
}
