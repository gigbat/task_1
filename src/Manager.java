public class Manager extends Employee {
    public Manager(String FIRST_NAME, String MIDDLE_NAME) {
        super(FIRST_NAME, MIDDLE_NAME, 70000);
    }

    public void setMoney() {
        if (this.getRate() > this.RATE) {
            this.setMoney(RATE);
        } else {
            this.getSalary(this);
        }
    }
}
