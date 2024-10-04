package com.learning.challengedependencyinjection.services;

import com.learning.challengedependencyinjection.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingServices {
    public double shipment(Order order) {
        if (order.getBasic() < 100) {
            return 20;
        } else if (order.getBasic() <= 200) {
            return 12;
        } else {
            return 0;
        }
    }
}
