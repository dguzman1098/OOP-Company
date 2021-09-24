package homework;

public class Entrepreneur extends Person implements IPayable {

    public Double rate;

    public Entrepreneur(String name) {
        super(name);
    }

    //@Override
    public void calcPay() {
    }

    @Override
    public void pay() {
        System.out.println(rate);
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }
}
