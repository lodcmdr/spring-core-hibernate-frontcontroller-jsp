package com.services;



import java.util.List;

import com.entity.EmployeeEntity;

public interface EmployeeService {

	public void saveEmployee(EmployeeEntity employeeEntity);
	
	public EmployeeEntity aunthenticate(String emailId , String password);
	
	public List<EmployeeEntity> showAll();
	
    public void deleteEmployee(EmployeeEntity employeeEntity );

	public EmployeeEntity findById(int id);

	public void updateEmployee(EmployeeEntity employeeEntity);

	public void deleteByEmpId(int id);

	
	
	

}
