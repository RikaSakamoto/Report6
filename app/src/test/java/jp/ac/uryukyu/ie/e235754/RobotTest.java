package jp.ac.uryukyu.ie.e235754;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RobotTest {
    /**
     * 体力が正しく減少することを検証。
     * 検証手順
     * (1)ロボットを準備。
     * (2)ロボットを起動させ、指定されたタスクを実行する。
     * (3)範囲内の番号ならば、それに相当した消費量分だけ減少していることを期待。これを検討する。
     */
    @Test
    void helpSomethingTest() {
        Robot demRobot = new Robot("testRobot", 20);
        demRobot.turnOn();
        demRobot.helpSomething(0);
        assertEquals(10, demRobot.getHp());

    /**
     * 体力が減少しないことを検証。
     * 検証手順
     * (1)ロボットを準備
     * (2)ロボットを起動させ、指定範囲外の番号を実行する。
     * (3)範囲外の番号ならば、タスクはできないはず。
     * 　　つまり、タスクを実行してもロボットのHPは減少していないことを期待。これを検証する。
     */
    Robot dummyRobot = new Robot("normalRobot", 30);
    dummyRobot.turnOn();
    dummyRobot.helpSomething(4);
    assertEquals(30, dummyRobot.getHp());
    }
}
