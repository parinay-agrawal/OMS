package com.chandu.oms.web;

import com.chandu.oms.entity.Customer;
import com.chandu.oms.entity.Security_master;
import com.chandu.oms.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OmsController {
@Autowired
private CustomerService customerService;
@Autowired
private Order_bookService order_bookService;
@Autowired
private Order_historyService order_historyService;
@Autowired
private Security_masterService security_masterService;

@Autowired
public CustomerService getCustomerService() {
	return customerService;
}

@Autowired
public void setCustomerService(CustomerService customerService) {
	this.customerService = customerService;
}
    @Autowired
    public void setOrder_bookService(Order_bookService order_bookService) {
        this.order_bookService = order_bookService;
    }
    @Autowired
    public void setOrder_historyService(Order_historyService order_historyService) {
        this.order_historyService = order_historyService;
    }
    @Autowired
    public void setSecurity_masterService(Security_masterService security_masterService) {
        this.security_masterService = security_masterService;
    }




	@GetMapping("/customers")
public String retrieveCustomers(Model model)
{
	model.addAttribute("customers", customerService.displayCust());
	return "customers";
	}
	@GetMapping("/books")
	public String retrieveBook(Model model)
	{
		model.addAttribute("books", order_bookService.displayBook());
		return "books";
	}
	@GetMapping("/history")
	public String retrieveHistory(Model model)
	{
		model.addAttribute("history", order_historyService.displayOrderHistory());
		return "history";
	}
	@GetMapping("/masters")
	public String retrieveSecurityMaster(Model model)
	{
		model.addAttribute("masters", security_masterService.displaySecurityMaster());
		return "masters";
	}
    @GetMapping("/login")
    public String enterLogin(Model model) {
        return "login";
    }
    @PostMapping("/login")
    public String LeaveLogin(@ModelAttribute Customer customer,Model model) {
     model.addAttribute("customer",customer);
        return "place";
    }

}
