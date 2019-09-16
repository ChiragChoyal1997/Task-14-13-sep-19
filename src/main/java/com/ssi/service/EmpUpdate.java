package com.ssi.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ssi.dao.EmpDao;
import com.ssi.model.Employee;

public class EmpUpdate {
	
	public static void main(String args[]) {

		Session session = EmpDao.getSession();
		
		Transaction tr=session.beginTransaction();
		Employee e = (Employee)session.get(Employee.class,111);
		//Updating employee name of employee having eno=113
		if(e != null) {
			e.setEname("Deva");
			e.setSal(50000);
			session.update(e);
			System.out.println("Employee updated!");
		}
		else {
			System.out.println("Employee not found");
		}
			tr.commit();
			session.close();
		}
}
