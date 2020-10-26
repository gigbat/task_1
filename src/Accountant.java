import java.util.List;
import java.util.Scanner;

public class Accountant {
    List<Programmer> programmers;
    List<Manager> managers;
    Scanner scanner;

    public Accountant (List<Programmer> programmers, List<Manager> managers) {
        this.programmers = programmers;
        this.managers = managers;
        this.scanner = new Scanner(System.in);
    }

    public void issueSalary() {
        System.out.println("Enter month, begin, for issue salary. Format: DD/MM/YY.");
        String startDate = scanner.nextLine();
        System.out.println("Enter month, last, for issue salary. Format: DD/MM/YY.");
        String endDate = scanner.nextLine();

        for (int i = 0; i < programmers.size(); i++) {
            programmers.get(i).setStartDate(startDate);
            programmers.get(i).setEndDate(endDate);

            programmers.get(i).setMoney();
            System.out.println(programmers.get(i).FIRST_NAME + " " + programmers.get(i).MIDDLE_NAME
                    + " will receive - " + programmers.get(i).getMoney());

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < managers.size(); i++) {
            managers.get(i).setStartDate(startDate);
            managers.get(i).setEndDate(endDate);

            managers.get(i).setMoney();
            System.out.println(managers.get(i).FIRST_NAME + " " + managers.get(i).MIDDLE_NAME
                    + " will receive - " + managers.get(i).getMoney());

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
