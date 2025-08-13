package biz.baijing.chainofresponsibility;

/**
 * 责任链模式 - 抽象处理者
 * @version 0.1
 * @author  BaiJing.biz
 */
public abstract class Handler {

    // 请假天数
    protected final static int ONE_DAY = 1;
    protected final static int THREE_DAYS = 3;
    protected final static int SEVEN_DAYS = 7;


    // 请假的范围
    private int startDay;
    private int endDay;

    // 下一级领导
    private  Handler nextHandler;

    public Handler(int startDay){
        this.startDay = startDay;
    }

    public Handler(int startDay, int endDay) {
        this.startDay = startDay;
        this.endDay = endDay;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // 申请请教条的权限
    protected  abstract void handlerAskLeave(AskLeave askLeave);

    public final void submitAshLeave(AskLeave askLeave){
        this.handlerAskLeave(askLeave);
        if (this.nextHandler != null && askLeave.getDays() > this.endDay) {
            this.nextHandler.submitAshLeave(askLeave);
        } else {
            System.out.println("已审批完成 。");
        }
    }

}
