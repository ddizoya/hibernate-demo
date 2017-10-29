package prueba.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prueba.hibernate.pojos.Customers;
import prueba.hibernate.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customers> getAllCustomers() {
		return customerRepository.findAll();
	}
}
