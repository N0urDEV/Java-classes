public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(50000, 5, 100000, "John Doe");
        double netSalary = employee.calculateNetSalary();
        System.out.println("Net Salary: $" + netSalary);
    }
}
