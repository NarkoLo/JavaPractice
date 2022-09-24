package task3;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human("AH-64D", 12, 10, 5165,
                Human.Gender.AttackHelicopter, new Human.Head(), new Human.Leg(), new Human.Hand());
        human.getHead().setEyesColor("Green");
        human.getHead().setHairColor("Blue");
        human.getHead().setHaveIroquois(true);
        human.getLeg().setLength(Human.Size.huge);
        human.getHand().setSize(Human.Size.small);
        human.getHand().setHaveHair(true);
        human.talk();
        System.out.println(human.toString());
    }
}
