import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public abstract class Employee {
    public final String FIRST_NAME;
    public final String MIDDLE_NAME;
    public final int RATE;

    private int id;
    private int money;
    float hoursPerWeek = 40.0f;

    private String startDateOfWork;
    private String endDateOfWork;

    private String startDate;
    private String endDate;

    Scanner in = new Scanner(new InputStreamReader(System.in));
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


    public Employee(String FIRST_NAME, String MIDDLE_NAME, int RATE) {
        this.FIRST_NAME = FIRST_NAME;
        this.MIDDLE_NAME = MIDDLE_NAME;
        this.RATE = RATE;

        System.out.println("Enter the starting date (DD/MM/YY) " + this.FIRST_NAME + " " + this.MIDDLE_NAME + ":");
        startDateOfWork = in.next();

        System.out.println("Enter the End date (DD/MM/YY) " + this.FIRST_NAME + " " + this.MIDDLE_NAME + ":");
        endDateOfWork = in.next();
    }

    public int getPercentOfWorkHours() {
        float hoursPerMonth = generalHours();
        float hoursPerMonthOfWork = generalHoursOfWork() + addHours();
        float percent = hoursPerMonthOfWork * 100 / hoursPerMonth;

        return (int) percent;
    }

    public float addHours() {
        System.out.println("Employee - " + FIRST_NAME + " " + MIDDLE_NAME + "\nHave you worked more hours. Please  enter this number bellow.\n" +
                "If you do not have additional hours enter 0");
        Scanner scanner = new Scanner(System.in);
        float addHours = Float.parseFloat(scanner.nextLine());
        return addHours;
    }

    private float generalHoursOfWork() {
        float hoursPerMonthOfWork = 0.0f;
        float workingDays = 0.0f;

        try {
            Calendar start = Calendar.getInstance();
            start.setTime(sdf.parse(startDateOfWork));
            Calendar end = Calendar.getInstance();
            end.setTime(sdf.parse(endDateOfWork));
            while (!start.after(end)) {
                int day = start.get(Calendar.DAY_OF_WEEK);

                day = day + 2;
                if (day > 7) {
                    day = day - 7;
                }

                if ((day != Calendar.SATURDAY) && (day != Calendar.SUNDAY))
                    workingDays += 1.0f;
                start.add(Calendar.DATE, 1);
            }

            workingDays /= 7;
        } catch (Exception e) {
            e.printStackTrace();
        }

        hoursPerMonthOfWork = workingDays * hoursPerWeek;

        return hoursPerMonthOfWork;
    }

    private float generalHours() {
        float hoursPerMonth = 0.0f;
        float workingDaysOfMont = 0.0f;

        try {
            Calendar start = Calendar.getInstance();
            start.setTime(sdf.parse(startDate));
            Calendar end = Calendar.getInstance();
            end.setTime(sdf.parse(endDate));
            while (!start.after(end)) {
                int day = start.get(Calendar.DAY_OF_WEEK);

                day = day + 2;
                if (day > 7) {
                    day = day - 7;
                }

                if ((day != Calendar.SATURDAY) && (day != Calendar.SUNDAY))
                    workingDaysOfMont += 1.0f;
                start.add(Calendar.DATE, 1);
            }

            workingDaysOfMont /= 7;
        } catch (Exception e) {
            e.printStackTrace();
        }

        hoursPerMonth = workingDaysOfMont * hoursPerWeek;

        return hoursPerMonth;
    }

    public void getSalary(Employee e) {
        int percent = getPercentOfWorkHours();

        if (e instanceof Manager) {
            if (percent > 100) {
                this.money = RATE;
            } else {
                this.money = RATE * percent / 100;
            }
        } else {
            this.money = RATE * percent / 100;
        }
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

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
