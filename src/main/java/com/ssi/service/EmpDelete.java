package com.ssi.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ssi.dao.EmpDao;
import com.ssi.model.Employee;

public class EmpDelete {
	
	public static void main(String args[]) {
		EmpDao empdao = new EmpDao();
		Session session = empdao.getSession();  
		
		Employee e = new Employee();
		e.setEno(11);
		Transaction tr=session.beginTransaction();
		session.delete(e);
		tr.commit();
		System.out.println("Record Deleted!");
	}
}
