import java.util.ArrayList;

public class VIPOrder extends Order{
    public VIPOrder(String name, String address, ArrayList<Item> listOfItems, Customer customer, PaymentType paymentType) {
        super(name, address, listOfItems, customer, paymentType);
    }

    @Override
    public double calculateTotalPrice() throws Exception {
        double sum = 0;
        for(Item item : this.getListOfItems()){
            sum += item.getPrice();
        }
        if(this.getCustomer().getCustomerType() == CustomerType.VIP){
            return sum - sum * this.getCustomer().getDiscount() / 100;
        }else{
            throw new Exception("not a VIP customer with VIP order");
        }
    }
}
