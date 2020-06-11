package lesson5_hw;

public abstract class Animal {
    private String name;
    private String color;
    private int age;

    private static int countAnimal;

    Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        countAnimal++;
    }

    public abstract void run(int lenght);

    public abstract void swim(int lenght);

    public abstract void jump(double height);

    public String getName() {
        return name;
    }

    public static String countInfo() {
        return "Животных всего: " + countAnimal + "; " + Dog.getCount() + Cat.getCount();
    }
}
