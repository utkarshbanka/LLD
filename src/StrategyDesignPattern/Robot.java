package StrategyDesignPattern;

public class Robot implements Projection {

    private Flyable flyable;
    private Talkable talkable;
    private Walkable walkable;

    public Robot(Flyable flyable, Talkable talkable, Walkable walkable) {
        this.flyable = flyable;
        this.talkable = talkable;
        this.walkable = walkable;
    }





    @Override
    public void projection() {
        flyable.fly();
        talkable.talk();
        walkable.walk();
    }


    public static void main(String[] args) {

        Flyable fly = new NormalFly();
        Talkable talk = new NormalTalk();
        Walkable walk = new NormalWalk();

        Robot robot = new Robot(fly, talk, walk);
        robot.projection();

    }
}
