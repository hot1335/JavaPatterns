package biz.baijing.state.statemethod;

/**
 * 状态模式 - 环境类
 * @version 0.1
 * @author  BaiJing.biz
 */
public class Context {

    // 和状态对象对应的常量
    public final static Open OPEN_STATE = new Open();
    public final static Run RUN_STATE = new Run();
    public final static Stop STOP_STATE = new Stop();
    public final static Close CLOSE_STATE = new Close();

    // 当前「状态」变量
    private StateElevator stateElevator;

    public StateElevator getStateElevator() {
        return stateElevator;
    }

    public void setStateElevator(StateElevator stateElevator) {
        this.stateElevator = stateElevator;
        // 设置 Context
        this.stateElevator.setContext(this);
    }

    public void open(){
        this.stateElevator.open();
    }

    public void close(){
        this.stateElevator.close();
    }

    public void run(){
        this.stateElevator.run();
    }

    public void stop(){
        this.stateElevator.stop();
    }

}
