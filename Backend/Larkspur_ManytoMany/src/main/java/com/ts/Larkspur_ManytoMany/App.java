package com.ts.Larkspur_ManytoMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
    	
Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Batch.class);
    	
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		
		Student s1 = new Student();
		s1.setName("Ramu");
		s1.setRollno(1);
		
		Student s2 = new Student();
		s2.setName("Shamu");
		s2.setRollno(2);
		
		Batch b1 = new Batch();
		b1.setId(101);
		b1.setSubject("Automation");
		b1.setTeacherName("Avinash sir");
		
		Batch b2 = new Batch();
		b2.setId(102);
		b2.setSubject("Fullstack");
		b2.setTeacherName("Siddharth");
		
		Batch b3 = new Batch();
		b3.setId(103);
		b3.setSubject("English");
		b3.setTeacherName("Shakila maam");
		
		
		List<Batch> auto = new ArrayList<>();
		auto.add(b1);
		auto.add(b3);
		
		List<Batch> fullstack = new ArrayList<>();
		fullstack.add(b2);
		fullstack.add(b3);
		
		s1.setBatch(auto);
		s2.setBatch(fullstack);
		
		session.persist(s1);
		session.persist(s2);
		session.persist(b1);
		session.persist(b2);
		session.persist(b3);
		
		
		
		
		session.getTransaction().commit();

		session.close();
    	
    	
    	
    }
}
