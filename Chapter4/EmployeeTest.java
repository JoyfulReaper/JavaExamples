public class EmployeeTest {
    public static void main(String[] args)
    {
        Employee employee = new Employee("Some Dude", 100000, 2012, 5, 21);
        System.out.println("Name: " + employee.getName() + " Salary: " + employee.getSalary() + " Hire date: " + employee.getHireDate());
        employee.raiseSalary(6);
        System.out.printf("Name: %s Salary: %.2f Hire date: %s", employee.getName(), employee.getSalary(), employee.getHireDate());
    }
}