package biz.baijing.memento.blackmethod;


/**
 * 备忘录模式 - 发起人 ： 游戏角色类
 * @version 0.1
 * @author  BaiJing.biz
 */
public class GameRole {

    private int lifeValue;
    private int actionValue;
    private int defenseValue;


    // 初始数据
    public void initRole() {
        lifeValue = 100;
        actionValue = 100;
        defenseValue = 100;
    }

    // 战斗数据
    public void fighting() {
        lifeValue = 0;
        actionValue = 0;
        defenseValue = 0;
    }

    // 保存角色状态
    public Memento saveParameter(){
        return new RoleParameterMemento(lifeValue, actionValue, defenseValue);
    }

    // 恢复角色状态
    public void recoverParameter(Memento memento){
        RoleParameterMemento  roleParameterMemento = (RoleParameterMemento) memento;
        // 备忘录存储的参数，赋值给当前参数
        this.lifeValue = roleParameterMemento.getLifeValue();
        this.actionValue = roleParameterMemento.getActionValue();
        this.defenseValue = roleParameterMemento.getDefenseValue();
    }

    // 参数打印
    public void parameterShow(){
        System.out.println("lifeValue = " + lifeValue);
        System.out.println("actionValue = " + actionValue);
        System.out.println("defenseValue = " + defenseValue);
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) {
        this.lifeValue = lifeValue;
    }

    public int getActionValue() {
        return actionValue;
    }

    public void setActionValue(int actionValue) {
        this.actionValue = actionValue;
    }

    public int getDefenseValue() {
        return defenseValue;
    }

    public void setDefenseValue(int defenseValue) {
        this.defenseValue = defenseValue;
    }


    // 成员内部类
    private class RoleParameterMemento implements Memento {
        private int lifeValue;
        private int actionValue;
        private int defenseValue;

        public RoleParameterMemento() {}

        public RoleParameterMemento(int lifeValue, int actionValue, int defenseValue) {
            this.lifeValue = lifeValue;
            this.actionValue = actionValue;
            this.defenseValue = defenseValue;
        }

        public int getLifeValue() {
            return lifeValue;
        }

        public void setLifeValue(int lifeValue) {
            this.lifeValue = lifeValue;
        }

        public int getActionValue() {
            return actionValue;
        }

        public void setActionValue(int actionValue) {
            this.actionValue = actionValue;
        }

        public int getDefenseValue() {
            return defenseValue;
        }

        public void setDefenseValue(int defenseValue) {
            this.defenseValue = defenseValue;
        }
    }
}
