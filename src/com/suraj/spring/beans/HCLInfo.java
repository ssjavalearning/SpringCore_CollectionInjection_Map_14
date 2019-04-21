package com.suraj.spring.beans;

import java.util.Map;

public class HCLInfo {
	
	private Map<Integer, String> mapEmpIdName;
	private Map<Integer, Employee> mapEmpIdEmployee;
	
	public Map<Integer, String> getMapEmpIdName() {
		return mapEmpIdName;
	}
	public void setMapEmpIdName(Map<Integer, String> mapEmpIdName) {
		this.mapEmpIdName = mapEmpIdName;
	}
	public Map<Integer, Employee> getMapEmpIdEmployee() {
		return mapEmpIdEmployee;
	}
	public void setMapEmpIdEmployee(Map<Integer, Employee> mapEmpIdEmployee) {
		this.mapEmpIdEmployee = mapEmpIdEmployee;
	}
}
