public class Main {

    public static void main(String[] args) {
        EmployeeBook HR = new EmployeeBook();
        HR.addEmployee("vera", 2, 2000);
        HR.addEmployee("max", 2, 3000);
        HR.addEmployee("vlad", 1, 3000);
        HR.addEmployee("dima", 1, 2000);
        HR.info();
    }
}