import java.util.Objects;

public class Employee {
    private String employeeName;
    private int department;
    private double salary;
    private static int counter;
    private int id = counter;

    public int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }


    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String employeeName, int department, double salary) {
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
        counter++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && Double.compare(employee.salary, salary) == 0 && id == employee.id && Objects.equals(employeeName, employee.employeeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeName, department, salary, id);
    }

    @Override
    public String toString() {
        return
                "Имя сотрудника: ='" + employeeName + '\'' +
                        ", Отдел: ='" + department + '\'' +
                        ", Зарплата: =" + salary +
                        ", id=" + id
                ;
    }
}