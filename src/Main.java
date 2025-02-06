//school management system with aggregation.
public class Main {
    public static void main(String[] args) {
        // create the school
        School school = new School("JBL College");

        // create departments
        Department environmentalScience = new Department("Environmental Science & ");
        Department politicalScience = new Department("Political Science");

        // add departments to the school
        school.addDepartment(environmentalScience);
        school.addDepartment(politicalScience);

        // add teachers to Environmental Science
        environmentalScience.addTeacher(new Teacher("Dr. Karla", "Ecology and Biodiversity"));
        environmentalScience.addTeacher(new Teacher("Mrs. Susan", "Climate Change and Global Warming"));

        // add students to Environmental Science
        environmentalScience.addStudent(new Student("Bona Bee", "Freshman"));
        environmentalScience.addStudent(new Student("Chris Boon", "Senior"));
        environmentalScience.addStudent(new Student("Lucia Gary", "Sophomore"));

        // add teachers to Political Science
        politicalScience.addTeacher(new Teacher("Mr. Ken", "Env Politics and Policy"));
        politicalScience.addTeacher(new Teacher("Ms. Louise", "Int Relations and Env Diplomacy"));

        // add students to Political Science
        politicalScience.addStudent(new Student("Rose Miller", "Freshman"));
        politicalScience.addStudent(new Student("Jeremy Gard", "Sophomore"));
        politicalScience.addStudent(new Student("Hannah Don", "Senior"));

        // print school details
        System.out.println("\n==============================================================================================");
        System.out.println("School: " + school.getName());

        // print departments
        System.out.print("Departments: ");
        for (Department department : school.getAllDepartments()) {
            System.out.print(department.getName() + " ");
        }
        System.out.println("\n==============================================================================================");

        // print details for each department
        for (Department department : school.getAllDepartments()) {
            System.out.println("\n" + department.getName());

            // print teachers
            System.out.print("- Teachers: ");
            for (Teacher teacher : department.getAllTeachers()) {
                System.out.print(teacher.getName() + " (" + teacher.getSubject() + "), ");
            }

            // print students
            System.out.print("\n- Students: ");
            for (Student student : department.getAllStudents()) {
                System.out.print(student.getName() + " (" + student.getGradeLevel() + "), ");
            }
            System.out.println("\n==============================================================================================");
        }
    }
}