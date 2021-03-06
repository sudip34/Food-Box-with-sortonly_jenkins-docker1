package kitchenstory.kitchenstory.dto;

import java.util.Set;

import kitchenstory.kitchenstory.entity.Address;
import kitchenstory.kitchenstory.entity.AdminLogin;
import kitchenstory.kitchenstory.entity.Order;
import kitchenstory.kitchenstory.entity.OrderItem;

public class Purchase {

//	private AdminLogin customer;
	private Address shippingAddress;
	private Address billingAddress;
	private Order order;
	private Set<OrderItem> orderItems;

	public Purchase(Address shippingAddress, Address billingAddress, Order order, Set<OrderItem> orderItems) {
		super();
		this.shippingAddress = shippingAddress;
		this.billingAddress = billingAddress;
		this.order = order;
		this.orderItems = orderItems;
	}
//	public Purchase(AdminLogin customer, Address shippingAddress, Address billingAddress, Order order,
//			Set<OrderItem> orderItems) {
//		super();
//		this.customer = customer;
//		this.shippingAddress = shippingAddress;
//		this.billingAddress = billingAddress;
//		this.order = order;
//		this.orderItems = orderItems;
//	}

	public Purchase() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public AdminLogin getCustomer() {
//		return customer;
//	}
//
//	public void setCustomer(AdminLogin customer) {
//		this.customer = customer;
//	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Set<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(Set<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	@Override
	public String toString() {
		return "Purchase [ shippingAddress=" + shippingAddress + ", billingAddress=" + billingAddress + ", order="
				+ order + ", orderItems=" + orderItems + "]";
	}

}
