package biz.baijing.decorator;

public class CustomerRun {
    public static void main(String[] args) {

//        ShoutaoCake shoutaoCake = new ShoutaoCake();

        Cake cake = new ShoutaoCake();


        System.out.println(cake.getName() +" - " + cake.cost());

        cake = new Apple(cake);
        System.out.println(cake.getName() +" - " + cake.cost());

        cake = new Peach(cake);
        System.out.println(cake.getName() +" - " + cake.cost());

        

    }
}
