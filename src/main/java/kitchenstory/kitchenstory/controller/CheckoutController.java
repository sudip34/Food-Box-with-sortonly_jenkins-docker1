package kitchenstory.kitchenstory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kitchenstory.kitchenstory.dto.Purchase;
import kitchenstory.kitchenstory.dto.PurchaseResponse;
import kitchenstory.kitchenstory.entity.Order;
import kitchenstory.kitchenstory.repository.PurchaseRepository;
import kitchenstory.kitchenstory.service.CheckoutService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {
	@Autowired
	private CheckoutService checkoutService;
	
	@Autowired
	private PurchaseRepository purchaseRepo;
	
	 @PostMapping("/purchase")
	    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

	        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

	        return purchaseResponse;
	    }
	 @GetMapping("/orders")
	    public List<Order> getOrder() {
	        return this.purchaseRepo.findAll();
	    }

}
