import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Vasya", "Pupkin");
        for (int i = 0; i < 100; i++) {
            programmer.workHour();
        }

        Programmer programmer2 = new Programmer("Sanya", "Belui");
        for (int i = 0; i < 160; i++) {
            programmer2.workHour();
        }

        Programmer programmer3 = new Programmer("Petya", "Petrov");
        for (int i = 0; i < 200; i++) {
            programmer3.workHour();
        }

        Manager manager = new Manager("Olya", "Olcheous");
        for (int i = 0; i < 20; i++) {
            manager.workHour();
        }

        Manager manager2 = new Manager("Irina", "Irius");
        for (int i = 0; i < 100; i++) {
            manager2.workHour();
        }

        Manager manager3 = new Manager("Valya", "Vira");
        for (int i = 0; i < 200; i++) {
            manager3.workHour();
        }

        Accountant accountant = new Accountant(Arrays.asList(programmer, programmer2, programmer3),
                Arrays.asList(manager, manager2, manager3));

        accountant.issueSalary();
    }
}
