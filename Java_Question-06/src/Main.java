//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        EmployeeCRUD crud = new EmployeeCRUD();

        Employee e1 = new Employee(1, "Harsh", "Software Engineer");
        Employee e2 = new Employee(2, "Ramesh", "Finance");

        crud.addEmployee(e1);
        crud.addEmployee(e2);

        crud.viewEmployees();

        crud.updateEmployee(1, "Yogesh", "Manager");
        crud.viewEmployees();

        crud.deleteEmployee(2);
        crud.viewEmployees();
    }
}