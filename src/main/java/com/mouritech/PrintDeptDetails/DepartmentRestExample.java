package com.mouritech.PrintDeptDetails;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/v1") 
public class DepartmentRestExample {
	
	ArrayList<Department> deptList = new ArrayList<Department>();
	
	@Path("/listDepartments")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Department> getAllDepartments(){
		deptList = createDepartmentList();
		return deptList;
	}
	
	public ArrayList<Department> createDepartmentList()
	{
		deptList.add(new Department(1,"Telugu"));
		deptList.add(new Department(124,"Maths"));
		deptList.add(new Department(125,"Science"));
		return deptList;
	}
}
