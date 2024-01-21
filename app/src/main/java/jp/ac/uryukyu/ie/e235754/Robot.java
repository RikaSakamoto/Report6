package jp.ac.uryukyu.ie.e235754;

/**
 * ロボットクラス。
 * String name; //ロボットの名前
 * int hp; //ロボットの体力
 */
public class Robot extends LivingThing {
    
     /**
     * Robotクラスのコンストラクタ。
     *
     * @param name ロボットの名前
     * @param hp ロボットの体力（HP）
     */
    public Robot(String name, int hp) {
        super(name, hp);
    }
}