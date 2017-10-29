package prueba.hibernate.pojos;
// Generated Oct 29, 2017 5:49:23 PM by Hibernate Tools 5.0.6.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Orderdetails generated by hbm2java
 */
@Entity
@Table(name = "orderdetails", catalog = "classicmodels")
public class Orderdetails implements java.io.Serializable {

	private OrderdetailsId id;
	private Orders orders;
	private Products products;
	private short orderLineNumber;
	private long priceEach;
	private int quantityOrdered;

	public Orderdetails() {
	}

	public Orderdetails(OrderdetailsId id, Orders orders, Products products, short orderLineNumber, long priceEach,
			int quantityOrdered) {
		this.id = id;
		this.orders = orders;
		this.products = products;
		this.orderLineNumber = orderLineNumber;
		this.priceEach = priceEach;
		this.quantityOrdered = quantityOrdered;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "orderNumber", column = @Column(name = "order_number", nullable = false)),
			@AttributeOverride(name = "productCode", column = @Column(name = "product_code", nullable = false, length = 15)) })
	public OrderdetailsId getId() {
		return this.id;
	}

	public void setId(OrderdetailsId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "order_number", nullable = false, insertable = false, updatable = false)
	public Orders getOrders() {
		return this.orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_code", nullable = false, insertable = false, updatable = false)
	public Products getProducts() {
		return this.products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	@Column(name = "order_line_number", nullable = false)
	public short getOrderLineNumber() {
		return this.orderLineNumber;
	}

	public void setOrderLineNumber(short orderLineNumber) {
		this.orderLineNumber = orderLineNumber;
	}

	@Column(name = "price_each", nullable = false, precision = 10, scale = 0)
	public long getPriceEach() {
		return this.priceEach;
	}

	public void setPriceEach(long priceEach) {
		this.priceEach = priceEach;
	}

	@Column(name = "quantity_ordered", nullable = false)
	public int getQuantityOrdered() {
		return this.quantityOrdered;
	}

	public void setQuantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}

}
