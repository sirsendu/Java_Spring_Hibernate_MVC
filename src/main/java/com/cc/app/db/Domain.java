package com.cc.app.db;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Domain entity.
 * 
 * @author Sirsendu Konar
 */
@Entity
@Table(name = "domain")
public class Domain implements java.io.Serializable {

	// Fields
    @Id
    @Column(name = "id", unique = true, nullable = false)
	private BigDecimal id;
    
    @Column(name = "name", unique = true, nullable = false)
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