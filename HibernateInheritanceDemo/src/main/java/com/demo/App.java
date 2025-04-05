package com.demo;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args)throws HibernateException {  try {
    	   Configuration config=new Configuration();
    	   config.configure("hibernate.cfg.xml");
    	   // Create session factory   SessionFactory factory = config.buildSessionFactory();
    	   Session session = factory.getCurrentSession();
    	   Transaction t1= session.beginTransaction();
    	   Employee e1= new Employee();
    	   RegularEmployee r1= new RegularEmployee(250.2,1511);
    	   ContractEmployee c1 = new ContractEmployee(101,"Hana",2000,"2weeks");
    	   e1.setId(101);
    	   e1.setName("rahul Patil");
//    	   r1.setBonus(2500);
//    	   r1.setSalary(40000);   
    	   //c1.setPayperhour(1000);   //c1.setDuration("Week");
    	   session.save(e1);
    	   session.save(c1);
    	   session.save(r1);
    	     t1.commit();
    	      System.out.println("Ok");
    	  }   catch (Exception e) {
    	   e.printStackTrace();  
    	   }  
    	 }
    }

