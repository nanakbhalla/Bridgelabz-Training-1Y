public class Employee{
String name;
int id;
int salary;

public static void main(String[] args){
Employee e1=new Employee();
e1.name="ARNAV";
e1.id=1;
e1.salary=90000;

Employee e2=new Employee();
e2.name="Bhavya";
e2.id=2;
e2.salary=100000;

System.out.println("Employee 1: " + e1.name + " " + e1.id + " " + e1.salary);
        System.out.println("Employee 2: " + e2.name + " " + e2.id + " " + e2.salary);
}
}