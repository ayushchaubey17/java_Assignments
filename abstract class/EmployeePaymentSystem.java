import java.util.Scanner;

// Abstract class Employee
abstract class Employee {
    protected String name;
    protected String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method for calculating pay
    public abstract double calculatePay();

    // Concrete method to get employee details
    public String getEmployeeDetails() {
        return "Name: " + name + ", ID: " + id;
    }
}

// Subclass for hourly employees
class HourlyEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String name, String id, double hourlyRate, double hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

// Subclass for salaried employees
class SalariedEmployee extends Employee {
    private double annualSalary;

    public SalariedEmployee(String name, String id, double annualSalary) {
        super(name, id);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculatePay() {
        return annualSalary / 12; // Monthly pay
    }
}

// Main class to demonstrate functionality
public class EmployeePaymentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numberOfEmployees = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Employee[] employees = new Employee[numberOfEmployees];

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.print("Enter type of employee (hourly/salaried): ");
            String type = scanner.nextLine().trim().toLowerCase();

            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();

            System.out.print("Enter employee ID: ");
            String id = scanner.nextLine();

            if (type.equals("hourly")) {
                System.out.print("Enter hourly rate: ");
                double hourlyRate = scanner.nextDouble();
                System.out.print("Enter hours worked: ");
                double hoursWorked = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                employees[i] = new HourlyEmployee(name, id, hourlyRate, hoursWorked);
            } else if (type.equals("salaried")) {
                System.out.print("Enter annual salary: ");
                double annualSalary = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                employees[i] = new SalariedEmployee(name, id, annualSalary);
            } else {
                System.out.println("Invalid employee type. Please enter 'hourly' or 'salaried'.");
                i--; // Decrement i to repeat this iteration
            }
        }

        System.out.println("\nEmployee Payment Details:");
        for (Employee employee : employees) {
            System.out.println(employee.getEmployeeDetails() + ", Monthly Pay: $" + employee.calculatePay());
        }

        scanner.close();
    }
}
