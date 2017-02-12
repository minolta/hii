package me.pixka.hii.d;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import me.pixka.data.Data;
import me.pixka.device.d.Device;

@Entity
public class Addgoods extends Data {

	@Column(insertable = false, updatable = false)
	private Long device_id;
	@Column(insertable = false, updatable = false)
	private Long product_id;

	private Date gdate;

	@ManyToOne
	private Product product;
	@ManyToOne
	private Device device;

	private BigDecimal amount;

	public Long getDevice_id() {
		return device_id;
	}

	public void setDevice_id(Long device_id) {
		this.device_id = device_id;
	}

	public Long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Date getGdate() {
		return gdate;
	}

	public void setGdate(Date gdate) {
		this.gdate = gdate;
	}

}
