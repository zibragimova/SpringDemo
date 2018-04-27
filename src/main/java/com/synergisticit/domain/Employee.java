package com.synergisticit.domain;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	
	public long empId;
	public String name;
	public float salary;
	private Address address;
	
	private List<String> hobbies;
	private Set<String> skillSet;
	private Map<String, String> visitedCities;
	private Map<Integer,String> cities;
	
	
	
	public List<String> getHobbies() {
		return hobbies;
	}


	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}


	public Set<String> getSkillSet() {
		return skillSet;
	}


	public void setSkillSet(Set<String> skillSet) {
		this.skillSet = skillSet;
	}


	public Map<String, String> getVisitedCities() {
		return visitedCities;
	}


	public void setVisitedCities(Map<String, String> visitedCities) {
		this.visitedCities = visitedCities;
	}


	public Map<Integer, String> getCities() {
		return cities;
	}


	public void setCities(Map<Integer, String> cities) {
		this.cities = cities;
	}


	public Employee() {
	}
	

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", address=" + address
				+ ", hobbies=" + hobbies + ", skillSet=" + skillSet + ", visitedCities=" + visitedCities + ", cities="
				+ cities + "]";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
