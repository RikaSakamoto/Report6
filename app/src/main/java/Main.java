import jp.ac.uryukyu.ie.e235754.*;
/**
 * Mainクラス。
 */
public class Main {
    public static void main(String[] args) {
        Robot myRobot = new Robot("ゼロ", 100);
        myRobot.turnOn();
        myRobot.helpSomething(0);
        myRobot.helpSomething(1);
        myRobot.helpSomething(2);
        myRobot.helpSomething(4); //範囲外
        myRobot.helpSomething(3);
        Robot myRobot2 = new Robot("デス", 15);
        myRobot2.turnOn();
        myRobot2.helpSomething(2);
        myRobot.helpSomething(3); //体力が足りなくなった時
    }
}