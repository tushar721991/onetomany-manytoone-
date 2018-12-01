package com.tt.onetomany.client;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tt.onetomany.model.Customer;
import com.tt.onetomany.model.Vendor;
import com.tt.onetomany.util.SessionFactoryProvider;

public class CustomerClient {

	public static void main(String[] args) {
		Vendor vendor1 = new Vendor(101, "OFSS", "Goregaon");
		Vendor vendor2 = new Vendor(102, "Quinnox", "Andheri");
		List<Vendor> vendors = new ArrayList<>();
		vendors.add(vendor1);
		vendors.add(vendor2);

		Customer customer = new Customer(1234, "Capgemini", "Airoli", vendors);
		
		vendor1.setCustomer(customer);
		vendor2.setCustomer(customer);
		
		
		SessionFactory  factory = SessionFactoryProvider.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(customer);
		
		tx.commit();
		session.close();
		factory.close();
	}
}
