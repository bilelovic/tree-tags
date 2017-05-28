package com.bilelovic.tree.back.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tags")
public class Tag {

	@Id
	private String code;
	private String name;
	private String parentCode;
	
	public Tag() {
	}
	
	public Tag(String code, String name, String parentCode) {
		super();
		this.code = code;
		this.name = name;
		this.parentCode = parentCode;
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getParentCode() {
		return parentCode;
	}
	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}
	
}
