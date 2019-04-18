package com.cg.emp.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.emp.entity.Employee;
import com.cg.emp.exception.EmployeeException;

public interface EmployeeService {
	
public int addEmployee(Employee ee)throws EmployeeException;
public HashMap<Integer, Employee> fetchAllEmp();
public Employee getEmpById(int empId);
public ArrayList<Employee> searchEmpByName(String empName);
public int deleteEmp(int empId);
public Employee updateEmp(int empId, String newName, float newSal);

public static boolean validateEmpName(String ename)throws EmployeeException{
	Pattern p=Pattern.compile("[A-Z a-z]{1,10}");
	Matcher m=p.matcher(ename);
	if(m.matches()){
		return true;
	}
	return false;
}
public static boolean validateEmpId(String eid)throws EmployeeException{
Pattern p1=Pattern.compile("[0-9]{1,5}");
Matcher m1=p1.matcher(eid);
if(m1.matches()){
	return true;
}
return false;
}
public static boolean validateEmpSal(String esal)throws EmployeeException{
	Pattern p=Pattern.compile("[0-9]{1,10}");
	Matcher m=p.matcher(esal);
	if(m.matches()){
		return true;
	}
	return false;
}
public static boolean validateEmpDoj(String Doj)throws EmployeeException{
	Pattern p=Pattern.compile("[0-9]{1,10}");
	Matcher m=p.matcher(Doj);
	if(m.matches()){
		return true;
	}
	return false;
}
}

