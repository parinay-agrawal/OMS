package com.chandu.oms.service;

import com.chandu.oms.entity.Order_history;
import com.chandu.oms.repository.Order_historyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Order_historyServiceImpl implements Order_historyService {

    @Autowired
    private Order_historyRepository order_historyRepository;
    @Override
    public Iterable<Order_history> displayOrderHistory() {
        return  order_historyRepository.findAll();
    }
}
