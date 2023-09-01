    package Abstract;

    import Entities.Customer;

    public class BaseCustomerManager implements ICustomerService{
        @Override
        public void save(Customer customer) {
            System.out.println("Saved to database:"+ customer.getName()+" "+customer.getSurname());

        }
    }
