package biz.baijing.state.statemachine;

/**
 * 状态模式 - 抽象类 : 开启状态类
 * @version 0.1
 * @author  BaiJing.biz
 */
public class Open extends StateElevator {

    @Override
    public void open() {
        System.out.println("OPEN 电梯开启.");
    }

    @Override
    public void close() {
        super.context.setStateElevator(Context.CLOSE_STATE);

        super.context.close();
    }

    @Override
    public void run() {
        // 开启，无法运行；无动作
    }

    @Override
    public void stop() {
        // 开门状态，本身就是停止的；无动作
    }
}
