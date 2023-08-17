import gifts.Coupon;
import gifts.Vacation;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Item item1 = new Item("a",10);
        Item item2 = new Item("b",20);
        Item item3 = new Item("c",30);
        Item item4 = new Item("d",5.2);
        Item item5 = new Item("c",40);

        Customer c1 = new Customer("a","a","a",CustomerType.REGULAR,null);
        Customer c2 = new Customer("b","b","b",CustomerType.VIP,10);
        Customer c3 = new Customer("c","c","c",CustomerType.REGULAR,null);

        c1.addItemToFavList(item3);
        c1.addItemToFavList(item4);
        //System.out.println(c1.getListOfFavItems());

        ArrayList<Item> listOrder1 = new ArrayList<>();
        listOrder1.add(item1);
        listOrder1.add(item2);
        listOrder1.add(item3);
        listOrder1.add(item5);

        //RegularOrder order1 = new RegularOrder("a","a",listOrder1,c1,PaymentType.CASH);
        //VIPOrder order2 = new VIPOrder("b","b",listOrder1,c3,PaymentType.CHECK);
        //c1.deleteItemFromFavList(item4);
        //System.out.println(c1.getListOfFavItems());
        //System.out.println(order2.getTotalPrice());

        //c1.setGift(new Vacation());
        //c1.openGift();


















    }


}