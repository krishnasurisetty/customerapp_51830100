package com.custapphib.web.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.custapphib.model.persistence.Customer;
import com.custapphib.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerservice;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(ModelMap map) {
		return "redirect:login";
	}

	@RequestMapping(value = "allcustomer", method = RequestMethod.GET)
	public String getCustomer(ModelMap map) {
		map.addAttribute("customers", customerservice.getAllCustomer());
		return "allcustomer";

	}

	@RequestMapping(value = "addcustomer", method = RequestMethod.GET)
	public String addCustomerGet(ModelMap map) {
		map.addAttribute("customer", new Customer());
		return "addcustomer";

	}

	@RequestMapping(value = "addcustomer", method = RequestMethod.POST)
	public String addCustomerPost(@Valid Customer customer, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "addcustomer";
		} else {

			if (customer.getId() == 0)
				customerservice.addCustomer(customer);
			else
				customerservice.updateCustomer(customer);
			return "redirect:allcustomer";
		}
	}

	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String deleteBook(HttpServletRequest req) {
		int custId = Integer.parseInt(req.getParameter("id"));
		customerservice.removeCustomer(custId);
		return "redirect:allcustomer";

	}

	@RequestMapping(value = "update", method = RequestMethod.GET)
	public String updateBookGet(HttpServletRequest req, ModelMap map) {
		int custId = Integer.parseInt(req.getParameter("id"));
		Customer customertoUpdate = customerservice.getCustomerById(custId);
		map.addAttribute("customer", customertoUpdate);
		return "addcustomer";

	}

	@ModelAttribute(value = "empList")
	public List<String> getEmployeeList() {
		return Arrays.asList("Admin", "Manager", "Trainee");
	}

}
