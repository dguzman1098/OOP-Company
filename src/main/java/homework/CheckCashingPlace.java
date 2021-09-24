package homework;

import java.util.ArrayList;

abstract class CheckCashingPlace implements IPayable {

    public static void main(String[] args) {

        Employee[] employees = new Employee[2];
        HireDate hireDate = new HireDate(9, 20, 1998);

        HourlyEmployee h_employee = new HourlyEmployee("Superman", hireDate);
        employees[0] = h_employee;
        h_employee.setHourlyRate(25.00); //hourly rate
        h_employee.setHoursWorked(35.00); //hours worked

        SalariedEmployee s_employee = new SalariedEmployee("Ironman", hireDate);
        employees[1] = s_employee;
        s_employee.setSalary(55000.00);

        HumanResources.issueBadge(employees);
        Entrepreneur entrepreneur = new Entrepreneur("Batman");
        entrepreneur.setRate(98000.00);

        IPayable[] payablePeople = {h_employee, s_employee, entrepreneur};
        //HumanResources.payPerson(payablePeople); //returns pay of payable Person
        HumanResources.printPaymentInfo(entrepreneur); //prints payment info of a Person

        Person[] persons = {h_employee, s_employee, entrepreneur};
        HumanResources.payPerson(persons);
//        HumanResources.printPaymentInfo(payablePeople[0]);


    }




}
