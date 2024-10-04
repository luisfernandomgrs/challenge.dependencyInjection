package com.learning.challengedependencyinjection.services;

import com.learning.challengedependencyinjection.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    ShippingService shippingService;

    public double total(Order order) {
         return order.getBasic()
                 - (order.getBasic() * (0 + (order.getDiscount()/100)))
                 + shippingService.shipment(order);
    }
}
