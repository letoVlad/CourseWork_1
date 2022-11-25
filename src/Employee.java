public class Employee {
    private String employeeName;
    private int department;
    private double salary;
    private static int counter;
    private int id = counter;


    @Override
    public String toString() {
        return "Employee{" +
                "Имя сотрудника: ='" + employeeName + '\'' +
                ", Отдел: ='" + department + '\'' +
                ", Зарплата: =" + salary +
                ", id=" + id +
                '}';
    }

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
}
