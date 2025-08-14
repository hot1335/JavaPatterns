package biz.baijing.state.statemethod;

public class CustomerRun {
    public static void main(String[] args) {

        Context context = new Context();

        context.setStateElevator(new Open());

        context.run();
        context.open();
        context.close();
        context.stop();

    }
}
