package com.devsuperior.projeto.services;

import com.devsuperior.projeto.entityes.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingServices {

    public double shipment(Order order) {

        if (order.getBasic() < 100.00) {
            return 20.0;
        }

        if (order.getBasic() >= 100.00 && order.getBasic() <= 200.00) {

            return 12.0;
        }

        if (order.getBasic() > 200.00){
            return 0;
        }

        return order.getBasic();
    }

}
