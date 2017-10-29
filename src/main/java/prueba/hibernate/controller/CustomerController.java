package prueba.hibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import prueba.hibernate.pojos.Customers;
import prueba.hibernate.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@ResponseBody
	@RequestMapping(value = "/customers")
	public List<Customers> customers() {
		return customerService.getAllCustomers();
	}

}
