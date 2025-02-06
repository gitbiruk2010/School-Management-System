/**
 * a department that aggregates teachers and students.
 * using lists to manage teachers and students.
 */
import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Teacher> teachers;
    private List<Student> students;

    public Department(String name) {
        this.name = name;
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    // Add a teacher to the department
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    // Add a student to the department
    public void addStudent(Student student) {
        students.add(student);
    }

    // Get all teachers in the department
    public List<Teacher> getAllTeachers() {
        return teachers;
    }

    // Get all students in the department
    public List<Student> getAllStudents() {
        return students;
    }

    public String getName() {
        return name;
    }
}