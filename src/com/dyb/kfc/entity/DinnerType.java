package com.dyb.kfc.entity;

public class DinnerType {
	private int id;
	private String typeName;

	public DinnerType() {
		super();
	}

	public DinnerType(int id, String typeName) {
		super();
		this.id = id;
		this.typeName = typeName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

}
