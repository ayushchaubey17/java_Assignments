 class EmployeeDTO {
    // Static variable to keep track of the number of employees
    private static int employeeCount = 0;

    // Instance variables (PII)
    private String employeeId;
    private String name;
    private String email;
    private double salary;

    public EmployeeDTO(String employeeId, String name, String email, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.email = email;
        this.salary = salary;
        employeeCount++;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

     public static int getEmployeeCount() {
        return employeeCount;
    }


    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Salary: " + salary);
    }
}


class Main{
    public static void main(String[] args) {
        EmployeeDTO obj = new EmployeeDTO("e12", "raman","abc@gmail.com",343 );
        obj.setEmployeeId("sds");
        obj.getEmployeeId();
    }
}

