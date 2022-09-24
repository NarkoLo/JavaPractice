package task7.dog;

public class Chihuahua extends Dog {
    public Chihuahua(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        System.out.println("Я перегрызу тебе глотку, а затем ******* в образовавшееся отверстие");
    }
}
