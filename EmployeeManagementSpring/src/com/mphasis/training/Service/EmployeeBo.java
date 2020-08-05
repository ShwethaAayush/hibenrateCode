package com.mphasis.training.Service;

import java.util.List;

import com.mphasis.training.BuisnessException.BuisnessException;
import com.mphasis.training.Entity.Department;
import com.mphasis.training.Entity.Employee;
import com.mphasis.training.Entity.Job;
import com.mphasis.training.Entity.Location;

public interface EmployeeBo {

	List<Employee> retriveAllEmployee() throws BuisnessException;
	Employee retriveEmployeeById(int id) throws BuisnessException;
	int addEmployee(Employee e) throws BuisnessException;
	int updateEmployee(Employee e) throws BuisnessException;
	int deleteEmployee(int id)throws BuisnessException;
	
	List<Department> retriveAllDepartment() throws BuisnessException;
	int addDepartment(Department d)throws BuisnessException;
	int updateDepartment(Department d)throws BuisnessException;
	int deleteDepartment(int id)throws BuisnessException;
	
	List<Location> retriveAllLocation()throws BuisnessException;
	int addLocation(Location l)throws BuisnessException;
	int updateLocation(Location l)throws BuisnessException;
	int deleteLocation(int id)throws BuisnessException;
	
	List<Job> retriveAllJob()throws BuisnessException;
	int addJob(Job j)throws BuisnessException;
	int updateJob(Job j)throws BuisnessException;
	int deleteJob(int id)throws BuisnessException;
	
	
}
