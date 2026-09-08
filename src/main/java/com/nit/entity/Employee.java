package com.nit.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Employee {

	
	   private Long employeeId;
	    private String employeeName;
	    private String department;
	    private Double salary;
	    private String designation;
	    

}
