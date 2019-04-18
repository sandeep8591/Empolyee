package com.cg.emp.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import com.cg.emp.entity.Employee;
import com.cg.emp.exception.EmployeeException;
import com.cg.emp.util.CollectionUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public int addEmployee(Employee emp) throws EmployeeException {
		// TODO Auto-generated method stub
		CollectionUtil.addEmp(emp);
		return emp.getEmpid();
	}

	@Override
	public HashMap<Integer, Employee> fetchAllEmp() {
		// TODO Auto-generated method stub
		HashMap<Integer, Employee> h=CollectionUtil.fetchAllEmp();
		return h;
	}

	@Override
	public Employee getEmpById(int empId) {
		// TODO Auto-generated method stub
		Employee e2=CollectionUtil.getEmpById(empId);
		return e2;
	}

	@Override
	public ArrayList<Employee> searchEmpByName(String empName) {
		// TODO Auto-generated method stub
		ArrayList<Employee> emp=CollectionUtil.searchEmpByName(empName);
		return emp;
	}

	@Override
	public int deleteEmp(int empId) {
		// TODO Auto-generated method stub
		CollectionUtil.deleteEmp(empId);
		return empId;
	}

	@Override
	public Employee updateEmp(int empId, String newName, float newSal) {
		// TODO Auto-generated method stub
		Employee e4=CollectionUtil.updateEmp(empId, newName, newSal);
		return e4;
	}


}
