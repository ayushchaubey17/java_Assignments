package university.courses;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private String courseCode;
    private List<String> enrolledStudents;

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public List<String> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void enrollStudent(String studentId) {
        enrolledStudents.add(studentId);
    }

    @Override
    public String toString() {
        return "Course [Course Name=" + courseName + ", Course Code=" + courseCode + ", Enrolled Students=" + enrolledStudents + "]";
    }
}
