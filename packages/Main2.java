import university.students.Student;
import university.courses.Course;
import university.faculty.Faculty;

public class Main2 {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("Ayush kumar", "S001");
        Student student2 = new Student("Bob Smith", "S002");

        // Create courses
        Course course1 = new Course("Introduction to Programming", "CS101");
        Course course2 = new Course("Data Structures", "CS102");

        // Create faculty
        Faculty faculty1 = new Faculty("Thamarai san", "F001", "java");
        Faculty faculty2 = new Faculty("Thamarai saan", "F002", "mysal");

        // Enroll students in courses
        student1.enrollInCourse(course1.getCourseCode());
        course1.enrollStudent(student1.getStudentId());

        student2.enrollInCourse(course1.getCourseCode());
        course1.enrollStudent(student2.getStudentId());

        student1.enrollInCourse(course2.getCourseCode());
        course2.enrollStudent(student1.getStudentId());

        // Display student details
        System.out.println(student1);
        System.out.println(student2);

        // Display course details
        System.out.println(course1);
        System.out.println(course2);

        // Display faculty details
        System.out.println(faculty1);
        System.out.println(faculty2);
    }
}
