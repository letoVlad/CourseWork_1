public class EmployeeBook {
    private final Employee[] employee = new Employee[10];
    private int size;

    //Добавить сотрудника
    public void addEmployee(String name, int department, int salary) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                Employee newEmployee = new Employee(name, department, salary);
                employee[size++] = newEmployee;
                break;
            }
        }
    }

    //Удалить сотрудника
    public void removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employee[i].getId() == id) {
                employee[i] = null;
                if (i != employee.length - 1) {
                    System.arraycopy(employee, i + 1, employee, i, size - i);
                }
                size--;
                System.out.println("Сотрудник с id " + id + " был уволен");
                return;
            }
        }
    }

    //Изменить сотруднику ЗП
    public void changeSalary(String employeeName, double salary) {
        for (int i = 0; i < size; i++) {
            if (employee[i].getEmployeeName().equals(employeeName)) {
                employee[i].setSalary(salary);
            }
        }
    }

    //Изменить сотруднику отдел
    public void changeDepartment(String employeeName, int department) {
        for (int i = 0; i < size; i++) {
            if (employee[i].getEmployeeName().equals(employeeName)) {
                employee[i].setDepartment(department);
            }
        }
    }

    //Получить всех сотрудников в отделе
    public void infoDepartment(int department) {
        for (int i = 0; i < size; i++) {
            if (employee[i].getDepartment() == department) {
                System.out.println(employee[i]);
            }
        }
    }

    //Cписок всех сотрудников со всеми данными
    public void info() {
        for (int i = 0; i < size; i++) {
            System.out.println(employee[i].toString());
        }
    }

    //Общая сумма затрат на зарплаты в месяц
    public double sumSalary() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += employee[i].getSalary();
        }
        return sum;
    }

    //Cотрудник с минимальной зарплатой
    public void employeeMinSalary() {
        double employeeMinSalary = Double.MAX_VALUE;
        String employeeMinSalaryName = null;
        for (int i = 0; i < size; i++) {
            if (employee[i].getSalary() < employeeMinSalary) {
                employeeMinSalary = employee[i].getSalary();
                employeeMinSalaryName = employee[i].getEmployeeName();
            }
        }
        System.out.println("сотрудник с минимальной зарплатой - " + employeeMinSalaryName);
    }

    //Cотрудник с максимальной зарплатой
    public void employeeMaxSalary() {
        double employeeMaxSalary = Double.MIN_VALUE;
        String employeeMaxSalaryName = null;
        for (int i = 0; i < size; i++) {
            if (employee[i].getSalary() > employeeMaxSalary) {
                employeeMaxSalary = employee[i].getSalary();
                employeeMaxSalaryName = employee[i].getEmployeeName();
            }
        }
        System.out.println("сотрудник с максимальной зарплатой - " + employeeMaxSalaryName);
    }

    //Средняя зарплата сотрудников
    public void sumSalaryAverage() {
        System.out.println("Средняя зарплата сотрудников - " + sumSalary() / employee[0].getCounter());
    }

    //Получить Ф. И. О. всех сотрудников
    public void nameEmployee() {
        System.out.print("Ф. И. О. всех сотрудников - ");
        for (int i = 0; i < size; i++) {
            System.out.print(employee[i].getEmployeeName() + " ");
        }
        System.out.println();
    }

    //Повышенная сложность
    //Индексация зарплаты
    public void indexingSalary(int indexing) {
        for (int i = 0; i < size; i++) {
            employee[i].setSalary(employee[i].getSalary() + ((employee[i].getSalary() * indexing) / 100));
        }
    }

    //Сотрудник с минимальной зарплатой в отделе
    public void employeeMinSalaryDepartment(int department) {
        String employeeMinSalaryName = null;
        double employeeMinSalary = Double.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if (employee[i].getDepartment() == department && employee[i].getSalary() < employeeMinSalary) {
                employeeMinSalary = employee[i].getSalary();
                employeeMinSalaryName = employee[i].getEmployeeName();
            }
        }
        System.out.println("сотрудник с минимальной зарплатой в отделе - " + employeeMinSalaryName);
    }

    //Cотрудник с максимальной зарплатой в отделе
    public void employeeMaxSalaryDepartment(int department) {
        String employeeMaxSalaryName = null;
        double employeeMinSalary = Double.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (employee[i].getDepartment() == department && employee[i].getSalary() > employeeMinSalary) {
                employeeMinSalary = employee[i].getSalary();
                employeeMaxSalaryName = employee[i].getEmployeeName();
            }
        }
        System.out.println("сотрудник с максимальной зарплатой в отделе - " + employeeMaxSalaryName);
    }

    //Сумму затрат на зарплату по отделу.
    public double sumSalaryDepartment(int department) {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            if (employee[i].getDepartment() == department) {
                sum += employee[i].getSalary();
            }
        }
        return sum;
    }

    //Средняя зарплата сотрудников в отделе
    public void sumSalaryAverageDepartment(int department) {
        int employeeLength = 0;
        double sumAverageDepartment = 0;
        for (int i = 0; i < size; i++) {
            if (employee[i].getDepartment() == department) {
                employeeLength++;
                sumAverageDepartment += employee[i].getSalary();
            }
        }
        System.out.println(Math.round(sumAverageDepartment / employeeLength));
    }

    //Индексация зарплаты отдела
    public void indexingSalaryDepartment(int indexing, int department) {
        for (int i = 0; i < size; i++) {
            if (employee[i].getDepartment() == department) {
                employee[i].setSalary(employee[i].getSalary() + ((employee[i].getSalary() * indexing) / 100));
            }
        }
    }

    //Вывод списка всех сотрудников отдела без Отдела
    public void infoDepartmentAll(int department) {
        for (int i = 0; i < size; i++) {
            if (employee[i].getDepartment() == department) {
                int indexStart = employee[i].toString().indexOf("От");
                int indexFinish = employee[i].toString().indexOf("З", indexStart);
                String first = employee[i].toString().substring(0, indexStart);
                String last = employee[i].toString().substring(indexFinish);
                System.out.println(first + last);
            }
        }
    }

    //Все сотрудники с зарплатой меньше числа
    public void lessSalaryNumber(int number) {
        System.out.println("Сотрудники с запралтой меньше чем " + number);
        for (int i = 0; i < size; i++) {
            if (employee[i].getSalary() < number) {
                System.out.println(employee[i].toString());
            }
        }
    }

    //Все сотрудники с зарплатой больше числа
    public void moreSalaryNumber(int number) {
        System.out.println("Сотрудники с запралтой больше чем " + number);
        for (int i = 0; i < size; i++) {
            if (employee[i].getSalary() > number) {
                System.out.println(employee[i].toString());
            }
        }
    }
}