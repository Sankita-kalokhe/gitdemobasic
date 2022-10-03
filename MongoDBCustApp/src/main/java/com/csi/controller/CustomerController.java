package com.csi.controller;

import com.csi.model.Customer;
import com.csi.service.CustomerServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
public class CustomerController
{
    @Autowired
    CustomerServiceImpl customerServiceImpl;
    @GetMapping("/getAllData")
    public ResponseEntity< List<Customer>>getAllData()
    {
        return ResponseEntity.ok( customerServiceImpl.getAllData());
    }
    @PostMapping("/savedata")
    public ResponseEntity<Customer>saveData(@RequestBody Customer customer)
    {
        log.info("*****TRING YO SAVE DATA FOR CUSTOMER ********"+customer.getCustName());
        return  ResponseEntity.ok(customerServiceImpl.saveData(customer));
    }


}
