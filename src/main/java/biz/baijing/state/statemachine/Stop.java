package biz.baijing.state.statemachine;

/**
 * 状态模式 - 抽象类 : 停止状态类
 * @version 0.1
 * @author  BaiJing.biz
 */
public class Stop extends StateElevator {

    @Override
    public void open() {
        super.context.setStateElevator(Context.OPEN_STATE);

        super.context.getStateElevator().open();
    }

    @Override
    public void close() {
        super.context.setStateElevator(Context.CLOSE_STATE);

        super.context.getStateElevator().close();
    }

    @Override
    public void run() {
        super.context.setStateElevator(Context.RUN_STATE);

        super.context.getStateElevator().run();
    }

    @Override
    public void stop() {
        System.out.println("STOP 电梯停止中。 stop()");
    }
}
