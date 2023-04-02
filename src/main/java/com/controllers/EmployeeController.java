package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.entity.EmployeeEntity;
import com.services.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	/* from browser or from hyperlink always getmapping */
	@GetMapping({"/","/employeeRegistration"})
	public String showRegistration() {
		return "registration";
	}
	
	
	@PostMapping("/registration")
	String registration(@ModelAttribute EmployeeEntity employeeEntity,Model model){
		
		employeeService.saveEmployee(employeeEntity);	
		
		model.addAttribute("msg", "registration done successfully");
		return "registration";
		
	}
	
	
	@GetMapping("/login")
	public String showLogin() {
		return "login";
	}

	
	@PostMapping("/login")
	 public String login(@RequestParam String emailId, @RequestParam String password, Model model){
		
		EmployeeEntity	employeeEntity = employeeService.aunthenticate(emailId,  password);	
		  if(employeeEntity != null) {
			  model.addAttribute("employee", employeeEntity);
			  return "sucess" ;  
		  }else {
			  model.addAttribute("message", "not an authorized user!!!, Please register your details first" );
			  return "login" ;
		  }
		  
		
		}
	
	@GetMapping("/showEmployees") 
	public  String displayAllEmployees(Model model) {
		 List<EmployeeEntity> empList = employeeService.showAll();
		 model.addAttribute("empList", empList);
		 return "showAll";	 
	 
	    }	
	
	@GetMapping("/ShowEditForm")
	public String findEmpById(@RequestParam int id,Model model) {
		EmployeeEntity	employeeEntity	=employeeService.findById(id);
		model.addAttribute("employee", employeeEntity);
		return "editEmployee";
	}
		
	@PostMapping("/UpdateEmployee")
	public String updateEmployee(@ModelAttribute EmployeeEntity employeeEntity,Model model) {
		employeeService.updateEmployee(employeeEntity);
		return "redirect:showEmployees";
	}
	
	
 /*
	@GetMapping("/DeleteUser")
	public String deleteEmpById(@RequestParam int id,Model model) {
		EmployeeEntity	employeeEntity	=employeeService.findById(id);
		model.addAttribute("employee", employeeEntity);
		return "delete";
	}
	*/
	
	@PostMapping("/DeleteEmployee")
	public String deleteEmployee(@ModelAttribute EmployeeEntity employeeEntity,Model model, RedirectAttributes redirectAttributes) {
	    employeeService.deleteEmployee(employeeEntity);
	    redirectAttributes.addFlashAttribute("message", "This employee is no more with us in our database");	   
	    return "redirect:showEmployees"; // Redirect to employee list page
	}
	
	
	@GetMapping("/DeleteUser")
	String deleteEmployee(@RequestParam int id, Model model){
		employeeService.deleteByEmpId(id);		
		return "redirect:showEmployees";
		
	}	
	
	}	

