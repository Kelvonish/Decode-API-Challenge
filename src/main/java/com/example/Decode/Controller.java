package com.example.Decode;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@RestController
public class Controller {
    final private Repository repository;



    @GetMapping(path = "get_customer")
    public List<Entity> getCustomer(){
        return repository.findAll();
    }

    @PostMapping(path = "add_customer",produces = "application/json")
    public void addCustomer(@RequestBody Entity customer){
        System.out.println(customer);

        repository.save(customer);
    }

    @PostMapping(path = "update_customer",produces = "application/json")
    public void updateCustomer(@RequestBody Entity customer){
        repository.save(customer);
    }

    @PostMapping(path = "delete_customer",produces = "application/json")
    public void deleteCustomer(@RequestParam(name = "id") String id){
        repository.deleteById(id);

    }

}

