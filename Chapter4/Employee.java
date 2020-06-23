import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {
    private String name;
    private BigDecimal salary;
    private LocalDate hireDate;

    public Employee(String name, double salary, int year, int month, int day) 
    {
        this (name, new BigDecimal(salary), year, month, day);
    }

    public Employee(String name, BigDecimal salary, int year, int month, int day) 
    {
        this.name = name;
        this.salary = salary;
        this.hireDate = LocalDate.of(year, month, day);
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary.doubleValue();
    }

    public LocalDate getHireDate()
    {
        return hireDate;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary.doubleValue() * byPercent / 100;
        salary = salary.add(BigDecimal.valueOf(raise));
    }
}