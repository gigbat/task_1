public class Programmer extends Employee {
    public Programmer(String FIRST_NAME, String MIDDLE_NAME) {
        super(FIRST_NAME, MIDDLE_NAME, 100000);
    }

    public void setMoney() {
        this.getSalary();
    }
}
