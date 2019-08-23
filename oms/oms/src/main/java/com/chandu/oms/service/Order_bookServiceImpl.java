package com.chandu.oms.service;

import com.chandu.oms.entity.Order_book;
import com.chandu.oms.repository.Order_bookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Order_bookServiceImpl implements Order_bookService {

    @Autowired
    private Order_bookRepository order_bookRepository;
    @Override
    public Iterable<Order_book> displayBook() {
        return order_bookRepository.findAll();
    }
}
