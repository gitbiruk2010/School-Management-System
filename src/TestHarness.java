/**
  * Test to see how the program handles normal and edge cases without crashing.
 */
public class TestHarness {
    public static void main(String[] args) {
        System.out.println("=== Running Custom Test Harness ===");

        // ========== Normal Test Cases ==========

        // Test 1: Add a department to a school
        System.out.println("\nTest 1: Add a department to a school");
        School school = new School("Test School");
        Department department = new Department("Computer Science");
        school.addDepartment(department);

        System.out.println("School: " + school.getName());
        System.out.println("Departments: " + school.getAllDepartments().getFirst().getName());
        System.out.println("Test 1 Passed: Department added successfully.");

        // Test 2: Add a teacher to a department
        System.out.println("\nTest 2: Add a teacher to a department");
        Teacher teacher = new Teacher("Mr. Smith", "Algebra");
        department.addTeacher(teacher);

        System.out.println("Teacher: " + department.getAllTeachers().getFirst().getName());
        System.out.println("Subject: " + department.getAllTeachers().getFirst().getSubject());
        System.out.println("Test 2 Passed: Teacher added successfully.");

        // Test 3: Add a student to a department
        System.out.println("\nTest 3: Add a student to a department");
        Student student = new Student("Alice", "Junior");
        department.addStudent(student);

        System.out.println("Student: " + department.getAllStudents().getFirst().getName());
        System.out.println("Grade: " + department.getAllStudents().getFirst().getGradeLevel());
        System.out.println("Test 3 Passed: Student added successfully.");

        // ========== Edge Test Cases ==========

        // Test 4: Add a null department to a school
        System.out.println("\nTest 4: Add a null department to a school");
        try {
            school.addDepartment(null);
            System.out.println("School Departments: " + school.getAllDepartments().size());
            System.out.println("Test 4 Passed: Program did not crash when adding a null department.");
        } catch (Exception e) {
            System.out.println("Test 4 Failed: Program crashed with exception - " + e.getMessage());
        }

        // Test 5: Add a teacher with null values (name/subject)
        System.out.println("\nTest 5: Add a teacher with null values");
        try {
            Teacher nullTeacher = new Teacher(null, null);
            department.addTeacher(nullTeacher);
            System.out.println("Teacher Name: " + department.getAllTeachers().get(1).getName());
            System.out.println("Teacher Subject: " + department.getAllTeachers().get(1).getSubject());
            System.out.println("Test 5 Passed: Program did not crash when adding a teacher with null values.");
        } catch (Exception e) {
            System.out.println("Test 5 Failed: Program crashed with exception - " + e.getMessage());
        }

        // Test 6: Add a student with an invalid grade level (empty string)
        System.out.println("\nTest 6: Add a student with an invalid grade level");
        try {
            Student invalidStudent = new Student("Bob", "");
            department.addStudent(invalidStudent);
            System.out.println("Student Grade: " + department.getAllStudents().get(1).getGradeLevel());
            System.out.println("Test 6 Passed: Program did not crash when adding a student with an invalid grade.");
        } catch (Exception e) {
            System.out.println("Test 6 Failed: Program crashed with exception - " + e.getMessage());
        }

        System.out.println("\n=== All Tests Completed ===");
    }
}