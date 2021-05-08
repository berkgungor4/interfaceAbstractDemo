package concrete;

import interfaces.*;
import abstracts.*;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override

	public void save(Customer customer) {

		if (customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Save to database for Starbucks: " + customer.getFirstName());
		} else {
			System.out.println("Not a valid person");
		}

	}

}
