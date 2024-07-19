class Employee {
    String empName;
    int empId;
    String email;
    String gender;
    float salary;

    public void printEmployeeDetails() {
        System.out.println("Employee: " + empName + ", ID: " + empId + ", Email: " + email + ", Gender: " + gender + ", Salary: " + salary);
    }

    Employee(String empName, int empId, String email, String gender, float salary) {
        this.empName = empName;
        this.empId = empId;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }
}

class HourlyEmployee extends Employee {
    float hourlyRate;

    HourlyEmployee(String empName, int empId, String email, String gender, float salary, float hourlyRate) {
        super(empName, empId, email, gender, salary);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void printEmployeeDetails() {
        System.out.println("Hourly Employee  " + empName + ", ID: " + empId + ", Hourly Rate: " + hourlyRate);
    }
}

class SalariedEmployee extends Employee {
    float bonus;

    SalariedEmployee(String empName, int empId, String email, String gender, float salary, float bonus) {
        super(empName, empId, email, gender, salary);
        this.bonus = bonus;
    }

    @Override
    public void printEmployeeDetails() {
        System.out.println("Salaried Employee: " + empName + ", ID: " + empId + ", Bonus: " + bonus);
    }
}

public class Main {
    public static void main(String[] args) {

        HourlyEmployee hourlyEmp = new HourlyEmployee("Mohaan", 1101, "mohann@example.com", "Male", 305.0f, 12.0f);
        SalariedEmployee salariedEmp = new SalariedEmployee("Sohan", 2101, "sohan@example.com", "male", 70000.0f, 3500.0f);

      hourlyEmp.printEmployeeDetails();
      salariedEmp.printEmployeeDetails();
    }
}
