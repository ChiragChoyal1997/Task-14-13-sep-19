package com.ssi.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ssi.dao.EmpDao;
import com.ssi.model.Employee;

public class EmpUpdate {
	
	public static void main(String args[]) {
		EmpDao empdao = new EmpDao();
		Session session = empdao.getSession();
		
		Employee e = new Employee();
		e.setEno(114);
		
		//Updating employee name of employee having eno=113
		e.setEname("Deva");
		e.setSal(0);
		
		Transaction tr=session.beginTransaction();
		session.update(e);
		tr.commit();
		System.out.println("Record Updated!");
	}
}
