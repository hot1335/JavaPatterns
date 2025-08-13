package biz.baijing.chainofresponsibility;

/**
 * 责任链模式 - 处理者 : 事业部领导
 * @version 0.1
 * @author  BaiJing.biz
 */
public class SeniorManager extends Handler {

    public SeniorManager() {
        super(Handler.THREE_DAYS,Handler.SEVEN_DAYS);
    }

    @Override
    protected void handlerAskLeave(AskLeave askLeave) {
        System.out.println(askLeave.getName() + "请假" + askLeave.getDays() + "天" + "," + askLeave.getContent());
        System.out.println("事业部领导：同意");
    }
}
