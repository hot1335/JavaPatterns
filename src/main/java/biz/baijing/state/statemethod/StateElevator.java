package biz.baijing.state.statemethod;


/**
 * 状态模式 - 抽象类
 * @version 0.1
 * @author  BaiJing.biz
 */
public abstract class StateElevator {
    // 声明环境角色
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();

}
