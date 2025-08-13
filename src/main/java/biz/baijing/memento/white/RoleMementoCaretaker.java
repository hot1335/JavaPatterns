package biz.baijing.memento.white;

/**
 * 备忘录模式 - 备忘录负责人
 * @version 0.1
 * @author  BaiJing.biz
 */
public class RoleMementoCaretaker {

    // 能操作备忘录对象，操作备忘录的数据

    private RoleParameterMemento roleParameterMemento;

    public RoleParameterMemento getRoleParameterMemento() {
        return roleParameterMemento;
    }

    public void setRoleParameterMemento(RoleParameterMemento roleParameterMemento) {
        this.roleParameterMemento = roleParameterMemento;
    }
}
