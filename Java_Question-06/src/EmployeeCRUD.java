import java.util.ArrayList;

public class EmployeeCRUD {
    private ArrayList<Employee> employeeList = new ArrayList<>();

    // Create
    public void addEmployee(Employee emp) {
        employeeList.add(emp);
        System.out.println("Employee added successfully.");
    }

    // Read
    public void viewEmployees() {
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }

    // Update
    public void updateEmployee(int id, String newName, String newDept) {
        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                emp.setName(newName);
                emp.setDepartment(newDept);
                System.out.println("Employee updated successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    // Delete
    public void deleteEmployee(int id) {
        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                employeeList.remove(emp);
                System.out.println("Employee deleted successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }
}

