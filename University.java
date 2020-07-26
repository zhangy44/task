package com.first.com.hibernate;

import java.util.Map;

public class University {
	//Id of the university
	private String id;
	//name of the university
	private String name;
	//key: major id
	//value: major name
	private Map<String, String> providedMajor;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, String> getProvidedMajor() {
		return providedMajor;
	}
	public void setProvidedMajor(Map<String, String> providedMajor) {
		this.providedMajor = providedMajor;
	}
	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", providedMajor=" + providedMajor + "]";
	}
	
}
