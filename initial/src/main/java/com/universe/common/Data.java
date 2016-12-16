package com.universe.common;

import java.util.*;
import com.universe.domain.Employee;

public class Data{
  public static Data instance = new Data();
  private Map<Integer,Employee> map;

  private Data(){
    map = new HashMap<Integer, Employee>();
    initializeData();
  }

  public static Data getInstance(){
    return instance;
  }

  private void initializeData(){
    map.put(1,new Employee(1, "Sachin Tendulkar", "Batsman", 100000.0));
    map.put(2,new Employee(2, "Mahendra Singh Dhoni", "Batsman / W & C", 80000.0));
    map.put(3,new Employee(3, "Virat Kohli", "Vice Captain", 70000.0));
    map.put(4,new Employee(4, "Yuvraj Singh", "Batsman", 60000.0));
    map.put(5,new Employee(5, "R Ashwin", "Offbreak bowler", 60000.0));
    map.put(6,new Employee(6, "Virendra Sehwagh", "Batsman", 50000.0));
    map.put(7,new Employee(7, "Ravindra Jadeja", "AllRounder",40000.0));
    map.put(8,new Employee(8, "Anjikya Rahane", "Batsman", 50000.0));
    map.put(9,new Employee(9, "Bhuvaneshwar Kumar", "Medium Fast Bowler", 50000.0));
    map.put(10,new Employee(10, "Mohammed Shami", "Medium Fast Bowler", 40000.0));
    map.put(11,new Employee(11, "Hardik Pandya", "Medium Fast Bowler", 30000.0));

  }
  public Map<Integer,Employee> getMap(){
    return this.map;
  }
}
