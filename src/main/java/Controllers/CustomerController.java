package Controllers;

import Models.Customer;
import Repository.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping("/create-customer")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("customer", new Customer());
        return modelAndView;
    }

    @PostMapping("/create-customer")
    public ModelAndView saveCustomer(@ModelAttribute Customer customer){
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("customer", new Customer());
        modelAndView.addObject("message", "New customer created successfully");
        return modelAndView;
    }

    @GetMapping("/customers")
    public ModelAndView listCustomers() {
        List<Customer> customers = customerService.findAll();
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

    @GetMapping("/edit-customer/{id}")
    public ModelAndView updateCustomer(@PathVariable Long id){
        ModelAndView modelAndView = null;
        if(id != null){
            modelAndView = new ModelAndView("edit");
            modelAndView.addObject("customer", customerService.findById(id));
        }else {
            modelAndView = new ModelAndView("error");
        }
        return modelAndView;
    }

    @PostMapping("/edit-customer")
    public ModelAndView updateCustomer(@ModelAttribute("customer") Customer customer){
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("customer", customer);
        modelAndView.addObject("message", "Customer updated successfully");
        return modelAndView;
    }

    @GetMapping("/delete-customer/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id){
        ModelAndView modelAndView = null;
        if(id != null){
            modelAndView = new ModelAndView("delete");
            modelAndView.addObject("customer", customerService.findById(id));
        }else {
            modelAndView = new ModelAndView("error");
        }
        return modelAndView;
    }

    @PostMapping("/delete-customer")
    public String deleteCustomer(@ModelAttribute("customer") Customer customer){
        customerService.remove(customer.getId());
        return "redirect:customers";
    }

    @PostMapping("/search-customer")
    public ModelAndView search(@RequestParam String firstName){
        List<Customer> customers = customerService.findByName(firstName);
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("customer", customers);
        return modelAndView;
    }
}
