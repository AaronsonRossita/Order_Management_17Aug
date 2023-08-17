import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Order {

    private static int counter = 1;
    private int id;
    private String name;
    private String address;
    private ArrayList<Item> listOfItems;
    private Customer customer;
    private double totalPrice;
    private PaymentType paymentType;
    private LocalDate orderDate;

    public Order(String name, String address, ArrayList<Item> listOfItems, Customer customer, PaymentType paymentType) {
        this.id = counter++;
        this.name = name;
        this.address = address;
        this.listOfItems = listOfItems;
        this.customer = customer;
        this.paymentType = paymentType;
        this.orderDate = LocalDate.now();
        try{
            this.totalPrice = calculateTotalPrice();
        }catch (Exception e){
            System.out.println("Not a vip customer, but exception was caught");
        }
        addOrderToFavItems();

    }

    public int getId() {
        return id;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Item> getListOfItems() {
        return listOfItems;
    }

    public void setListOfItems(ArrayList<Item> listOfItems) {
        this.listOfItems = listOfItems;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public void addOrderToFavItems(){
        ArrayList<String> names = new ArrayList<>();
        for(Item item : customer.getListOfFavItems()){
            names.add(item.getName());
        }
        for(Item item : this.listOfItems){
            if(!names.contains(item.getName())){
                customer.addItemToFavList(item);
            }
        }
    }

     public abstract double calculateTotalPrice() throws Exception;

}
