package kitchenstory.kitchenstory.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="orders")
public class Order {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="order_tracking_number")
    private String orderTrackingNumber;

    @Column(name="total_quantity")
    private int totalQuantity;

    @Column(name="total_price")
    private BigDecimal totalPrice;

    @Column(name="status")
    private String status;

    @Column(name="date_created")
    @CreationTimestamp
    private Date dateCreated;

    @Column(name="last_updated")
    @UpdateTimestamp
    private Date lastUpdated;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "order")
    private Set<OrderItem> orderItems = new HashSet<>();

    @ManyToOne( optional = false)
    @JoinColumn(name = "customer_id")
    private AdminLogin customer;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "shipping_address_id", referencedColumnName = "id")
    private Address shippingAddress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "billing_address_id", referencedColumnName = "id")
    private Address billingAddress;
    
    
    

//    public Order(Long id, String orderTrackingNumber, int totalQuantity, BigDecimal totalPrice, String status,
//			Date dateCreated, Date lastUpdated, Set<OrderItem> orderItems, AdminLogin customer, Address shippingAddress,
//			Address billingAddress) {
//		super();
//		this.id = id;
//		this.orderTrackingNumber = orderTrackingNumber;
//		this.totalQuantity = totalQuantity;
//		this.totalPrice = totalPrice;
//		this.status = status;
//		this.dateCreated = dateCreated;
//		this.lastUpdated = lastUpdated;
//		this.orderItems = orderItems;
//		this.customer = customer;
//		this.shippingAddress = shippingAddress;
//		this.billingAddress = billingAddress;
//	}
    
    
    




	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}







	public Long getId() {
		return id;
	}






	public void setId(Long id) {
		this.id = id;
	}






	public String getOrderTrackingNumber() {
		return orderTrackingNumber;
	}






	public void setOrderTrackingNumber(String orderTrackingNumber) {
		this.orderTrackingNumber = orderTrackingNumber;
	}






	public int getTotalQuantity() {
		return totalQuantity;
	}






	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}






	public BigDecimal getTotalPrice() {
		return totalPrice;
	}






	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}






	public String getStatus() {
		return status;
	}






	public void setStatus(String status) {
		this.status = status;
	}






	public Date getDateCreated() {
		return dateCreated;
	}






	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}






	public Date getLastUpdated() {
		return lastUpdated;
	}






	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}






	public Set<OrderItem> getOrderItems() {
		return orderItems;
	}






	public void setOrderItems(Set<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}






	public AdminLogin getCustomer() {
		return customer;
	}






	public void setCustomer(AdminLogin customer) {
		this.customer = customer;
	}






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






	public void add(OrderItem item) {

        if (item != null) {
            if (orderItems == null) {
                orderItems = new HashSet<>();
            }

            orderItems.add(item);
            item.setOrder(this);
        }
    }

}
