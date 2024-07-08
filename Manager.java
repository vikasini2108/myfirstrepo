package com.main;

import org.hibernate.Session;


import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;

import com.bean.Students;

public class Manager {
	public static void main(String[] args) 
	{
		
//		System.out.println("start");
//		//Configuration cfg=new Configuration();
//		
		
//		Students student1=new Students();
//		student1.setS_id(10);
//		student1.setName("vika");
//		student1.setAddress("chennai");
//		student1.setMarks(100);
//		
//		Configuration cfg=new Configuration();
//	    cfg.configure("Resources/hibernate.cfg.xml");
//		SessionFactory session=cfg.buildSessionFactory();
//		 Session sess=session.openSession();
//		 Transaction trns=sess.beginTransaction();
//		 
//		 sess.save(student1);
//		 trns.commit();
//		
//	
//	System.out.print("Done");
		
		
		
	
		Students std=new Students(20,"suji","bangalor",99);
		//Students std1=new Students(30,"samiksha","london",98);
		//Students std2=new Students(40,"guna","france",97);
		Configuration cfg=new Configuration();
		cfg.configure("Resources/hibernate.cfg.xml");
		SessionFactory session=cfg.buildSessionFactory();
		Session sess=session.openSession();
		Transaction trns=sess.beginTransaction();
		sess.persist(std);
		///sess.save(std);
		//sess.save(std1);
		
		//sess.save(std2);
		
		Object objData= sess.load(Students.class, new Integer(20));
		Students getData= (Students)objData;
		trns.commit();
		System.out.println("done");
	
		
//		delete 
			
//		Object objData1= sess.get(Students.class, new Integer(20));
//		Students sdt= (Students)objData1;
//		System.out.println(getData);
//		sess.save(getData);
		
		
		
		//UPDATE
		
//		Object objData11= sess.get(Students.class, new Integer(21));
//		Students sdt1= (Students)objData11;
//		sdt1.setS_id(100);
//		sdt1.setName("abc");
//		sdt1.setAddress("china");
//		sess.update(std);
//		 trns.commit();
		
		
	}

	

}