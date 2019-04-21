package com.suraj.spring.test;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suraj.spring.beans.Employee;
import com.suraj.spring.beans.HCLInfo;

public class HCLInfoTest {

	public static void main(String[] args) {
		ApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext("spring.xml");
			HCLInfo info = context.getBean("info", HCLInfo.class);
			Map<Integer, String> nameMap = info.getMapEmpIdName();
			for (Entry<Integer, String> entry : nameMap.entrySet()) {
				System.out.println(entry.getKey()+"\t"+entry.getValue());
			}
			System.out.println("--------------------------------------------------");
			Map<Integer, Employee> empMap = info.getMapEmpIdEmployee();
			for (Entry<Integer, Employee> entry : empMap.entrySet()) {
				Integer key = entry.getKey();
				Employee employee = entry.getValue();
				System.out.println("key-->"+key);
				System.out.println("value--->"+employee.getId()+"\t"+employee.getName()+"\t"+employee.getOrgName());
			}
			
		} catch (BeansException e) {
			e.printStackTrace();
		} finally {
			if (context != null) {
				((AbstractApplicationContext) context).close();
			}
		}
	}
}
