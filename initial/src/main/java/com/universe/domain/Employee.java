package com.universe.domain;

public class Employee {
  private final int id;
  private String name;
  private String designation;
  private Double salary;

  public Employee(int id, String name, String designation, Double salary) {
    this.id = id;
    this.name = name;
    this.designation = designation;
    this.salary = salary;
  }

  public Employee(){
      this.id=1;
  }

  public int getId(){
    return this.id;
  }

  public String getName(){
    return this.name;
  }

  public String getDesignation(){
    return this.designation;
  }

  public Double getSalary(){
    return this.salary;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setDesignation(String designation){
    this.designation = designation;
  }

  public void setSalary(Double salary){
    this.salary = salary;
  }

  public String toString(){
    return "{ id :"+this.id+", name :\""+this.name+"\", designation :\""+this.designation+"\", salary :"+this.salary+"    }";
  }
}
