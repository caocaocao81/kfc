package com.dyb.kfc.entity;

public class BreakfastType {
	private int id;
	private String typeName;

	public BreakfastType() {
		super();
	}

	public BreakfastType(int id, String typeName) {
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
