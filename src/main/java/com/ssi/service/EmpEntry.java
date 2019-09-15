package com.ssi.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ssi.dao.EmpDao;
import com.ssi.model.Employee;

public class EmpEntry {

	public static void main(String[] args) {
		
		EmpDao empdao = new EmpDao();
		Session session = empdao.getSession();  
		
		Employee e1=new Employee(111,"AAA",50000);
		Employee e2=new Employee(112,"BBB",60000);
		Employee e3=new Employee(113,"CCC",70000);
		
		
		Transaction tr=session.beginTransaction();
		session.save(e1); session.save(e2);
		session.save(e3); 
		tr.commit();
		session.close();
		System.out.println("RECORD ADDED");
	}

}