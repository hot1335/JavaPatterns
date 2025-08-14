package biz.baijing.state.before;

public class CustomerRun {
    public static void main(String[] args) {

        Elevator elevator = new Elevator();

//        elevator.setState(StateInterface.RUNNING_STATE);
        elevator.setState(StateInterface.CLOSED_STATE);

        elevator.open();
        elevator.close();
        elevator.run();
        elevator.stop();

    }
}
