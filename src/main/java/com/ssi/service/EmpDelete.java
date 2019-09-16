package com.ssi.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ssi.dao.EmpDao;
import com.ssi.model.Employee;

public class EmpDelete {
	
	public static void main(String args[]) {
		Session session = EmpDao.getSession();  
		Employee e = new Employee();
		e.setEno(11);
		Transaction tr=session.beginTransaction();
		session.delete(e);
		
		tr.commit();
		session.close();
		System.out.println("Record Deleted!");
	}
}
