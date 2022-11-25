public class Main {
    //Cписок всех сотрудников со всеми данными
    public static void info(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].toString());
        }
    }

    //Общая сумма затрат на зарплаты в месяц
    public static double sumSalary(Employee[] employee) {
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum += employee[i].getSalary();
        }
        return sum;
    }

    //Cотрудник с минимальной зарплатой
    public static void employeeMinSalary(Employee[] employee) {
        double employeeMinSalary = employee[0].getSalary();
        String employeeMinSalaryName = null;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < employeeMinSalary) {
                employeeMinSalary = employee[i].getSalary();
                employeeMinSalaryName = employee[i].getEmployeeName();
            }
        }
        System.out.println("сотрудник с минимальной зарплатой - " + employeeMinSalaryName);
    }

    //Cотрудник с максимальной зарплатой
    public static void employeeMaxSalary(Employee[] employee) {
        double employeeMaxSalary = 0;
        String employeeMaxSalaryName = null;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() > employeeMaxSalary) {
                employeeMaxSalary = employee[i].getSalary();
                employeeMaxSalaryName = employee[i].getEmployeeName();
            }
        }
        System.out.println("сотрудник с максимальной зарплатой - " + employeeMaxSalaryName);
    }

    //Средняя зарплата сотрудников
    public static void sumSalaryAverage(Employee[] employee) {
        System.out.println("Средняя зарплата сотрудников - " + sumSalary(employee) / employee[0].getCounter());
    }

    //Получить Ф. И. О. всех сотрудников
    public static void nameEmployee(Employee[] employee) {
        System.out.print("Ф. И. О. всех сотрудников - ");
        for (int i = 0; i < employee.length; i++) {
            System.out.print(employee[i].getEmployeeName() + " ");
        }
        System.out.println();
    }

    //Повышенная сложность
    //Индексация зарплаты
    public static void indexingSalary(Employee[] employee, int indexing) {
        for (int i = 0; i < employee.length; i++) {
            employee[i].setSalary(employee[i].getSalary() + ((employee[i].getSalary() * indexing) / 100));
        }
    }

    //Сотрудник с минимальной зарплатой

    public static void employeeMinSalaryDepartment(Employee[] employee, int department) {

        System.out.println("сотрудник с минимальной зарплатой - " + employeeMinSalaryName);
    }

    public static void main(String[] args) {
        Employee one = new Employee("Karl", 1, 2000);
        Employee one1 = new Employee("Vera", 1, 1000);
        Employee one2 = new Employee("Mark", 2, 3000);
        Employee one3 = new Employee("Max", 2, 4000);
        Employee[] employees = new Employee[4];
        employees[0] = one;
        employees[1] = one1;
        employees[2] = one2;
        employees[3] = one3;
        info(employees);
        System.out.println("Общая сумма затрат на зарплаты в месяц - " + sumSalary(employees));
        employeeMinSalary(employees);
        employeeMaxSalary(employees);
        sumSalaryAverage(employees);
        nameEmployee(employees);
        indexingSalary(employees, 20);
    }
}