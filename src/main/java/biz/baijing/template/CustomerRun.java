package biz.baijing.template;

public class CustomerRun {
    public static void main(String[] args) {

        HotelCheckin hotelCheckin = new HotelCheckin();

        hotelCheckin.checkinProcess(0);

        ApartmentCheckin apartmentCheckin = new ApartmentCheckin();

        apartmentCheckin.checkinProcess(210);
    }
}
