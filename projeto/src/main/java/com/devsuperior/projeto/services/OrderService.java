package com.devsuperior.projeto.services;

import com.devsuperior.projeto.entityes.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingServices shippingServices;

    public double total(Order order) {

        return (order.getBasic()-(order.getBasic() * (order.getDiscount()/100)))
                + shippingServices.shipment(order);
    }

}
