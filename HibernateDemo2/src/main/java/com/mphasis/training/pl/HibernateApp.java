package com.mphasis.training.pl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.mphasis.training.entities.Address;
import com.mphasis.training.entities.Customer;
import com.mphasis.training.entities.Department;
import com.mphasis.training.entities.Employee;
import com.mphasis.training.entities.Laptop;
import com.mphasis.training.entities.Location;
import com.mphasis.training.entities.Order;
import com.mphasis.training.entities.Product;
import com.mphasis.training.entities.Student;



public class HibernateApp {

	public static void main(String[] args) {
		
		Configuration con=new Configuration().configure().addAnnotatedClass(Product.class)
							.addAnnotatedClass(Order.class).addAnnotatedClass(Customer.class);
		StandardServiceRegistryBuilder builder=
				new StandardServiceRegistryBuilder().applySettings(con.getProperties());
		SessionFactory sessionFactory = con.buildSessionFactory(builder.build());
		
		
//		Student st=new Student();
//		//st.setSt_id(1);
//		st.setName("Yashaswini");
//		st.getEmail().add("yashu@gmail.com");
//		st.getEmail().add("yes@mph.com");
//		st.getLp().setLpcode("LP124");
//		st.getLp().setBrand("HP");
//		st.getLp().setHddsize(1);
//		st.getLp().setRamsize(20);
//		st.getLp().setProcessor("MediaTeck");
//		
//		
//		Session session=sessionFactory.openSession();
//		session.beginTransaction();
//		session.save(st);
//		session.getTransaction().commit();
//		session.close();
//		
//		System.out.println("added");
//		
//		Session session=sessionFactory.openSession();
//		Student st=(Student)session.get(Student.class, 1);
//		st.getEmail().forEach(System.out::println);
//		System.out.println(st.getName());
//		Laptop lp=st.getLp();
//		System.out.println(lp.getBrand()+" "+lp.getLpcode());
//		System.out.println();
//		session.close();
		
//		Location l=new Location();
//		l.setLcode("L11");
//		l.setLname("GTP");
//		Department d=new Department();
//		d.setDeptcode(999);
//		d.setDname("Enterpise");
//		d.setLoc(l);
//		
//		
//		Department d1=new Department();
//		d1.setDeptcode(998);
//		d1.setDname("Sales");
//		d1.setLoc(l);
				
		//Session session=sessionFactory.openSession();
//		session.beginTransaction();
//		session.save(l);
//		session.save(d1);
//		session.save(d);
//		session.getTransaction().commit();
//		Location l=(Location)session.get(Location.class, "L11");
//		
//		System.out.println(l.getLcode()+" "+l.getLname());
//		l.getDeps().forEach(System.out::println);;
//		
//		session.close();
//		System.out.println("done");
//		
//		
		
		
		
		
	}

}
