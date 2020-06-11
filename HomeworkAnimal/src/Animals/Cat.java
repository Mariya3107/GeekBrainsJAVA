package Animals;

public class Cat extends Animal {
    public static int id;

    public Cat(int run, double jump, int swim) {
        super(run, jump, swim);
    }

    public void run() {
        if (run <= 200) {
            System.out.println("Кот пробежал");
        } else {
            System.out.println("Кот не пробежал");
        }
    }
    public void jump() {
        if (jump <= 2) {
            System.out.println("Кот подпрыгнул");
        } else {
            System.out.println("Кот не подпрыгнул");
        }
    }
    public void swim() {
        System.out.println("Кот не умеет плавать");
    }

}
