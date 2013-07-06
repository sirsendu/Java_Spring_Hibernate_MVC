package com.cc.app.db;

import java.math.BigDecimal;

/**
 * Domain entity.
 * 
 * @author Sirsendu Konar
 */

public class Domain implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private String name;

	// Constructors

	/** default constructor */
	public Domain() {
	}

	/** full constructor */
	public Domain(String name) {

		this.name = name;
	}

	// Property accessors

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}