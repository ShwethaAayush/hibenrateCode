package com.mphasis.training.pl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mphasis.training.entities.Account;
import com.mphasis.training.util.HibernateUtil;

public class Demo {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		//Account a1=(Account) session.get(Account.class, 133);
		//System.out.println(a1);
		
		//Account a12=(Account) session.get(Account.class, 123);
		session.beginTransaction();
		Account a=new Account();
		a.setAcc_holder_name("Kalandar");
		a.setAccnum(199);
		a.setBalance(56657);
		
		session.persist(a);
		
		session.getTransaction().commit();
		
		//session.clear();
		session.clear();
		
		Account a1=new Account();
		a1.setAcc_holder_name("Nishith");
		a1.setAccnum(299);
		a1.setBalance(56657);
		
		session.persist(a1);
		
//		Session session1=sessionFactory.openSession();
//		
//		Account a11=(Account) session1.get(Account.class, 123);
//		
//		session1.close();
		//Account a12=(Account) session.get(Account.class, 123);
		
	}

}
