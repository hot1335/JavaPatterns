package biz.baijing.flyweight;

public class CustomerRun {
    public static void main(String[] args) {

        ShareBike shareBike = BikeFactory.getBikeFactoryInstance().getShareBike(1);

        shareBike.On(1);

        shareBike.Off(1);

    }
}
