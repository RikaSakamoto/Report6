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

    /**
     * 指定されたタスク番号に基づいて、ロボットにタスクを実行させる。
     * 実行されたタスクはHPを減少させる。
     * @param taskNumber タスクの番号
     */
    public void helpSomething(int taskNumber) {
        LivingThing task = null;
        switch (taskNumber) {
            case 0:
                task = new LivingThing("部屋の掃除", 10);
                break;
            case 1:
                task = new LivingThing("服の洗濯", 10);
                break;
            case 2:
                task = new LivingThing("料理", 10);
                break;
            case 3:
                task = new LivingThing("修理", 10);
                break;        
            default:
                System.out.println("無効なタスク番号です。");
                break;
        }
        if (task != null) {
            performTask(task);
        }
    }
}