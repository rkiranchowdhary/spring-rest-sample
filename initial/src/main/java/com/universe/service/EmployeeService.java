package com.universe.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import com.universe.domain.Employee;
import com.universe.business.EmployeeManager;

@Configuration
@EnableAutoConfiguration
@RestController
public class EmployeeService {

 private EmployeeManager em = new EmployeeManager();

 @RequestMapping(value = "/emp", method = RequestMethod.GET,headers="Accept=application/json")
 public List<Employee> getEmployees()
 {
  return em.getAllEmployees();
 }

 @RequestMapping(value = "/", method = RequestMethod.GET,headers="Accept=application/json")
 public String sayHello()
 {
  return "Hello world!";
 }

 @RequestMapping(value = "/error", method = RequestMethod.GET,headers="Accept=application/json")
 public String error()
 {
  return "ERROR!";
 }

 @RequestMapping(value = "/emp/{id}", method = RequestMethod.GET,headers="Accept=application/json")
 public Employee getEmployeeByID(@PathVariable int id)
 {
  return em.getEmployeeByID(id);
 }

 @RequestMapping(value = "/emp/{id}", method = RequestMethod.DELETE,headers="Accept=application/json")
 public int deleteEmployee(@PathVariable int id)
 {
  return em.deleteEmployee(id);
 }

 @RequestMapping(value = "/emp/{id}", method = RequestMethod.POST,headers="Accept=application/json")
 public Employee update(@RequestBody Employee employee)
 {
  return em.updateEmployee(employee);
 }

 @RequestMapping(value = "/emp", method = RequestMethod.PUT,headers="Accept=application/json")
 public int add(@RequestBody Employee employee)
 {
  return em.addEmployee(employee);
 }
}
