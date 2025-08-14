package biz.baijing.observer;

public class CustomerRun {
    public static void main(String[] args) {

        SubjectGoodsReal goods  = new SubjectGoodsReal();

        goods.Subscribe(new Auctioneer("Tom"));
        goods.Subscribe(new Auctioneer("Tian"));
        goods.Subscribe(new Auctioneer("若水"));

        goods.notify(10);

    }
}
