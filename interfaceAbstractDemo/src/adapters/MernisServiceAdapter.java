package adapters;

import tr.gov.nvi.tckimlik.WS.*;
import entities.Customer;
import interfaces.CustomerCheckService;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {

			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
					customer.getDateOfBirth().getYear());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return true;
	}
}
