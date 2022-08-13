/**
 * 
 */
package com.div.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Admini
 *
 */
public class HBSessionUtility {
	
	 public static Configuration con = new Configuration().configure();	
	public static SessionFactory sesFactory = con.buildSessionFactory();
	public static Session ses = sesFactory.openSession();
	
	
	static ThreadLocal<Session> tl = new ThreadLocal<Session>();
	
	public static Session getThreadLocalSession(){
		
		tl.set(ses);
		
		return tl.get();	
	}
	
	
	
	

}
