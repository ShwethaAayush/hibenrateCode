package com.mphasis.training.Repo;

import java.util.List;

import com.mphasis.training.BuisnessException.BuisnessException;
import com.mphasis.training.Entity.Department;
import com.mphasis.training.Entity.Employee;
import com.mphasis.training.Entity.Job;
import com.mphasis.training.Entity.Location;

public interface EmployeeRepo {

	List<Employee> retriveAllEmployee();
	Employee retriveEmployeeById(int id);
	int addEmployee(Employee e);
	int updateEmployee(Employee e);
	int deleteEmployee(int id);
	
	List<Department> retriveAllDepartment();
	int addDepartment(Department d);
	int updateDepartment(Department d);
	int deleteDepartment(int id);
	
	List<Location> retriveAllLocation();
	int addLocation(Location l);
	int updateLocation(Location l);
	int deleteLocation(int id);
	
	List<Job> retriveAllJob();
	int addJob(Job j);
	int updateJob(Job j);
	int deleteJob(int id);
	
}
