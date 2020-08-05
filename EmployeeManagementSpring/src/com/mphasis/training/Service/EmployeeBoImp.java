package com.mphasis.training.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.training.BuisnessException.BuisnessException;
import com.mphasis.training.Entity.Department;
import com.mphasis.training.Entity.Employee;
import com.mphasis.training.Entity.Job;
import com.mphasis.training.Entity.Location;
import com.mphasis.training.Repo.EmployeeRepo;


@Service
public class EmployeeBoImp implements EmployeeBo {

	@Autowired
	EmployeeRepo employeeRepo;
	
	//Employee Operations
	@Override
	public List<Employee> retriveAllEmployee() throws BuisnessException {
		List<Employee> employees=employeeRepo.retriveAllEmployee();  
	       if(employees.isEmpty()) {  
	           throw new BuisnessException("No Employees Found");  
	       }  
	       return employees;  
		
	}

	@Override
	public Employee retriveEmployeeById(int id) {
		return employeeRepo.retriveEmployeeById(id);
	}

	@Override
	public int addEmployee(Employee e) throws BuisnessException {
		int i=0;
		if(e.getEid()>=0 && e.getEid()<=1000) {
			if(e.getEname().matches("[a-zA-z]{3,50}")) {
				if(e.getSalary()>=20000 && e.getSalary()<=100000) {
					i=employeeRepo.addEmployee(e);
				}
				else {
					throw new BuisnessException("Invalid Employee Salary( Salary range should be between 20000 to 80000");
                }
			}
			else {
				throw new BuisnessException("Invalid Employee Name(Name should contain 3 to 50 letters)");
            }
			
		}
		else {
			      throw new BuisnessException("Invalid Employee Id ,It should be within(20000 - 100000)");
		}
	    return i;
	}

	@Override
	public int updateEmployee(Employee e) {
	
		return employeeRepo.updateEmployee(e);
	}

	@Override
	public int deleteEmployee(int id) {
		
		return employeeRepo.deleteEmployee(id);
	}

	//Department Related Operations
	@Override
	public List<Department> retriveAllDepartment() throws BuisnessException {
		List<Department> department =employeeRepo.retriveAllDepartment();  
	       if(department.isEmpty()) {  
	           throw new BuisnessException("No Departments Found");  
	       }  
	       return department;
	}

	@Override
	public int addDepartment(Department d) {
		int i=0;
		i= employeeRepo.addDepartment(d);
		return i;
	}

	@Override
	public int updateDepartment(Department d) {
		return employeeRepo.updateDepartment(d);
	}

	@Override
	public int deleteDepartment(int id) {
		return employeeRepo.deleteDepartment(id);
	}

	//location Related Operation
	@Override
	public List<Location> retriveAllLocation() throws BuisnessException {
		List<Location> location=employeeRepo.retriveAllLocation();  
	       if(location.isEmpty()) {  
	           throw new BuisnessException("No Location Found");  
	       }  
	       return location;
	}

	@Override
	public int addLocation(Location l) {
		int i =0;
		i=employeeRepo.addLocation(l);
		return i;
	}

	@Override
	public int updateLocation(Location l) {
		return employeeRepo.updateLocation(l);
	}

	@Override
	public int deleteLocation(int id) {
		return employeeRepo.deleteLocation(id);
	}

	//Job Related Operations
	@Override
	public List<Job> retriveAllJob() throws BuisnessException {
		List<Job> job=employeeRepo.retriveAllJob();  
	       if(job.isEmpty()) {  
	           throw new BuisnessException("No Job Found");  
	       }  
	       return job;
	}

	@Override
	public int addJob(Job j) {
		System.out.println("job service");
		int i=0;
		employeeRepo.addJob(j);
		return i;
	}

	@Override
	public int updateJob(Job j) {
		return employeeRepo.updateJob(j);
	}

	@Override
	public int deleteJob(int id) {
		return employeeRepo.deleteJob(id);
	}

}
