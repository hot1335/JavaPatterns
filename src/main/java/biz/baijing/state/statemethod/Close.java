package biz.baijing.state.statemethod;

/**
 * 状态模式 - 抽象类 : 关闭状态类
 * @version 0.1
 * @author  BaiJing.biz
 */
public class Close extends StateElevator {

    @Override
    public void open() {
        super.context.setStateElevator(Context.OPEN_STATE);
        super.context.open();
    }

    @Override
    public void close() {
        System.out.println("CLOSE 电梯门关闭。 close()");
    }

    @Override
    public void run() {
        super.context.setStateElevator(Context.RUN_STATE);
        super.context.run();
    }

    @Override
    public void stop() {
        super.context.setStateElevator(Context.STOP_STATE);
        super.context.stop();
    }
}
