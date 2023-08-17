import java.util.ArrayList;

public class RegularOrder extends Order{


    public RegularOrder(String name, String address, ArrayList<Item> listOfItems, Customer customer, PaymentType paymentType) {
        super(name, address, listOfItems, customer, paymentType);
    }

    @Override
    public double calculateTotalPrice() throws Exception{
        double sum = 0;
        for(Item item : this.getListOfItems()){
            sum += item.getPrice();
        }
        return sum;
    }
}
