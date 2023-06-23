package org.tnsif.dao;
import javax.persistence.EntityManager;
import org.tnsif.entities.Employee;
public class EmployeeDaoImpl implements EmployeeDao{
	
	
	/* all the CRUD methods are inside an Entity Manager interface
	 */
	private EntityManager em;

	
	//default constructor
	public EmployeeDaoImpl() {
		em=JPAUtil.getEntityManager();
	}

	//create or add
	@Override
	public void addEmployee(Employee emp) {
		em.persist(emp);
		
	}

	//Retrieve
	@Override
	public Employee getEmployee(int id) {
		Employee emp=em.find(Employee.class, id);
		return emp;
	}

	@Override
	public void updateEmployee(Employee emp) {
		em.merge(emp);
		
	}

	@Override
	public void deleteEmployee(Employee emp) {
		em.remove(emp);
		
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
		
	}

}
