package com.universe.business;
import java.util.*;

import com.universe.domain.Employee;
import com.universe.common.Data;

public class EmployeeManager{

  private Map<Integer,Employee> map = Data.getInstance().getMap();

  public List<Employee> getAllEmployees(){
    return new ArrayList(map.values());
  }

  public Employee getEmployeeByID(Integer id){
    return map.get(id);
  }

  public Integer deleteEmployee(Integer id){
    map.remove(id);
    return id;
  }

  public Employee updateEmployee(Employee employee){
    map.put(employee.getId(), employee);
    return map.get(employee.getId());
  }

  public Integer addEmployee(Employee employee){
    map.put(employee.getId(), employee);
    return employee.getId();
  }
}
