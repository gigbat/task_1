import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Vasya", "Pupkin");
        Programmer programmer2 = new Programmer("Sanya", "Belui");
        Programmer programmer3 = new Programmer("Petya", "Petrov");

        Manager manager = new Manager("Olya", "Olcheous");
        Manager manager2 = new Manager("Irina", "Irius");
        Manager manager3 = new Manager("Valya", "Vira");

        Accountant accountant = new Accountant(Arrays.asList(programmer, programmer2, programmer3),
                Arrays.asList(manager, manager2, manager3));

        accountant.issueSalary();
    }
}
