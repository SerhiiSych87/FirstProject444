package Homework_22;

import java.io.Serializable;

public class CompanyClass implements Serializable {

      private int value;
      private String chief;
      Department department;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getChief() {
        return chief;
    }

    public void setChief(String chief) {
        this.chief = chief;
    }

    public CompanyClass(int value, String chief, Department department) {
        this.value = value;
        this.chief = chief;
        this.department = department;
    }
}

class Department implements  Serializable{

    String employee;

    public Department(String employee) {
        this.employee = employee;
    }
}