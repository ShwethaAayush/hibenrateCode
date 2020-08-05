package com.training.repos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.training.pojs.Department;
import com.training.pojs.Employee;

public class EmployeeRepository {
	
	private static List<Employee> employees=new ArrayList<>();
	
	static {
		Department d1=new Department(111, "Sales", 123);
		Department d2=new Department(112, "Marketing", 133);
		Department d3=new Department(113, "Telecom", 135);
		Department d4=new Department(114, "Enterprise", 125);
		Department d5=new Department(115, "Finance", 126);
		
		employees.add(new Employee(123, "Mohan", "Raj", "mohan@gmail.com", "1234567890",
				LocalDate.of(2020, 10, 5), "clerk", 3423432, 123, d1));
		employees.add(new Employee(124, "Shodhan", "Raj", "shodhan@gmail.com", "1234567890",
				LocalDate.of(2020, 11, 15), "clerk", 3423432, 123, d1));
		employees.add(new Employee(132, "Harsha","Savanth", "harsha.savanth@gmail.com", "25463215", LocalDate.of(2018, 04, 01), "developer",23000,
				135,d2 ));
		employees.add(new Employee(133, "Shreyamsh","Gowda", "shreyamsh.gowda@gmail.com", "41263215", LocalDate.of(2019, 11, 21), "developer",23000,
				133, d3));
		employees.add(new Employee(134, "Sameer","Simha", "sameersimha@gmail.com", "25466615", LocalDate.of(2018, 10, 18), "developer",23000,
				133, d2));
		employees.add(new Employee(135, "Deemanth","Ayyappa", "deemanthayyapa@gmail.com", "2163215", LocalDate.of(2018, 1, 21), "tester",25000,
				135, d3));
		employees.add(new Employee(136, "Chetan","Gowda", "chetangowwda@gmail.com", "29661215", LocalDate.of(2018, 11, 21), "tester",25000,
				123, d1));
		employees.add(new Employee(137, "Arun","Kumar", "arunkumar@gmail.com", "2326615", LocalDate.of(2018, 11, 21), "tester",25000,
				0, d1));
		employees.add(new Employee(121, "Vijeth","Savanth", "vijeth.savanth@gmail.com", "25463215", LocalDate.of(2018, 04, 01), "developer",23000,
				123,d1 ));
		employees.add(new Employee(122, "Vishal","Gowda", "vishal.gowda@gmail.com", "41263215", LocalDate.of(2018, 11, 21), "developer",23000,
				133, d2));
		employees.add(new Employee(125, "Manish","Simha", "manishsimha@gmail.com", "25466615", LocalDate.of(2019, 10, 18), "developer",23000,
				135, d3));
		employees.add(new Employee(126, "Mohith","Ayyappa", "mohitayyapa@gmail.com", "2163215", LocalDate.of(2019, 1, 21), "tester",25000,
				125, d4));
		employees.add(new Employee(127, "Ganesh","Gowda", "gangowwda@gmail.com", "29661215", LocalDate.of(2020, 11, 21), "tester",25000,
				102, d1));
		employees.add(new Employee(131, "Mahesh","Kumar", "maheshkumar@gmail.com", "2326615", LocalDate.of(2020, 11, 21), "tester",25000,
				0, d1));	
	}
	
	public static List<Employee> getEmployees(){
		return employees;
	}

}
