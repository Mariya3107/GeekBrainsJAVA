package Animals;

public class Dog extends Animal{
    public static int id;

    public Dog(int run, double jump, int swim) {
        super(run, jump, swim);
    }
    public void run() {
        if (run <= 500) {
            System.out.println("Собака пробежала");
        } else {
            System.out.println("Собака не пробежала");
        }
    }
    public void jump() {
        if (jump <= 0.4) {
            System.out.println("Собака подпрыгнула");
        } else {
            System.out.println("Собака не подпрыгнула");
        }
    }
    public void swim() {
        if (swim <= 10) {
            System.out.println("Собака проплыла");
        } else {
            System.out.println("Собака не проплыла");
        }
    }

}
