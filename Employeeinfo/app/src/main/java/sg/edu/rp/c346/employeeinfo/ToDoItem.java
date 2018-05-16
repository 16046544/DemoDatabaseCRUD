package sg.edu.rp.c346.employeeinfo;


public class ToDoItem {
    public ToDoItem(String name, String role, int salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    private String name;
    private String role;
    private int salary;

    // getter and setter
    public String getName() {

        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ToDoItem{" +
                "name" + name + "\"" + "role" + role + "\"" + "salary" + salary + '}';
    }
}
