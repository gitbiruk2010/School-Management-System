/**
 * using list to manage departments.
 */
import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Department> departments;

    public School(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Add a department to the school
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Get all departments in the school
    public List<Department> getAllDepartments() {
        return departments;
    }

    public String getName() {
        return name;
    }
}