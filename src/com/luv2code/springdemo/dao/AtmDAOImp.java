package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.luv2code.springdemo.entity.Atm;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository

public class AtmDAOImp implements AtmDAO {
	
	//need to inject the session factory
		@Autowired
		private SessionFactory sessionFactory;

	@Override
	//@Transactional
	public List<Atm> getAtm() {
		//get the  current hibernate session
				Session currentSession=sessionFactory.getCurrentSession();
				
				//create a query....sorted by last Name
				Query<Atm> theQuery=
						currentSession.createQuery("from Atm",
								                   Atm.class);
				
				//excute query and get result list
				
				List<Atm> atm=theQuery.getResultList();
				
				//return the results
				return atm;
			}
	@Override
	public void saveAtm(Atm theAtms) {
		// get current hibernate session
				Session currentSession=sessionFactory.getCurrentSession();
		
				
				Object theAtm = null;
				//save/update the atm
				currentSession.saveOrUpdate(theAtm);
	}

	@Override
	public Atm getAtm(int theId) {
		// get the current hibernate session
				Session currentSession=sessionFactory.getCurrentSession();
				//now read from database from primary key
				Atm theAtm=currentSession.get(Atm.class, theId);
				
				return theAtm;
	}

	@Override
	public void deleteAtm(int theId) {
		//get the current hibernate session
				Session currentSession=sessionFactory.getCurrentSession();
				
				//delete the object with primary key
		    Query theQuery=
		           currentSession.createQuery("delete from Atm where id=:AtmId");
				theQuery.setParameter("atmId", theId);
				
				theQuery.executeUpdate();
			}

	}


