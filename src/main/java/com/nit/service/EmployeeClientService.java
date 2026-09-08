package com.nit.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nit.entity.Employee;

@Service
public class EmployeeClientService {

	@Autowired
	private RestTemplate restTemplate;
	
	private final String BASE_URL ="http://localhost:8080/SB_48_Employee_Rest_API_Crud/emp";
	
	
	 public Employee addEmployee(Employee emp) {
		//  String url = BASE_URL + "/add";

	        ResponseEntity<Employee> response =
	                restTemplate.postForEntity(
	                        BASE_URL+"/add",
	                        emp,
	                        Employee.class);

	        return response.getBody();
	    }

	    // 2. GET ALL
	    public List<Employee> getAllEmployees() {

	        ResponseEntity<Employee[]> response =
	                restTemplate.getForEntity(
	                        BASE_URL+"/getAll",
	                        Employee[].class);

	        return Arrays.asList(response.getBody());
	    }
	    
	 // 3. GET BY ID
	    public Employee getEmployeeById(Long id) {

	        String url = BASE_URL + "/getById/" + id;

	        ResponseEntity<Employee> response =
	                restTemplate.getForEntity(
	                        url,
	                        Employee.class);

	        return response.getBody();
	    }


	    // 4. UPDATE
	    public Employee updateEmployee(
	            Long id,
	            Employee emp) {

	        String url = BASE_URL + "/update/" + id;

	        HttpEntity<Employee> request =
	                new HttpEntity<>(emp);

	        ResponseEntity<Employee> response =
	                restTemplate.exchange(
	                        url,
	                        HttpMethod.PUT,
	                        request,
	                        Employee.class);

	        return response.getBody();
	    }


	    // 5. DELETE
	    public void deleteEmployee(Long id) {

	        String url = BASE_URL + "/delete/" + id;

	        restTemplate.delete(url);
	    }
	

	 
}
