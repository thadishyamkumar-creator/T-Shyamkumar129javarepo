import java.util.Scanner;
class Employee
{
    String name;

    Employee(String name)
    {
        this.name = name;
    }
    void salaryDetails()
    {
        System.out.println("Employee: " + name);
    }
}

class RegularEmployee extends Employee
{
    double basicSalary;
    double allowance;

    RegularEmployee(String name, double basicSalary, double allowance)
    {
        super(name);
        this.basicSalary = basicSalary;
        this.allowance = allowance;
    }
    void salaryDetails()
    {
        double salary = basicSalary + allowance;

        System.out.println("Regular Employee Salary Details");
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Allowance: " + allowance);
        System.out.println("Monthly Salary: " + salary);
    }
}
class ContractEmployee extends Employee
{
    int hours;
    double ratePerHour;

    ContractEmployee(String name, int hours, double ratePerHour)
    {
        super(name);
        this.hours = hours;
        this.ratePerHour = ratePerHour;
    }

    @Override
    void salaryDetails()
    {
        double salary = hours * ratePerHour;

        System.out.println("Contract Employee Salary Details");
        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Rate Per Hour: " + ratePerHour);
        System.out.println("Monthly Salary: " + salary);
    }
}

class Vendor extends Employee
{
    double payment;

    Vendor(String name, double payment)
    {
        super(name);
        this.payment = payment;
    }

    @Override
    void salaryDetails()
    {
        System.out.println("Vendor Salary Details");
        System.out.println("Vendor Name: " + name);
        System.out.println("Monthly Payment: " + payment);
    }
}

class EmployeeSalary
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee type: ");
        String type = sc.nextLine();

        Employee emp;

        if (type.equalsIgnoreCase("Regular Employee"))
        {
            System.out.print("Enter employee name: ");
            String name = sc.nextLine();

            System.out.print("Enter basic salary: ");
            double basic = sc.nextDouble();

            System.out.print("Enter allowance: ");
            double allowance = sc.nextDouble();

            emp = new RegularEmployee(name, basic, allowance);
            emp.salaryDetails();
        }
        else if (type.equalsIgnoreCase("Contract Employee"))
        {
            System.out.print("Enter employee name: ");
            String name = sc.nextLine();

            System.out.print("Enter hours worked: ");
            int hours = sc.nextInt();

            System.out.print("Enter rate per hour: ");
            double rate = sc.nextDouble();

            emp = new ContractEmployee(name, hours, rate);
            emp.salaryDetails();
        }
        else if (type.equalsIgnoreCase("Vendor"))
        {
            System.out.print("Enter vendor name: ");
            String name = sc.nextLine();

            System.out.print("Enter monthly payment: ");
            double payment = sc.nextDouble();

            emp = new Vendor(name, payment);
            emp.salaryDetails();
        }
        else
        {
            System.out.println("Invalid employee type");
        }
    }
}