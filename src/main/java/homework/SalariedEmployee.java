package homework;

public class SalariedEmployee extends Employee implements IPayable {

    private double salary;

    public SalariedEmployee(String name, HireDate hireDate) {
        super(name, hireDate);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



    @Override
    public void pay() {
        System.out.println(this.salary);
    }

    //@Override
    public void calcPay() {

    }
}
