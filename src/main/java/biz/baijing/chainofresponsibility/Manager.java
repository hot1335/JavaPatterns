package biz.baijing.chainofresponsibility;

/**
 * 责任链模式 - 处理者 : 部门领导
 * @version 0.1
 * @author  BaiJing.biz
 */
public class Manager extends Handler {

    public Manager() {
        super(Handler.ONE_DAY,Handler.THREE_DAYS);
    }

    @Override
    protected void handlerAskLeave(AskLeave askLeave) {
        System.out.println(askLeave.getName() + "请假" + askLeave.getDays() + "天" + "," + askLeave.getContent());
        System.out.println("部门领导：同意");
    }
}
