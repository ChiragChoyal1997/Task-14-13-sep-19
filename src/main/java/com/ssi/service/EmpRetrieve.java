package com.ssi.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ssi.dao.EmpDao;
import com.ssi.model.Employee;

public class EmpRetrieve {
	public static void main(String args[]) {
		
		Session session = EmpDao.getSession();
		Transaction tr = session.beginTransaction();
		Employee e = (Employee)session.get(Employee.class,111);
		tr.commit();
		session.close();
		if(e != null) {
			System.out.println(e);
		}
		else {
			System.out.println("Employee not found !");
		}
		
	}

}
