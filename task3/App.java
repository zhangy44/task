package com.first.com.hibernate;
import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
        cfg.configure("University-Config.xml");
        System.out.println("Configuration Object Created Successfully");
        SessionFactory sf=cfg.buildSessionFactory();
        System.out.println("Session Factory Object Created Successfully");
        Session s=sf.openSession();
        Transaction t=s.beginTransaction();
        
        Map<String,String> major= new HashMap<>();
        major.put("1001", "Computer Science");
        major.put("1002", "Electrical Engineering");
        University u = new University();
        u.setId("1");
        u.setName("Happy University");
        u.setProvidedMajor(major);
        
        
        s.persist(u);
        t.commit();
        System.out.println("Details are Successfully stored into the Database");
        s.close();
        sf.close();
    }
}
