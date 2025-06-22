package DependencyInjection;


	import java.util.Objects;

	public class CustomerRepositoryImpl implements CustomerRepository{
	    @Override
	    public Customer findCustomerById(String id) {
	        Customer[] customers = {
	                new Customer("Nandhana"),
	                new Customer("Selvaraju"),
	                new Customer("Kalai"),
	                new Customer("Hanshika"),
	                new Customer("Sweth"),
	        };

	        for(Customer c : customers){
	            if(Objects.equals(c.getCustomerId(), id)){
	                return c;
	            }
	        }
	        return null;
	    }
	}

