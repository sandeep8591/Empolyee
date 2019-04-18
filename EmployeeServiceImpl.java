package com.cg.emp.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.emp.dao.EmployeeDao;
import com.cg.emp.dao.EmployeeDaoImpl;
import com.cg.emp.entity.Employee;
import com.cg.emp.exception.EmployeeException;

public class EmployeeServiceImpl implements EmployeeService{
    EmployeeDao edao=new EmployeeDaoImpl();
	@Override
	public int addEmployee(Employee emp) throws EmployeeException {
		// TODO Auto-generated method stub
		edao.addEmployee(emp);
		return emp.getEmpid();
	}

	@Override
	public HashMap<Integer, Employee> fetchAllEmp() {
		// TODO Auto-generated method stub
		HashMap<Integer, Employee> hs1=edao.fetchAllEmp();
		return hs1;
	}

	@Override
	public Employee getEmpById(int empId) {
		// TODO Auto-generated method stub
		Employee e3=edao.getEmpById(empId);
		return e3;
	}

	@Override
	public ArrayList<Employee> searchEmpByName(String empName) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> e5=edao.searchEmpByName(empName);
		return e5;
	}

	@Override
	public int deleteEmp(int empId) {
		// TODO Auto-generated method stub
		edao.deleteEmp(empId);
		return empId;
	}

	@Override
	public Employee updateEmp(int empId, String newName, float newSal) {
		// TODO Auto-generated method stub
		Employee e6=edao.updateEmp(empId, newName, newSal);
		return e6;
	}
}
