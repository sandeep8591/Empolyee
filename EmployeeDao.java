package com.cg.emp.dao;
	import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import com.cg.emp.entity.Employee;
import com.cg.emp.exception.EmployeeException;
	
	public interface EmployeeDao {	
		
	public int addEmployee(Employee ee)throws EmployeeException;
	public HashMap<Integer, Employee> fetchAllEmp();
	public Employee getEmpById(int empId);
	public ArrayList<Employee> searchEmpByName(String name);
	public int deleteEmp(int empId);
	public Employee updateEmp(int empId, String newName, float newSal);
	}

