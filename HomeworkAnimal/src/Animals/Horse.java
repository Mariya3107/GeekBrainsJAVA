package Animals;

public class Horse extends Animal{
    public static int id;

    public Horse(int run, double jump, int swim) {
        super(run, jump, swim);
    }
    public void run() {
        if (run <= 1500) {
            System.out.println("Лошадь пробежала");
        } else {
            System.out.println("Лошадь не пробежала");
        }
    }
    public void jump() {
        if (jump <= 3) {
            System.out.println("Лошадь подпрыгнула");
        } else {
            System.out.println("Лошадь не подпрыгнула");
        }
    }
    public void swim() {
        if (swim <= 100) {
            System.out.println("Лошадь проплыла");
        } else {
            System.out.println("Лошадь не проплыла");
        }
    }

}
