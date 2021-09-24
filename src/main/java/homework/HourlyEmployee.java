package homework;

public class HourlyEmployee extends Employee implements IPayable {

    private double hourlyRate;
    private double hoursWorked;


    public HourlyEmployee(String name, HireDate hireDate) {
        super(name, hireDate);

    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void pay() {
        System.out.println(this.hourlyRate * this.hoursWorked);
    }

    //@Override
    public void calcPay() {

    }
}
