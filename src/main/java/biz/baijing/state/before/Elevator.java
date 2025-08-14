package biz.baijing.state.before;

/**
 * 状态模式 - 实现类
 * @version 0.1
 * @author  BaiJing.biz
 */
public class Elevator implements StateInterface {

    private int state;

    @Override
    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (this.state) {
            case OPENING_STATE:
                // 无需操作，等待下一步操作
                break;
            case RUNNING_STATE:
                // 运行中，无法打开，不能有操作
                break;
            case STOPPING_STATE:
                System.out.println("OPEN 电梯已打开。STOPPING_STATE");
                setState(OPENING_STATE);
                break;
            case CLOSED_STATE:
                System.out.println("OPEN 电梯已打开。CLOSED_STATE");
                setState(OPENING_STATE);
                break;
        }
    }

    @Override
    public void close() {
        switch (this.state) {
            case OPENING_STATE:
                System.out.println("CLOSED 电梯门已关闭。OPENING_STATE");
                this.setState(CLOSED_STATE);
                break;
            case RUNNING_STATE:
                // 运行中，不能有操作
                break;
            case STOPPING_STATE:
                // 已停止无需操作
                break;
            case CLOSED_STATE:
                // 关闭中，无需操作
                break;
        }
    }

    @Override
    public void run() {
        switch (this.state) {
            case OPENING_STATE:
                // 不能操作
                break;
            case RUNNING_STATE:
                // 运行中，不能有操作
                break;
            case STOPPING_STATE:
                System.out.println("RUNING 电梯开始运行。STOPPING_STATE");
                this.setState(RUNNING_STATE);
                break;
            case CLOSED_STATE:
                System.out.println("RUNING 电梯开始运行。CLOSED_STATE");
                this.setState(RUNNING_STATE);
                break;
        }
    }

    @Override
    public void stop() {
        switch (this.state) {
            case OPENING_STATE:
                System.out.println("STOP 电梯停止运行。OPENING_STATE");
                this.setState(STOPPING_STATE);
                break;
            case RUNNING_STATE:
                System.out.println("STOP 电梯停止运行。RUNNING_STATE");
                this.setState(STOPPING_STATE);
                break;
            case STOPPING_STATE:
                // 已经处于停止状态
                break;
            case CLOSED_STATE:
                System.out.println("STOP 电梯停止运行。CLOSED_STATE");
                this.setState(STOPPING_STATE);
                break;
        }
    }
}
