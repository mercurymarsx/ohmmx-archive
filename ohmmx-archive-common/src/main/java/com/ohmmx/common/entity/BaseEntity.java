package com.ohmmx.common.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

@MappedSuperclass
public abstract class BaseEntity {
	@Id
	@GenericGenerator(name = "idGen", strategy = "com.ohmmx.common.id.IdGenerator")
	@GeneratedValue(generator = "idGen")
	protected String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
