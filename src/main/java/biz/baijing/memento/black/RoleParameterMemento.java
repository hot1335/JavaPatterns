package biz.baijing.memento.black;

/**
 * 备忘录模式 - 备忘录
 * @version 0.1
 * @author  BaiJing.biz
 */
public class RoleParameterMemento {

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

    public int getDefenseValue() {
        return defenseValue;
    }

    public void setDefenseValue(int defenseValue) {
        this.defenseValue = defenseValue;
    }

    public int getActionValue() {
        return actionValue;
    }

    public void setActionValue(int actionValue) {
        this.actionValue = actionValue;
    }
}
