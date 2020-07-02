package Employee;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Melnikov Andrey", "Director", "melnikov@gmail.com",
                "89999999999", "100000", "36");
        employees[1] = new Employee("Sergeev Alexey", "Accountant", "sergeev1991@yandex.ru",
                "89877777777", "46000", "29");
        employees[2] = new Employee("Chernikov Anton", "Chief Engineer", "a.chernikov87@yandex.ru",
                "89373333333", "63000", "33");
        employees[3] = new Employee("Korchagin Boris", "Engineer", "boris.boris@mail.ru",
                "89636666666", "53000", "29");
        employees[4] = new Employee("Sverchkov Kirill", "Engineer", "kirkirill@yandex.ru",
                "89272222222", "50000", "26");
    }
}
