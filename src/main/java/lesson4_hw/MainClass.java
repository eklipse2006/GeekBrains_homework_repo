package lesson4_hw;

public class MainClass {
    public static void main(String[] args) {

    Person [] persArray = new Person[5];

    persArray [0] = new Person("Иванов Иван Иваныч", "Слесарь", "ivanych@mail.ru", "+79112554466", 15000, 40);
    persArray [1] = new Person("Петров Петр Петрович", "Маляр", "petrov@mail.ru", "+79112554423", 20000, 30);
    persArray [2] = new Person("Сидоров Сидр Сидорович", "Трубочист", "sidorov@mail.ru", "+79112554414", 18000, 52);
    persArray [3] = new Person("Михайлов Михаил Михайлович", "Кочегар", "mihailov@mail.ru", "+79112554478", 30000, 45);
    persArray [4] = new Person("Семенов Семен Семеныч", "Сварщик", "semenov@mail.ru", "+791125544656", 25000, 27);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                persArray[i].info();
            }
        }
    }
}
