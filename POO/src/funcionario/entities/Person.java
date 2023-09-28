package funcionario.entities;

public class Person {
    public String name;
    public double grossSalary;
    public double tax;
    private double salary;

    public double netSalary() {
        return this.salary = grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        this.salary += percentage;
    }

    public String toString() {
        return name + ", $ " + salary;
    }
}
