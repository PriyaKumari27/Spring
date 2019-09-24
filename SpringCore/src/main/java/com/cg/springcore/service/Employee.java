package com.cg.springcore.service;
import com.cg.springcore.service.Project;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("emp")
public class Employee {
	@Value("Pqr")
	private String empName;
	
	
	@Autowired
	private Project pro;

	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public Project getPro() {
		return pro;
	}



	public void setPro(Project pro) {
		this.pro = pro;
	}

	
//	private Project projc;
//	private Set<Department> deptId;
//	private int empId;
	
	
	
	/*public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(String empName, int empId) {  //For constructor injection
		super();
		this.empName = empName;
		this.empId=empId;
	}*/


	//private Department depId;
	




	/*public void setDepId(Department depId) {
		this.depId = depId;
	}*/

	




/*	public void setEmpName(String empName) {
		this.empName = empName;
	}


	


	public void setProjc(Project projc) {
		this.projc = projc;
	}





	public void setDeptId(Set<Department> deptId) {
		this.deptId = deptId;
	}*/



	

	


	public void getData()
	{
		//System.out.println("Hiiee Welcome....Spring Core..."+ this.empName + " "+projc.getProjId()+" " +depId.getDeptId() );
		System.out.println("Hiiee Welcome....Spring Core..." +this.empName);
		System.out.println(pro.getProjId());
		/*System.out.println(this.empId);
		
			System.out.println(this.projc.getProjId());
		
		for(Department department:deptId) {
			System.out.println(department.getDeptId());
		}*/
	}



	
/*	public void callFirst() {
		System.out.println("In callFirst method");
	}
	
	public void callLast() {
		System.out.println("In callLast method");
	}*/



	/*public Department getDepId() {
		return depId;
	}*/

}
