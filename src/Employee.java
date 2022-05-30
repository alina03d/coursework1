public class Employee {
    private static int counter = 1;

    private final String fullname;
    private int department;
    private int salary;
    private final int id;

    public Employee(String fullname, int department, int salary) {
        this.fullname = fullname;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getFullname() {
        return fullname;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("ФИО: %s, ЗП: %d, Отдел: %d, id: %d", fullname, salary, department, id);
    }
}