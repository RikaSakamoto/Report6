package jp.ac.uryukyu.ie.e235754;

import java.util.ArrayList;

/**
 * LivingThingクラス。
 * String name; //タスク名
 * int hp; //タスクに必要な消費量
 * ArrayList<String> tasks; //タスクのリスト
 */
public class LivingThing {
    private String name;
    private int hp;
    private ArrayList<String> tasks = new ArrayList<>();

    /**
     * LivingThingクラスのコンストラクタ。
     * @param name タスクの名前
     * @param hp タスクに必要な消費量
     */
    public LivingThing(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    /**
     * 名前を取得する。
     * @return 名前
     */
    public String getName() {
        return this.name;
    }
    /**
     * HPを取得する。
     * @return HP
     */
    public int getHp() {
        return this.hp;
    }
    /**
     * タスクのリストを取得する。
     * @return タスクのリスト
     */
    public ArrayList<String> getTasks() {
        return tasks;
    }
    /**
     * 起動しているかどうかの判定をする。
     * type; boolean
     * 起動していれば,true。停止していれば、false
     */
    public boolean isTurnedOn = false;
    
    /**
     * ロボットを起動し、名前と体力を表示する。
     * HPがあれば、起動できる。
     */
    public void turnOn() {
        if (getHp() > 0) {
            System.out.println(getName() + "が起動しました。");
            System.out.printf("%s:HP %d\n", getName(), getHp());
            isTurnedOn = true;
        } else {
            System.out.println("体力がないので、起動できません。");
        }
    }

    /**
     * ロボットを停止する。
     * HP0以下であれば、強制的に停止する。
     */
    public void turnOff() {
        if (getHp() <= 0) {
            System.out.println(getName() + "の体力はないので停止します。");
        } else {
            System.out.println(getName() + "は停止しました。");
        }
        isTurnedOn = false;
    }

    /**
     * タスクを実行するメソッド。
     * @param task 実行するタスク
     */
    public void performTask(LivingThing task) {
        if (isTurnedOn) {
            if (getHp() > 0 && getHp() >= task.getHp()) {
                System.out.println(getName() + "が" + task.getName() + "をしています。");
                //リストに要素を追加していく
                tasks.add(task.getName());    
            } else {
                System.out.println("消費量が体力を上回っているので、できません。");
                turnOff();
            }
        } else {
            System.out.println("起動させてください。");
        }
    }
}