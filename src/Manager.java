public class Manager extends Employee {
    public Manager(String FIRST_NAME, String MIDDLE_NAME) {
        super(FIRST_NAME, MIDDLE_NAME, 70000);
    }

    public void setMoney() {
        if (getPercentOfWorkHours() > 100) {
            this.setMoney(getRate());
        } else {
            this.getSalary();
        }
    }
}
