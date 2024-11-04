package com.kaji.config;

import com.kaji.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class CustomerItemProcessor implements ItemProcessor<Customer, Customer> {
  private static final Logger LOGGER = LoggerFactory.getLogger(CustomerItemProcessor.class);

  @Override
  public Customer process(Customer item) {
    LOGGER.info("Processing person information: {}", item);
    return item;
  }
}
