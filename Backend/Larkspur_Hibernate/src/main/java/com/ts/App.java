package com.ts;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		/*
		 * (Create/POST)
		 * 
		 * Student s = new Student(); s.setId(1); session.persist(s);
		 */

		
//		  Student s1 = new Student("Ram","Pune"); session.persist(s1); Student s2 = new
//		  Student("Ramu","Mumbai"); session.persist(s2); Student s3 = new
//		  Student("Sham","Indore"); session.persist(s3); Student s4 = new
//		  Student("Dhamu","Indore"); session.persist(s4); Student s5 = new
//		  Student("Shamu","Indore"); session.persist(s5);
		 

//		(GET/READ)
//		  Student std = session.get(Student.class, 4);
//		  System.out.println(std.getName());
		
//		List<Student> student = session.createQuery("From Student", Student.class).getResultList();
//		for(Student s:student) {
//			System.out.println(s.getName());
//		}
		
//		(update/PUT)
//		Student ss = session.get(Student.class, 3);
//		ss.setName("Raju");
		
//		(Delete)
		
//		Student sd = session.get(Student.class,2);
//		session.remove(sd);
//	
		 
		

		session.getTransaction().commit();

		session.close();

	}
}
