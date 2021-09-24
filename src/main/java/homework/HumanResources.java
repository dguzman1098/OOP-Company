package homework;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class HumanResources  {


//    public static void payPerson(IPayable[] payablePeople){
//        for (IPayable x : payablePeople){
//            System.out.print("Payable amount of: $" );
//            x.pay();
//        }
//    }

    //prints each employee in employees: badge Name, Type of employee, Hire date
    public static void issueBadge(Employee[] Employees){
        for (Employee employee : Employees){
            System.out.println("Name: " + employee.getName());
            System.out.println("Type of Employee: " + employee.getClass().getSimpleName());
            System.out.println("Hire Date: " + employee.getHireDate());
            System.out.println("-----------------------");
        }
    }

    //print out their payment information
    public static void printPaymentInfo(Person payable){
        if (payable instanceof Employee || payable instanceof Entrepreneur){
            System.out.print(payable.getName() + " \nAmount Paid: $");
            payable.pay();

        }

    }

    //print their payment information
    public static void payPerson(Person[] payable){
        for (Person person : payable){
            System.out.println("------------------");
            System.out.println("Name: " + person.getName());
            System.out.print("Payment amount: $");
            person.pay();
            if (person instanceof HourlyEmployee){
                System.out.print("Hourly Rate: $");
                System.out.println(((HourlyEmployee) person).getHourlyRate());
                System.out.print("Hours Worked: ");
                System.out.println(((HourlyEmployee) person).getHoursWorked());

            }
        }


    }

}
