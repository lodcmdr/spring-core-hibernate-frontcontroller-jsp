package com.services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.EmployeeDao;
import com.entity.EmployeeEntity;


@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	
	@Autowired
	EmployeeDao employeeDao;
	
	
	

	@Override
	public void saveEmployee(EmployeeEntity employeeEntity) {
		employeeDao.saveEmployee(employeeEntity);
		
	}

	@Override
	public EmployeeEntity aunthenticate(String emailId, String password) {
		EmployeeEntity employeeEntity = employeeDao.aunthenticate(emailId, password);
		return employeeEntity;
		
		
	}

	@Override
	public List<EmployeeEntity> showAll() {
		List<EmployeeEntity> employeeEntity = employeeDao.showAll();
		return employeeEntity;
	}

	@Override
	public void deleteEmployee(EmployeeEntity employeeEntity) {
		 employeeDao.deleteEmployee(employeeEntity);
		
	}

	@Override
	public EmployeeEntity findById(int id) {
		EmployeeEntity employeeEntity = employeeDao.findById(id);
		return employeeEntity;
	}

	
	@Override
	public void updateEmployee(EmployeeEntity employeeEntity) {
	 employeeDao.updateEmployee( employeeEntity);
		
	}

	@Override
	public void deleteByEmpId(int id) {
		employeeDao.deleteByEmpId(id);
		
	}
	

}
