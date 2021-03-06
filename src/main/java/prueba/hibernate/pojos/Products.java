package prueba.hibernate.pojos;
// Generated Oct 29, 2017 5:49:23 PM by Hibernate Tools 5.0.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Products generated by hbm2java
 */
@Entity
@Table(name = "products", catalog = "classicmodels")
public class Products implements java.io.Serializable {

	private String productCode;
	private long buyPrice;
	private long msrp;
	private String productDescription;
	private String productName;
	private String productScale;
	private String productVendor;
	private short quantityInStock;
	private String productLine;
	private Set<Orderdetails> orderdetailses = new HashSet<Orderdetails>(0);

	public Products() {
	}

	public Products(String productCode, long buyPrice, long msrp, String productDescription, String productName,
			String productScale, String productVendor, short quantityInStock, String productLine) {
		this.productCode = productCode;
		this.buyPrice = buyPrice;
		this.msrp = msrp;
		this.productDescription = productDescription;
		this.productName = productName;
		this.productScale = productScale;
		this.productVendor = productVendor;
		this.quantityInStock = quantityInStock;
		this.productLine = productLine;
	}

	public Products(String productCode, long buyPrice, long msrp, String productDescription, String productName,
			String productScale, String productVendor, short quantityInStock, String productLine,
			Set<Orderdetails> orderdetailses) {
		this.productCode = productCode;
		this.buyPrice = buyPrice;
		this.msrp = msrp;
		this.productDescription = productDescription;
		this.productName = productName;
		this.productScale = productScale;
		this.productVendor = productVendor;
		this.quantityInStock = quantityInStock;
		this.productLine = productLine;
		this.orderdetailses = orderdetailses;
	}

	@Id

	@Column(name = "product_code", unique = true, nullable = false, length = 15)
	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	@Column(name = "buy_price", nullable = false, precision = 10, scale = 0)
	public long getBuyPrice() {
		return this.buyPrice;
	}

	public void setBuyPrice(long buyPrice) {
		this.buyPrice = buyPrice;
	}

	@Column(name = "msrp", nullable = false, precision = 10, scale = 0)
	public long getMsrp() {
		return this.msrp;
	}

	public void setMsrp(long msrp) {
		this.msrp = msrp;
	}

	@Column(name = "product_description", nullable = false)
	public String getProductDescription() {
		return this.productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	@Column(name = "product_name", nullable = false, length = 70)
	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Column(name = "product_scale", nullable = false, length = 10)
	public String getProductScale() {
		return this.productScale;
	}

	public void setProductScale(String productScale) {
		this.productScale = productScale;
	}

	@Column(name = "product_vendor", nullable = false, length = 50)
	public String getProductVendor() {
		return this.productVendor;
	}

	public void setProductVendor(String productVendor) {
		this.productVendor = productVendor;
	}

	@Column(name = "quantity_in_stock", nullable = false)
	public short getQuantityInStock() {
		return this.quantityInStock;
	}

	public void setQuantityInStock(short quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	@Column(name = "product_line", nullable = false, length = 50)
	public String getProductLine() {
		return this.productLine;
	}

	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "products")
	public Set<Orderdetails> getOrderdetailses() {
		return this.orderdetailses;
	}

	public void setOrderdetailses(Set<Orderdetails> orderdetailses) {
		this.orderdetailses = orderdetailses;
	}

}
