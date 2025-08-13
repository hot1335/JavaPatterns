package biz.baijing.chainofresponsibility;

public class CustomerRun {
    public static void main(String[] args) {

        AskLeave askLeave = new AskLeave("Tom",2,"事假");

        Leader leader = new Leader();
        Manager manager = new Manager();
        SeniorManager seniorManager = new SeniorManager();

        // 设置责任链
        leader.setNextHandler(manager);
        manager.setNextHandler(seniorManager);

        // submit
        leader.submitAshLeave(askLeave);


    }
}
