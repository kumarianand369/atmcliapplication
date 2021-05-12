package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.dao.AtmDAO;
import com.luv2code.springdemo.entity.Atm;
import com.luv2code.springdemo.service.AtmService;



@Controller
@RequestMapping("/atm")

public class AtmController {
	//need to inject atm Service
		@Autowired
		private AtmService atmService;
		
		
		/*
		//need to inject atm dao
		@Autowired
		private atmrDAO atmDAO;
		*/
		@GetMapping("/list")
		public String listAtm(Model theModel) {
			
			
			//get the atm from Service
			List<Atm> theAtm=atmService.getAtm();
			
			
			
			
			//add atm to the model
			theModel.addAttribute("atm",theAtm);
			
			return "list-atm";
		}
		@GetMapping("/showFormForAdd")
		public String showFormForAdd(Model theModel) {
			//create model attribute to bind form data
			Atm theAtm=new Atm();
			theModel.addAttribute("atm", theAtm);
			return "atm-form";
		}
		
		
		@PostMapping("/saveAtm")
		public String saveAtm(@ModelAttribute("atm") Atm theAtm) {
			//save the Atm using our service
			((AtmService) atmService).saveAtm(theAtm);
			
			return "redirect:/atm/list";
		}
		
		@GetMapping("/showFormForUpdate")
		public String showFormForUpdate(@RequestParam("atmId") int theId,
				                         Model theModel) {
			
			//get Atm from Service
			Atm theAtm=atmService.getAtm(theId);
			
			//set Atm as  model attribute to pre-populated the form
			theModel.addAttribute("atm", theAtm);
			
			//send over to the form
			
			return "atm-form";
		}
		
		@GetMapping("/delete")
		public String deleteAtm(@RequestParam("atmId") int theId) {
			//delete theatm
			atmService.deleteAtm(theId);
			return "redirect:/atm/list";
		}
		
	}



