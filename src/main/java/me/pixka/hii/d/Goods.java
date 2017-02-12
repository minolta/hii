package me.pixka.hii.d;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import me.pixka.data.Data;

@Entity
public class Goods extends Data {

	@Column(insertable = false, updatable = false)
	private Long product_id;
	@ManyToOne
	private Product product;

	private BigDecimal w;
	private BigDecimal p;

	private Date gooddate;

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

	public BigDecimal getW() {
		return w;
	}

	public void setW(BigDecimal w) {
		this.w = w;
	}

	public BigDecimal getP() {
		return p;
	}

	public void setP(BigDecimal p) {
		this.p = p;
	}

	public Date getGooddate() {
		return gooddate;
	}

	public void setGooddate(Date gooddate) {
		this.gooddate = gooddate;
	}

}
