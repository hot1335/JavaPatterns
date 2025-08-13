package biz.baijing.memento.blackmethod;

/**
 * 备忘录模式 - 备忘录负责人
 * @version 0.1
 * @author  BaiJing.biz
 */
public class RoleMementoCaretaker {

    // 能操作备忘录对象，操作备忘录的数据

    private  Memento memento;


    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
