import java.time.LocalDate;
import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {

		LocalDate date = LocalDate.of(1997, 12, 26);
		Customer customer = new Customer();
		customer.setId(1);
		customer.setNationalityId("00000000000");
		customer.setFirstName("Berk");
		customer.setLastName("Güngör");
		customer.setDateOfBirth(date);

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer);

	}

}
