import gifts.Giftable;

import java.util.ArrayList;

public class Customer {

    private static int counter = 1;
    private int id;
    private String name;
    private String email;
    private String address;
    private CustomerType customerType;
    private Integer discount;
    private Giftable gift;
    private ArrayList<Item> listOfFavItems;

    public Customer(String name, String email, String address, CustomerType customerType, Integer discount) {
        this.id = counter++;
        this.name = name;
        this.email = email;
        this.address = address;
        this.customerType = customerType;
        this.discount = discount;
        this.gift = null;
        this.listOfFavItems = new ArrayList<Item>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Giftable getGift() {
        return gift;
    }

    public void setGift(Giftable gift) {
        this.gift = gift;
    }

    public ArrayList<Item> getListOfFavItems() {
        return listOfFavItems;
    }

    public void setListOfFavItems(ArrayList<Item> listOfFavItems) {
        this.listOfFavItems = listOfFavItems;
    }

    public void addItemToFavList (Item item){
        this.listOfFavItems.add(item);
    }

    public void deleteItemFromFavList(Item item){
        this.listOfFavItems.remove(item);
    }

    public void openGift(){
        this.gift.openGift();
    }

}
