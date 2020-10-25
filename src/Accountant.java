import java.util.List;

public class Accountant {
    List<Programmer> programmers;
    List<Manager> managers;

    public Accountant (List<Programmer> programmers, List<Manager> managers) {
        this.programmers = programmers;
        this.managers = managers;
    }

    public void issueSalary() {
        for (int i = 0; i < programmers.size(); i++) {
            programmers.get(i).setMoney();
            System.out.println("You will receive - " + programmers.get(i).getMoney());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < managers.size(); i++) {
            managers.get(i).setMoney();
            System.out.println("You will receive - " + managers.get(i).getMoney());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
