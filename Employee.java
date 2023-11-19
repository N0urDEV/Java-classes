public class Employee {
    private double baseSalary;
    private int bonusHours;
    private double sales;
    private String name;

    public Employee(double baseSalary, int bonusHours, double sales, String name) {
        this.baseSalary = baseSalary;
        this.bonusHours = bonusHours;
        this.sales = sales;
        this.name = name;
    }

    public double calculateNetSalary() {
        double bonusAmount = bonusHours * 10;
        double commission = 0.05 * sales;
        double netSalary = baseSalary + bonusAmount + commission;
        return netSalary;
    }
}
