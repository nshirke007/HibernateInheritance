package com.scp.HibernateDemo1.InhiretanceInhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Vehicle vhl = new Vehicle(10, "honda");

		// TwoWheeler tw=new TwoWheeler(10, "FZ");
		TwoWheeler t = new TwoWheeler();
		t.steeringhandle = "for two wheeler";

		FourWheeler fw = new FourWheeler();
		fw.streeringWheel = "for four wheeler";

		Configuration con = new Configuration();
		SessionFactory session = con.configure().buildSessionFactory();

		Session sf = session.openSession();
		Transaction trac = sf.beginTransaction();
		
		sf.save(vhl);
		sf.save(t);
		sf.save(fw);
		trac.commit();
		sf.close();
	}

}
