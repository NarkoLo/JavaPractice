package task2;

public class DogKennel {
    public static void main(String[] args) {
        Dog dog = new Dog("Шани", 3);


        System.out.println( dog.getAge());
        System.out.println(dog.getName());
        System.out.println(dog.toString());
        System.out.printf("Возраст в человеческих годах: %s%n",dog.toHumanAge());
    }
}
