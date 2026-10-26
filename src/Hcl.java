
import java.util.ArrayList;
import java.util.List;

class Employee {
    int employeeId;
    String employeeName;
    String department;
    String projectName;

    Employee(int employeeId, String employeeName,
             String department, String projectName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.projectName = projectName;
    }
    void displayEmployee() {
        System.out.println(employeeId + " | " + employeeName
                + " | " + department + " | " + projectName);
    }
}

public class Hcl {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Rahul", "Java",
                "Banking Application"));
        employees.add(new Employee(102, "Priya", "Testing",
                "Insurance Portal"));
        employees.add(new Employee(103, "Amit", "Java",
                "Banking Application"));
        employees.add(new Employee(104, "Sneha", "HR",
                "Employee Management"));
        employees.add(new Employee(105, "Rohit", "Testing",
                "Banking Application"));
        employees.add(new Employee(106, "Neha", "Java",
                "Insurance Portal"));
        employees.add(new Employee(107, "Karan", "Cloud",
                "E-Commerce Platform"));
        employees.add(new Employee(108, "Anjali", "Java",
                "Banking Application"));

        System.out.println("HCL Employee Project Management System");
        System.out.println("------------------------------------------------");
        System.out.println("ID | Name | Department | Project");
        System.out.println("------------------------------------------------");

        for (Employee employee : employees) {
            employee.displayEmployee();
        }

        System.out.println("------------------------------------------------");
        System.out.println("Total Employees: " + employees.size());
    }
}
