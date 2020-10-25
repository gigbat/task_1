import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Employee {
    public final String FIRST_NAME;
    public final String MIDDLE_NAME;
    private final int RATE;

    private int id;
    private int hours;
    private int money;

    public Employee(String FIRST_NAME, String MIDDLE_NAME, int RATE) {
        this.FIRST_NAME = FIRST_NAME;
        this.MIDDLE_NAME = MIDDLE_NAME;
        this.RATE = RATE;
    }

    public void workHour() {
        hours++;
    }

    public int getPercentOfWorkHours() {
        float hoursPerDay = 40.0f / 7.0f;
        float hoursPerMonth;
        int daysOfMonth;

        Date date = new Date();
        SimpleDateFormat simpleDateFormatMonth = new SimpleDateFormat("yyyy-MM-dd");
        String[] arrOfDate = simpleDateFormatMonth.format(date).split("-");
        Calendar calendar = new GregorianCalendar(Integer.parseInt(arrOfDate[0]), Integer.parseInt(arrOfDate[1]) - 1,
                Integer.parseInt(arrOfDate[2]));


        daysOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        hoursPerMonth = daysOfMonth * hoursPerDay;
        int percent = (int) (getHours() * 100 / hoursPerMonth);

        return percent;
    }

    public void getSalary() {
        this.money = RATE * getPercentOfWorkHours() / 100;
    }

    public int getId() {
        return id;
    }

    public int getHours() {
        return hours;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getRate() {
        return RATE;
    }
}
