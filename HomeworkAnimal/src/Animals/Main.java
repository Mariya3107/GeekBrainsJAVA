package Animals;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat(137, 3.4, 9);
        Dog dog = new Dog( 364, 2, 9);
        Horse horse = new Horse( 800, 4, 80);
        Bird bird = new Bird(5, 0.1, 8);

        cat.run();
        dog.swim();
        dog.jump();
        horse.swim();
        horse.jump();
        bird.swim();
    }
}
