package com.luv2code.springdemo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.AtmDAO;

import com.luv2code.springdemo.entity.Atm;


import com.luv2code.springdemo.entity.Atm;
@Service

public class AtmServiceImpl implements AtmService {
	//need to inject atm dao
		@Autowired
		private AtmDAO atmDAO;
		
		@Override
		@Transactional
	public List<Atm> getAtm() {
			return atmDAO.getAtm();
	}

		@Override
		@Transactional
	public void saveAtm(Atm theAtms) {
			Atm theAtm = null;
			atmDAO.saveAtm(theAtm);

	}

	@Override
	@Transactional
	public Atm getAtm(int theId) {
		return atmDAO.getAtm(theId);
	}

	@Override
	@Transactional
	public void deleteAtm(int theId) {
		atmDAO.deleteAtm(theId);

	}

}
