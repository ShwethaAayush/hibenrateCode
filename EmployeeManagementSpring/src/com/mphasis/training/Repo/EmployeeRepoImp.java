package com.mphasis.training.Repo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mphasis.training.Entity.Department;
import com.mphasis.training.Entity.Employee;
import com.mphasis.training.Entity.Job;
import com.mphasis.training.Entity.Location;

@Repository
public class EmployeeRepoImp implements EmployeeRepo {
    
	@Autowired
	private SessionFactory sessionFactory;
	
	//Employee Operations
	@Override
	public List<Employee> retriveAllEmployee() {
		List<Employee> employees = new ArrayList<>();
		Session session = sessionFactory.openSession();
		employees = session.createCriteria(Employee.class).list();
		session.close();
		return employees;
	}

	@Override
	public Employee retriveEmployeeById(int id) {
		Session session = sessionFactory.openSession();
		Employee employees =(Employee) session.get(Employee.class, id);
		session.close();
		return employees;
	}

	@Override
	public int addEmployee(Employee e) {
		int i=0;
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		i=(int)session.save(e);
		session.getTransaction().commit();
		session.close();
		return i;
	}

	@Override
	public int updateEmployee(Employee e) {
		int i=0;
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(e);
		session.getTransaction().commit();
		session.close();
		return i;
	}

	@Override
	public int deleteEmployee(int id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Employee e =(Employee) session.get(Employee.class, id);
		session.delete(e);
		session.getTransaction().commit();
		session.close();
		return 0;
	}

	//Department Operations
	@Override
	public List<Department> retriveAllDepartment() {
		List<Department> department = new ArrayList<Department>();
		Session session = sessionFactory.openSession();
		department = session.createCriteria(Department.class).list();
		session.close();
		return department;
	}

	@Override
	public int addDepartment(Department d) {
        int i=0;
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        i=(int) session.save(d);
        session.getTransaction().commit();
        session.close();
		return i;
	}

	@Override
	public int updateDepartment(Department d) {
		int i=0;
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(d);
		session.getTransaction().commit();
		session.close();
		return i;
	}

	@Override
	public int deleteDepartment(int id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Department d=(Department) session.get(Department.class,id);
	    session.delete(d);
		session.getTransaction().commit();
		session.close();
		return 0;
	}

	//Location Operations
	@Override
	public List<Location> retriveAllLocation() {
		List<Location> location = new ArrayList<Location>();
		Session session = sessionFactory.openSession();
		location=session.createCriteria(Location.class).list();
		session.close();
		return location;
	}

	@Override
	public int addLocation(Location l) {
	    int i=0;
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	    i=(int) session.save(Job.class);
	    session.getTransaction().commit();
	    session.close();
		return i;
	}

	@Override
	public int updateLocation(Location l) {
		int i=0;
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(l);
		session.getTransaction().commit();
		session.close();
		return i;
	}

	@Override
	public int deleteLocation(int id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Location l = (Location) session.get(Location.class, id);
		session.delete(l);
		session.getTransaction().commit();
		session.close();
		return 0;
	}

	//Job Operations
	@Override
	public List<Job> retriveAllJob() {
		List<Job> job = new ArrayList<Job>();
		Session session = sessionFactory.openSession();
		job=session.createCriteria(Job.class).list();
		session.close();
		return job;
	}

	@Override
	public int addJob(Job j) {
		System.out.println("job Repo");
		int i=0;
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(j);
		session.getTransaction().commit();
		session.close();
		return i;
	}

	@Override
	public int updateJob(Job j) {
		int i=0;
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(j);
		session.getTransaction().commit();
		session.close();
		return i;
	}

	@Override
	public int deleteJob(int id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
	    Job j=(Job) session.get(Job.class,id);
		session.delete(j);
		session.getTransaction().commit();
		session.close();
		return 0;
	}

}
