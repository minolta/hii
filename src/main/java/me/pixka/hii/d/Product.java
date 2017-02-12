package me.pixka.hii.d;

import javax.persistence.Entity;

import me.pixka.data.Data;

@Entity
public class Product extends Data {

	private String name;
	private String code;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
