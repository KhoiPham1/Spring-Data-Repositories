package com.codegym.cms.repository;

import com.codegym.cms.model.Customer;
import com.codegym.cms.model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer,Long> {//generic cú pháp khai báo trong <generic >
    Iterable<Customer>findAllByProvince(Province province);
}
