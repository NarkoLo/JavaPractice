package task3;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Human {
    private String name;
    private int age;
    private double weight;
    private double height;
    private Gender gender;
    private Head head;
    private Leg leg;
    private Hand hand;
    public Human(){
        head = new Head();
        leg = new Leg();
        hand = new Hand();
    }
    public void talk(){
        if(gender == Gender.AttackHelicopter){
            System.out.println("Hahaha, helicopter go wrrrr");
            return;
        }
        System.out.println("Hello, my name " + name + " and I'm " + gender.name());
    }
    public boolean itsPunk(){
        return head.haveIroquois;
    }
    @Data
    public static class Head{
        private String hairColor;
        private String eyesColor;
        private boolean haveIroquois;
    }
    @Data
    public static class Leg{
        private Size length;
    }
    @Data
    public static class Hand{
       private boolean haveHair;
       private Size size;

    }
    enum Gender{
        Male,
        Female,
        AttackHelicopter
    }
    enum Size{
        small,
        big,
        huge,
        normal
    }

}
