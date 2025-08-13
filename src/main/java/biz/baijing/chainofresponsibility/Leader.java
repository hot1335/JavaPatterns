package biz.baijing.chainofresponsibility;

/**
 * 责任链模式 - 处理者 : 直接领导
 * @version 0.1
 * @author  BaiJing.biz
 */
public class Leader  extends Handler {

    public Leader() {
        super(0,Handler.ONE_DAY);
    }

    @Override
    protected void handlerAskLeave(AskLeave askLeave) {
        System.out.println(askLeave.getName() + "请假" + askLeave.getDays() + "天" + "," + askLeave.getContent());
        System.out.println("直接领导：同意");
    }
}
