package lesson5_hw;

public class MainClass {
    public static void main(String[] args) {

        Animal dog = new Dog("Полкан", "Черный", 3);
        Animal dog2 = new Dog("Лайка", "Коричневый", 5);
        Animal dog3 = new Dog("Мухтар", "Коричневый", 2);
        Animal cat = new Cat("Борис", "Рыжий", 5);
        Animal horse = new Horse("Сивка", "Серый", 7);
        Animal bird = new Bird("Каркуша", "Белый", 4);

        horse.swim(10);

        dog.run(150);
        dog2.run(500);
        dog3.run(1000);

        System.out.println(Animal.countInfo());


    }
}
