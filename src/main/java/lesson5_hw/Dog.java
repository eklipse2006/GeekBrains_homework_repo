package lesson5_hw;

public class Dog extends Animal {

    private static int countDog;
    private int runLenght;

    Dog(String name, String color, int age) {
        super(name, color, age);
        this.runLenght = (int) ((Math.random() * 500) + 300);
        countDog++;
    }

    public static String getCount() {
        return "Собак всего: " + countDog + "; ";
    }

    @Override
    public void run(int lenght) {
        if (lenght < runLenght) {
            System.out.println(getName() + " пробежал " + lenght + " метров!");
        } else {
            System.out.println("Слишком далеко для " + getName());
        }
    }

    @Override
    public void swim(int lenght) {
        if (lenght < 10) {
            System.out.println(getName() + " проплыл " + lenght + " метров!");
        } else {
            System.out.println("Слишком далеко для " + getName());
        }
    }

    @Override
    public void jump(double height) {
        if (height < 0.4) {
            System.out.println(getName() + " прыгнул " + height + " метров!");
        } else {
            System.out.println("Слишком высоко для " + getName());
        }
    }
}
