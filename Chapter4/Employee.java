import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Employee {
    private final String name;
    private BigDecimal salary;
    private final LocalDate hireDate;

    public Employee(final String name, final double salary, final int year, final int month, final int day) {
        this(name, new BigDecimal(salary), year, month, day);
    }

    public Employee(final String name, final BigDecimal salary, final int year, final int month, final int day) {
        Objects.requireNonNull(name, "name cannot be null");
        Objects.requireNonNull(salary, "salary cannot be null");
        //Object.requireNonNullElse(name, "DefaultName");
        
        this.name = name;
        this.salary = salary;
        this.hireDate = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary.doubleValue();
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void raiseSalary(final double byPercent) {
        final double raise = salary.doubleValue() * byPercent / 100;
        salary = salary.add(BigDecimal.valueOf(raise));
    }
}