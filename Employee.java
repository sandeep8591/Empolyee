package com.cg.emp.entity;

import java.time.LocalDate;
import java.util.Comparator;

public class Employee {
private int empid;
private String empname;
private float empsal;
private LocalDate empdoj;

public Employee() {
	super();
}

public Employee(int eid, String empname, float esal, LocalDate empdoj) {
	super();
	this.empid = eid;
	this.empname = empname;
	this.empsal = esal;
	this.empdoj = empdoj;
}

public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public float getEmpsal() {
	return empsal;
}
public void setEmpsal(float empsal) {
	this.empsal = empsal;
}
public LocalDate getEmpdoj() {
	return empdoj;
}
public void setEmpdoj(LocalDate empdoj) {
	this.empdoj = empdoj;
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", empname=" + empname + ", empsal="
			+ empsal + ", empdoj=" + empdoj + "]";
}
public static Comparator<Employee> getCompByName(){
	Comparator comp=new Comparator<Employee>() {

	@Override
	public int compare(Employee a,Employee b) {
		// TODO Auto-generated method stub
		return a.empname.compareTo(b.empname);
	}
};
return comp;
}
}

