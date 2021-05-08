package abstracts;

import entities.Customer;
import interfaces.CustomerService;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {

		System.out.println("Saved to database : " + customer.getFirstName());

	}

}
