package com.kaji.config;

import com.kaji.model.Customer;
import org.springframework.batch.extensions.excel.RowMapper;
import org.springframework.batch.extensions.excel.support.rowset.RowSet;

public class CustomerRowMapper implements RowMapper<Customer> {

  @Override
  public Customer mapRow(RowSet rowSet) {

    Customer customer = new Customer();
    customer.setFirstName(rowSet.getProperties().getProperty("First Name"));
    customer.setLastName(rowSet.getProperties().getProperty("Last Name"));
    customer.setAge(Integer.valueOf(rowSet.getProperties().getProperty("Age")));
    customer.setActive(Boolean.valueOf(rowSet.getProperties().getProperty("Active")));
    return customer;
  }
}
