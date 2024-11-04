package com.kaji.config;

import com.kaji.model.Customer;
import com.kaji.model.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerItemWriter implements ItemWriter<Customer> {

  private static final Logger LOGGER = LoggerFactory.getLogger(CustomerItemWriter.class);

  @Autowired
  private CustomerRepository customerRepository;

  @Override
  public void write(Chunk<? extends Customer> people) {
    LOGGER.info("Writing to the Database the information of {} people", people.size());
    people.getItems().stream().forEach(customerRepository::save);
  }
}
