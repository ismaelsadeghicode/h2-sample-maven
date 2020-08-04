package com.sarmad.demo.controller;

import com.sarmad.demo.model.Customer;
import com.sarmad.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Esmaeil Sadeghi, 8/4/20 9:03 PM
 */
@RestController
@RequestMapping("/customer")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<Customer> users(){
        return repository.findAll();
    }

    @PostMapping
    public Customer save(@RequestBody Customer customer){
        return repository.save(customer);
    }

    @DeleteMapping
    private void delete(@RequestBody Customer customer){
         repository.delete(customer);
    }

    @DeleteMapping("/{id}")
    private void deleteById(@PathVariable int id){
        repository.deleteById(id);
    }

    // todo
}
