package com.sri.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //To create bean and use it before the class
public class College {
	@Value("${college.name}")   //To Assign values to the literal_dependencies and use it before the literal_dependencies
	private String collegeName;
	@Autowired					//To inject the object and use it before the Object_dependency
	private Principal principal;
	@Autowired					
	@Qualifier("scienceTeacher")//To mention which object that you want to inject and use it before the object_dependency
								//Because Teacher is an Interface
	private Teacher teacher;

	/*
	 * public void setTeacher(Teacher teacher) { this.teacher = teacher; }
	 */
	
	
	/*
	 * public void setPrincipal(Principal principal) { this.principal = principal;
	 * System.out.println("Setter Injection"); }
	 */

	/*
	 * public College(Principal principal) { this.principal=principal;}
	 */
	public void test() {
		System.out.println("====== Calling test() method =====");
		principal.principlelInfo();
		teacher.teach();
		System.out.println("College: "+collegeName);
	}
}
