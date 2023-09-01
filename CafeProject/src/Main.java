import Abstract.BaseCustomerManager;
import Concrete.CustomerCheckManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {
    public static void main(String[] args) {

        BaseCustomerManager customerManager= new StarbucksCustomerManager(new CustomerCheckManager());
        Customer customer = new Customer(2,"534","csax","32-24-12","asd");
        customerManager.save(new Customer(1,"ekrem","uğur","90-15-23","1231234"));
        customerManager.save(customer);


    }
}