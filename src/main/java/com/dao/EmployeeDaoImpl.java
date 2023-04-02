package com.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.EmployeeEntity;


@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
     SessionFactory sessionFactory;
	
	private Session getSession() {
		return sessionFactory.getCurrentSession();
		
	}
	
	
	@Override
	public void saveEmployee(EmployeeEntity employeeEntity) {
		getSession().save(employeeEntity);
		
	}


	@Override
	public EmployeeEntity aunthenticate(String emailId, String password) {
		String hql = "from EmployeeEntity e where e.emailId =:emailId and e.password =:password ";
		//Query query = getSession().createQuery(hql); //Hibernate Query....in place of Query you can also use TypedQuery
				TypedQuery<EmployeeEntity> query = getSession().createQuery(hql);
				query.setParameter("emailId", emailId);
				query.setParameter("password", password);
				EmployeeEntity employeeEntity = null;
				
				try {
				//employeeEntity = (EmployeeEntity) query.getSingleResult();
				 employeeEntity =  query.getSingleResult();//if u use TypedQuery then casting will not be required
				}catch(Exception e) {
					e.printStackTrace();
				}
		         return employeeEntity;
	}
	

	@Override
	public void deleteEmployee(EmployeeEntity employeeEntity) {
		getSession().delete(employeeEntity);
		
	     /*
	      * public void deleteEmployee(int id) {
		 * String hql = "delete from EmployeeEntity e where e.employeeId = :employeeId";
		 * Query query = getSession().createQuery(hql); query.setParameter("employeeId",
		 * employeeId); int rows = query.executeUpdate();
		 */   
		}


	@Override
	public List<EmployeeEntity> showAll() {
		String hql = "from EmployeeEntity";
		Query query = getSession().createQuery(hql);
		//List<EmployeeEntity> employeeEntity = query.list();
		List<EmployeeEntity> employeeEntity = query.getResultList();
		
		return employeeEntity;
	}


	
	@Override
	public void updateEmployee(EmployeeEntity employeeEntity) {
		//String hql = "update EmployeeEntity set employeeName =:employeeName, emailId =:emailId, password =:password, salary =:salary where employeeId = :employeeId";
		 getSession().update(employeeEntity);
		
	}

	@Override
	public EmployeeEntity findById(int id) {
		String hql = "from EmployeeEntity e  where e.employeeId =:employeeId";
		TypedQuery<EmployeeEntity> query = getSession().createQuery(hql);
		query.setParameter("employeeId", id);
		EmployeeEntity employeeEntity = query.getSingleResult();
		return employeeEntity ;
	}


	@Override
	public void deleteByEmpId(int id) {
		String hql = "delete from EmployeeEntity e where e.employeeId = :employeeId";
		Query query = getSession().createQuery(hql);
		query.setParameter("employeeId", id); 
		 query.executeUpdate();
	}


	

	
	
}
	
	


