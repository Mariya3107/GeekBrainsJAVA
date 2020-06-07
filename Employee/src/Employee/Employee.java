package Employee;

public class Employee {

    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private String salary;
    private String age;

    Employee() {
    }

    public String getName() {
        return this.name;
    }

    public String getPosition() {
        return this.position;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getSalary() {
        return this.salary;
    }

    public String getAge() {
        return this.age;
    }

    Employee(String name, String position, String email, String phoneNumber, String salary, String age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
        System.out.println(name + ", age " + age + ", works " + position + " for " + salary + " rubles. Phonenumber is " +
                phoneNumber + ", email is " + email);
    }


}
