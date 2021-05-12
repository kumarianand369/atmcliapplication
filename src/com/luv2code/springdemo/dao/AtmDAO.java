package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.Atm;


public interface AtmDAO {
	
	public List<Atm> getAtm();

	public void saveAtm(Atm theAtms);

	public Atm getAtm(int theId);

	public void deleteAtm(int theId);
	
	

}
