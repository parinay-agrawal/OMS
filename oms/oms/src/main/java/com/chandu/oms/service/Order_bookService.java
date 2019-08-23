package com.chandu.oms.service;

import org.springframework.stereotype.Service;
import com.chandu.oms.entity.Order_book;
@Service
public interface Order_bookService {
    Iterable<Order_book> displayBook();
}
