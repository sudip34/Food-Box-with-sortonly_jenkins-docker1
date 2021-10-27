package kitchenstory.kitchenstory.service;

import java.util.Set;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kitchenstory.kitchenstory.dto.Purchase;
import kitchenstory.kitchenstory.dto.PurchaseResponse;
import kitchenstory.kitchenstory.entity.AdminLogin;
import kitchenstory.kitchenstory.entity.Order;
import kitchenstory.kitchenstory.entity.OrderItem;
import kitchenstory.kitchenstory.repository.PurchaseRepository;
@Service
public class CheckoutService {
	@Autowired
	private PurchaseRepository purchaseRepository;
	
	@Transactional
	public PurchaseResponse placeOrder(Purchase purchase) {

        // retrieve the order info from dto
        Order order = purchase.getOrder();

        // generate tracking number
        String orderTrackingNumber = generateOrderTrackingNumber();
        order.setOrderTrackingNumber(orderTrackingNumber);

        // populate order with orderItems
        Set<OrderItem> orderItems = purchase.getOrderItems();
        orderItems.forEach(item -> order.add(item));

        // populate order with billingAddress and shippingAddress
        order.setBillingAddress(purchase.getBillingAddress());
        order.setShippingAddress(purchase.getShippingAddress());
        
////        // populate customer with order
//        AdminLogin customer = purchase.getCustomer();
//        order.setCustomer(customer);

        // save to the database
         purchaseRepository.save(order);

        // return a response
        return new PurchaseResponse(orderTrackingNumber);
    }

    private String generateOrderTrackingNumber() {

        // generate a random UUID number (UUID version-4)
        // For details see: https://en.wikipedia.org/wiki/Universally_unique_identifier
        //
        return UUID.randomUUID().toString();
    }

}
