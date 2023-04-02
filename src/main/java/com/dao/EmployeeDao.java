package com.dao;

import java.util.List;

import com.entity.EmployeeEntity;

public interface EmployeeDao {
	
	public void saveEmployee(EmployeeEntity employeeEntity);

	public  EmployeeEntity aunthenticate(String emailId, String password) ;
		
	public void deleteEmployee(EmployeeEntity employeeEntity );
	
	public List<EmployeeEntity> showAll();
	
    public void updateEmployee(EmployeeEntity employeeEntity);
    
   // public void updateEmployeeByName(EmployeeEntity employeeEntity);

	public EmployeeEntity findById(int id);

	public void deleteByEmpId(int id);

	//void updateEmployee(int id);
}
