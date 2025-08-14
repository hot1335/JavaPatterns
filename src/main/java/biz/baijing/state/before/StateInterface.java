package biz.baijing.state.before;

/**
 * 状态模式 - 状态接口
 * @version 0.1
 * @author  BaiJing.biz
 */
public interface StateInterface {

    // 定义状态
    int OPENING_STATE = 1;
    int CLOSED_STATE = 0;

    int RUNNING_STATE = 2;
    int STOPPING_STATE = 3;

    void setState(Integer state);

    void open();
    void close();
    void run();
    void stop();

}
