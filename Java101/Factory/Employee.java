package Factory;

import java.util.Date;

public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name,int salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    
    public double tax(double salary) {
        if(salary < 1000) {
            return 0;
        } else {
            return salary - salary * 0.03;
        }
    }

    public double bonus(int workHours) {
        if (workHours > 40){
            return (workHours - 40)*30 ;
        }else{
            return 0;
        }
    }

    public void raiseSalary(int hireYear){
        int currentYear = 2021;
        int year = currentYear - hireYear;
        if(year<10){
            salary += salary*0.05;
        }
        if(year>9 && year<20){
            salary += salary*0.1;
        }
        if(year>19){
            salary += salary*0.15;
        }
    }



    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return this.workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return this.hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", salary='" + getSalary() + "'" +
            ", workHours='" + getWorkHours() + "'" +
            ", hireYear='" + getHireYear() + "'" +
            "}";
    }

    public static void main(String[] args) {
        Employee employee = new Employee("akif", 1500, 45, 2008);
        employee.toString();
    }

}
