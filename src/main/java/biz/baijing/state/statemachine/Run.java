package biz.baijing.state.statemachine;

/**
 * 状态模式 - 抽象类 : 运行状态类
 * @version 0.1
 * @author  BaiJing.biz
 */
public class Run extends StateElevator {

    @Override
    public void open() {
        // 无动作
    }

    @Override
    public void close() {
        // 无动作
    }

    @Override
    public void run() {
        System.out.println("RUN 电梯运行中。 run()");
    }

    @Override
    public void stop() {
        super.context.setStateElevator(Context.STOP_STATE);

        super.context.getStateElevator().stop();
    }
}
