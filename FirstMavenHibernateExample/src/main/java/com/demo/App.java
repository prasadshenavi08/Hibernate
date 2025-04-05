package com.demo;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App 
{
    public static void main( String[] args ){ 
        Configuration config = new Configuration().configure("hibernate.cfg.xml"); 
        SessionFactory factory = config.buildSessionFactory(); 
        Scanner sc = new Scanner(System.in); 

        int opt = 0; 
        do { 
            System.out.println("1. Add new Employee"); 
            System.out.println("2. Show all employees "); 
            System.out.println("3. Update an Employee "); 
            System.out.println("4. Delete an employee "); 
            System.out.println("5. Exit"); 
            System.out.println("Enter your choice "); 
            opt = sc.nextInt(); 
            switch(opt) { 
                case 1: 
                    Session session = factory.openSession(); 
                    System.out.println("Enter the employee id, name and salary "); 
                    int id = sc.nextInt(); 
                    String n = sc.next(); 
                    float s = sc.nextFloat(); 
                    Employee e1 = new Employee(id, n, s); 
                    session.save(e1); 
                    Transaction transaction = session.beginTransaction(); 
                    transaction.commit(); 
                    System.out.println("Record added"); 
                    session.close(); 
                    break; 
                case 2: 
                    session = factory.openSession(); 
                    Query q1 = session.createQuery("from Employee"); 
                    List<Employee> list1 = q1.list(); 
                    Iterator i1 = list1.iterator(); 
                    while(i1.hasNext()) { 
                        System.out.println(i1.next()); 
                    } 
                    session.close(); 
                    break; 
                case 3: 
                    session = factory.openSession();
                    System.out.println("Enter Employee Id to update Salary");
                    id = sc.nextInt();
                    e1 = session.get(Employee.class, id);
                    if (e1 != null) {
                        System.out.println("Enter New Salary");
                        s = sc.nextFloat();
                        e1.setSalary(s);
                        session.update(e1);
                        
                        transaction = session.beginTransaction();
                        transaction.commit();
                        System.out.println("Record Updated Successfully");
                    } else {
                        System.out.println("Employee not Found..!");
                    }
                    
                    session.close();
                    break;
                case 4:
                    session = factory.openSession();
                    System.out.println("Enter Employee Id to Delete");
                    id = sc.nextInt();
                    e1 = session.get(Employee.class, id);
                    if (e1 != null) {
                        session.delete(e1);
                        
                        transaction = session.beginTransaction();
                        transaction.commit();
                        System.out.println("Employee Deleted");
                    } else {
                        System.out.println("Employee Not Found");
                    }
                    
                    session.close();
                    break;
                case 5: 
                    System.out.println("Exiting..."); 
                    break; 
                default: 
                    System.out.println("Invalid choice. Please try again."); 
            } 
        } while(opt != 5); 

        sc.close(); 
        factory.close(); 
    }
}
