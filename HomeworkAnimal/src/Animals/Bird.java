package Animals;
public class Bird extends Animal{
    public static int id;

    public Bird(int run, double jump, int swim) {
        super(run, jump, swim);
    }
    public void run() {
        if (run <= 5) {
            System.out.println("Птица пробежала");
        } else {
            System.out.println("Птица не пробежала");
        }
    }
    public void jump() {
        if (jump <= 0.1) {
            System.out.println("Птица подпрыгнула");
        } else {
            System.out.println("Птица не подпрыгнула");
        }
    }
    public void swim() {
        System.out.println("Птица не умеет плавать");
    }

}