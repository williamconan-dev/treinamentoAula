package com.devsuperior.projeto.services;

import com.devsuperior.projeto.entityes.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingServices {

    public double shipment(Order order) {

        if (order.getBasic() < 100) {
            return order.getBasic() + 20;
        }

        if (order.getBasic() >= 100 && order.getBasic() <= 200) {

            return order.getBasic() + 12;
        }

        return order.getBasic();
    }

}
