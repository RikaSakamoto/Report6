import jp.ac.uryukyu.ie.e235754.*;

public class Main {
    public static void main(String[] args) {
        Robot myRobot = new Robot("ゼロ", 100);
        myRobot.turnOn();
        myRobot.helpSomething(0);
        myRobot.helpSomething(4); //範囲外
        myRobot.turnOff();
        Robot myRobot2 = new Robot("デス", 0); //体力がない時
        myRobot2.turnOn();
    }
}