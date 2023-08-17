package gifts;

public class Coupon implements Giftable{
    @Override
    public void openGift() {
        System.out.println("Congratulations! you got a coupon! Enjoy!");
    }
}
