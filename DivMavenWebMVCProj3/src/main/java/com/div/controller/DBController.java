/**
 * 
 */
package com.div.controller;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.div.entity.Customer;
import com.div.utility.HBSessionUtility;

/**
 * @author Admini
 *
 */
@RestController
public class DBController {
	
	@RequestMapping(path ="/addCust")
	public void addCustomer(){
		
		Customer cust = new Customer();
		cust.setId(1);
		cust.setName("Divya");
		cust.setCity("Bangalore");
		
		
		Session ses = HBSessionUtility.getThreadLocalSession();
		
		Transaction tx = ses.beginTransaction();
		ses.save(cust);
		
		tx.commit();
	}
	
	@RequestMapping(path ="/fileUpload")
	public void fileUpload(){
		
		Customer cust = new Customer();
		cust.setId(1);
		cust.setName("Divya");
		cust.setCity("Bangalore");
		
		
		Session ses = HBSessionUtility.getThreadLocalSession();
		
		Transaction tx = ses.beginTransaction();
		ses.save(cust);
		
		tx.commit();
	}
	

}
