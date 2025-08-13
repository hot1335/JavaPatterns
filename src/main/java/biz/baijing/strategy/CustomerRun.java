package biz.baijing.strategy;

public class CustomerRun {
    public static void main(String[] args) {

        TravelPlanner travelPlanner = new TravelPlanner(new Cruiseship());

        travelPlanner.saleTtravelplan();

        travelPlanner.setTransportation(new Airplane());
        travelPlanner.saleTtravelplan();

    }
}
