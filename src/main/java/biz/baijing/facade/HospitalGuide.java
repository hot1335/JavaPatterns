package biz.baijing.facade;

/**
 * 外观模式 - 外观
 * @version 0.1
 * @author  BaiJing.biz
 */
public class HospitalGuide {

    private ExamineList examineList;
    private PayList payList;
    private Registered registered;

    public HospitalGuide() {
        examineList = new ExamineList();
        payList = new PayList();
        registered = new Registered();
    }

    public void say(String message) {
        switch (message) {
            case "挂号":
                registered.OnRegister();
                break;
            case "取化验单":
                examineList.OnExamineList();
                break;
            case "取付款清单":
                payList.Pay();
                break;
            default:
                System.out.println("请说出你的导购内容： ");
        }
    }

}
