package homework;

import java.time.LocalDate;
import java.util.Date;

public class HireDate {

    public Integer month;
    public Integer day;
    public Integer year;

    public HireDate(Integer month, Integer day, Integer year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    @Override
    public String toString() {
        return  month + "/" + day + "/" + year;

    }


}
