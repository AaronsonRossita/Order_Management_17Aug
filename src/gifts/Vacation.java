package gifts;

public class Vacation implements Giftable {
    @Override
    public void openGift() {
        System.out.println("Congratulations! you got a vacation! Enjoy!");
    }
}
