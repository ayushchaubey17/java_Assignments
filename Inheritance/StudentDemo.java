

 class Student {
    private String name;
    private int id;
    private int age;

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.id = 0;
        this.age = 0;
    }

    // Parameterized constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.age = 0;
    }

    // Parameterized constructor with more fields
    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', id=" + id + ", age=" + age + '}';
    }
}


class ZSGSStudent extends Student {
     private String program;
     private String major;

     // Default constructor
     public ZSGSStudent() {
         super();
         this.program = "Unknown";
         this.major = "Unknown";
     }

       public ZSGSStudent(String name, int id, String program) {
         super(name, id);
         this.program = program;
         this.major = "Undeclared";
     }

     public ZSGSStudent(String name, int id, int age, String program, String major) {
         super(name, id, age);
         this.program = program;
         this.major = major;
     }

     @Override
     public String toString() {
         return "ZSGSStudent{name='" + getName() + "', id=" + getId() + ", age=" + getAge() +
                 ", program='" + program + "', major='" + major + "'}";
     }
 }



public class StudentDemo {
    public static void main(String[] args) {
         ZSGSStudent student1 = new ZSGSStudent();
        System.out.println(student1);

        ZSGSStudent student2 = new ZSGSStudent("Ayush", 101, "Computer Science");
        System.out.println(student2);

        ZSGSStudent student3 = new ZSGSStudent("Muskan", 102, 22, "Engineering", "Electrical");
        System.out.println(student3);


    }
}
