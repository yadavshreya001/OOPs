package objectInitialization.constructor;

public class Employee {

    String name;
    int empId;

    public Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 234);
        Employee emp2 = new Employee("Xin Win pe", 134);
        System.out.println("Employee 1: " + emp1.name + " , " + emp1.empId);
        System.out.println("Employee 2: " + emp2.name + " , " + emp2.empId);
    }

}
