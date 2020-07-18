package com.mphasis.training.pl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.mphasis.training.entities.Account;
import com.mphasis.training.entities.Address;
import com.mphasis.training.entities.CurrentAccount;
import com.mphasis.training.entities.Customer;
import com.mphasis.training.entities.Department;
import com.mphasis.training.entities.Employee;
import com.mphasis.training.entities.Laptop;
import com.mphasis.training.entities.Location;
import com.mphasis.training.entities.Order;
import com.mphasis.training.entities.Product;
import com.mphasis.training.entities.SavingsAccount;
import com.mphasis.training.entities.Student;
import com.mphasis.training.util.HibernateUtil;



public class HibernateApp {

	public static void main(String[] args) {
		
	
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		
		//criteria
		Session session=sessionFactory.openSession();
		List<Account> accounts=session.createCriteria(Account.class).list();
		for(Account a:accounts) {
		System.out.println(a.getAcc_holder_name()+" "+a.getAccnum()+" "+a.getBalance());
		}
		session.close();
		//HQL FROM Employee
		Session session1=sessionFactory.openSession();
		Query query =session1.createQuery("FROM Account");
		query.list().forEach(System.out::println);
		
		//HQL
		Query query1=session1.createQuery("SELECT a.accnum FROM Account a");
		query1.list().forEach(System.out::println);
		//HQL
		session1.beginTransaction();
		Query qd=session1.createQuery("DELETE FROM Account WHERE accnum =:acc");
		qd.setParameter("acc", 129);
		qd.executeUpdate();
		session1.getTransaction().commit();
		System.out.println("deleted");
		
		session1.close();
		
		//sql  select * from employee
		Session session2=sessionFactory.openSession();
		SQLQuery sqlQuery=session2.createSQLQuery("select acc_holder_name, accnum from account");
		List<Object[]> objects=sqlQuery.list();
		for(Object[] row:objects) {
			Account a=new Account();
			a.setAcc_holder_name(row[0].toString());
			a.setAccnum(Integer.parseInt(row[1].toString()));
			System.out.println(a.getAcc_holder_name()+" "+a.getAccnum());
		}
		session2.close();
		
//		Configuration con=new Configuration().configure()
//				.addAnnotatedClass(Account.class)
//							.addAnnotatedClass(SavingsAccount.class)
//							.addAnnotatedClass(CurrentAccount.class);
//		StandardServiceRegistryBuilder builder=
//				new StandardServiceRegistryBuilder().applySettings(con.getProperties());
//		SessionFactory sessionFactory = con.buildSessionFactory(builder.build());
//		
//		
//		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
//		Account a=new Account();
//		a.setAcc_holder_name("Swathi");
//		a.setAccnum(127);
//		a.setBalance(567657);
//	
//		SavingsAccount s=new SavingsAccount();
//		s.setAcc_holder_name("Soumya");
//		s.setAccnum(128);
//		s.setBalance(567655);
//		s.setAdraNum(5465);	
//	
//		CurrentAccount c=new CurrentAccount();
//		c.setAccnum(129);
//		c.setAcc_holder_name("Supriya KV");
//		c.setBalance(6576565);
//		c.setGstin("556465");
//		
//		Session session=sessionFactory.openSession();
//		session.beginTransaction();
//		session.save(a);
//		session.save(s);
//		session.save(c);
//		session.getTransaction().commit();
//		session.close();
		
		
		
		
		
		
		
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
