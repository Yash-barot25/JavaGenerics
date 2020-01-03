package com.company.yash;

import java.util.ArrayList;

public class Department<T extends Student> implements Comparable<Department<T>> {
    private String name;
    private int students;

  private   ArrayList<T> departments = new ArrayList<>();

    public String getName() {
        return name;
    }

    public Department(String name) {
        this.name = name;
    }

     @Override
    public int compareTo(Department number) {
       if (this.students > number.students){
           return -1;
       }else if(this.students < number.students){
           return 1;
       }else{
           return 0;
       }
    }

    public void addStudents(T student){
        if (departments.contains(student)){
            System.out.println(student + " already exist in department");
        }else{
            departments.add(student);
            System.out.println(((Student)student).getName() + " is added in " + this.name);
        }
    }

    public int departmentSize(){
        this.students = this.departments.size();
        return  this.departments.size();
    }
}
