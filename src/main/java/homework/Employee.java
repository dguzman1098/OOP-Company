package homework;

import java.time.LocalDate;
public abstract class Employee extends Person {

    public HireDate hireDate;

    public Employee(String name, HireDate hireDate) {
        super(name);
        this.hireDate = hireDate;
    }


    @Override
    public void pay() {
        System.out.println("Getting paid");
    }

    public HireDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(HireDate hireDate) {
        this.hireDate = hireDate;
    }
}
