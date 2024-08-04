
 class Employee {
    private String name;
    private String id;
    private String department;
    private double salary;

    // Default constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(String name, String id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}



 public class EmployeeManager {
     private Employee[] employees;
     private int count;

     public EmployeeManager(int capacity) {
         employees = new Employee[capacity];
         count = 0;
     }

     public void addEmployee(String name, String id, String department, double salary) {
         if (count < employees.length) {
             employees[count++] = new Employee(name, id, department, salary);
         } else {
             System.out.println("Array is full. Cannot add more employees.");
         }
     }

     public void displayEmployees() {
         if (count == 0) {
             System.out.println("No employees to display.");
             return;
         }
         for (int i = 0; i < count; i++) {
             System.out.println(employees[i]);
         }
     }

     public static void main(String[] args) {
         EmployeeManager manager = new EmployeeManager(5);

         manager.addEmployee("Ayush", "E001", "it", 50000);
         manager.addEmployee("muskan", "E002", "cse", 60000);

         System.out.println("Employees added:");
         manager.displayEmployees();
     }
 }
