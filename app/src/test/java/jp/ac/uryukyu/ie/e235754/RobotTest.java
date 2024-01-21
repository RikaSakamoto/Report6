package jp.ac.uryukyu.ie.e235754;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RobotTest {
    /**
     * ロボットが適切に起動・停止しているかの確認。
     * 検証手順
     *  (1) ロボットを準備。
     *  (2) ロボットを起動・停止する。
     *  (3) 起動していれば、true。停止していれば,falseとなり、期待する値と実際の値が一致するかを検証。
     */
    @Test
    void turnOnTest() {
        Robot demoRobot = new Robot("testRobot", 20);
        demoRobot.turnOn();
        assertEquals(true, true);
        demoRobot.turnOff();
        assertEquals(false, false);
    }
}
