import java.util.ArrayList;
import java.util.List;


interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}


abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

   
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    
    public abstract double calculateSalary();

  
    public void displayDetails() {
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Name          : " + name);
        System.out.println("Base Salary   : " + baseSalary);
        System.out.println("Total Salary  : " + calculateSalary());
    }
}


class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    
    public double calculateSalary() {
         Fixed salary for full-time employee
        return getBaseSalary();
    }

 
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    
    public String getDepartmentDetails() {
        return "Department    : " + department;
    }

    
    public void displayDetails() {
        super.displayDetails();
        System.out.println(getDepartmentDetails());
        System.out.println("-----------------------------");
    }
}


class PartTimeEmployee extends Employee implements Department {
    private int workHours;
    private String department;

    public PartTimeEmployee(int employeeId, String name, double hourlyRate, int workHours) {
        super(employeeId, name, hourlyRate);
        this.workHours = workHours;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    
    public double calculateSalary() {
        Salary based on hourly rate * work hours
        return getBaseSalary() * workHours;
    }

    
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    
    public String getDepartmentDetails() {
        return "Department    : " + department;
    }

    
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Work Hours    : " + workHours);
        System.out.println(getDepartmentDetails());
        System.out.println("-----------------------------");
    }
}


public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee emp1 = new FullTimeEmployee(101, "Aman", 50000);
        emp1.assignDepartment("HR");

        PartTimeEmployee emp2 = new PartTimeEmployee(102, "Riya", 500, 20);
        emp2.assignDepartment("IT");

        FullTimeEmployee emp3 = new FullTimeEmployee(103, "Karan", 60000);
        emp3.assignDepartment("Finance");

        PartTimeEmployee emp4 = new PartTimeEmployee(104, "Simran", 400, 25);
        emp4.assignDepartment("Marketing");

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}