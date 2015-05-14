package com.sample.controller;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.sample.persistance.DatabaseUtil;
import com.sample.model.*;

@Path("/empAPI")
public class EmployeAPI {

	@GET
	@Path("/get")
	public Response getEmp(@QueryParam("empId") String empId) {
 
		 
		 DatabaseUtil dbUtil2 = new DatabaseUtil();
		 Session session = dbUtil2.getSessionFactory().openSession();
		 session.beginTransaction();
		
		 Criteria criteria = session.createCriteria(EmpMstr.class);  
		 System.out.print(empId);
		 criteria.add( Restrictions.eq("empId", empId));
		 List results = criteria.list();
		 if(results.size()!=0){
		 EmpMstr emp = (EmpMstr)results.get(0);
		 
		 session.close();
		 dbUtil2.shutdown();
		
		 String empDetails = "EmpId : "+emp.getEmpId()+"\r\n"+
				 			 "EmpFirstName : "+emp.getEmpFirstName()+"\r\n"+
				 			 "EmpLastName : "+emp.getEmpLastName()+"\r\n"+
				 			 "EmpDept : "+emp.getEmpDept()+"\r\n"+
				 			 "EmpGroup : "+emp.getEmpGroup()+"\r\n"+
				 			 "EmpType : "+emp.getEmpType()+"\r\n";
		 					  for(EmpDet det : emp.getEmpDet()){
		 						empDetails = empDetails + "Emp CTC : "+det.getEmpCtc()+"\r\n"+
 					 			 "Emp Pf Amt : "+det.getEmpPfAmt()+"\r\n"+
 					 			 "Emp Tax Amt : "+det.getEmpTaxAmt()+"\r\n";
		 					  }
				 			 
		 System.out.println(emp.getEmpDept()+""+emp.getEmpFirstName()+""+emp.getEmpLastName());
		return Response.status(200).entity(empDetails).build();
		 }
		 else
		 {
			 return Response.status(200).entity("No record Found").build();
		 }
 
	}
	
	@POST
	@Path("/add")
	public Response addEmp(@FormParam("empId") String empId, @FormParam("empFirstName") String empFirstName,
						   @FormParam("empLastName") String empLastName, @FormParam("empDept") String empDept,
						   @FormParam("empGroup") String empGroup, @FormParam("empType") String empType,
						   @FormParam("empCtc") String empCtc, @FormParam("empPfAmt") String empPfAmt, @FormParam("empTaxAmt") String empTaxAmt){
		
		
		 DatabaseUtil dbUtil = new DatabaseUtil();
		 Session session = dbUtil.getSessionFactory().openSession();
		 session.beginTransaction();
		
		 EmpMstr empMstr = new EmpMstr();
		 empMstr.setEmpFirstName(empFirstName);
		 empMstr.setEmpLastName(empLastName);
		 empMstr.setEmpId(empId);
		 empMstr.setEmpDept(empDept);
		 empMstr.setEmpGroup(empGroup);
		 empMstr.setEmpType(empType);
		 Set<EmpDet> empDet = new HashSet<EmpDet>();
		 EmpDet empDetObj = new EmpDet();
		 empDetObj.setEmpMstr(empMstr);
		 empDetObj.setEmpCtc(new BigDecimal(empCtc));
		 empDetObj.setEmpPfAmt(new BigDecimal(empPfAmt));
		 empDetObj.setEmpTaxAmt(new BigDecimal(empTaxAmt));
		 
		 empDet.add(empDetObj);
		 
		 empMstr.setEmpDet(empDet);
		 
		 session.save(empMstr);
		 session.getTransaction().commit();
		 session.close();
		 dbUtil.shutdown();
		
		return Response.status(200).entity("Employee Details Added Successfully").build();
	}

}
