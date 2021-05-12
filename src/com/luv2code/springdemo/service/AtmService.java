package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.entity.Atm;

public interface AtmService {
	public List<Atm> getAtm();

	public void saveAtm(Atm theAtms);

	public Atm getAtm(int theId);

	public void deleteAtm(int theId);
	

}
