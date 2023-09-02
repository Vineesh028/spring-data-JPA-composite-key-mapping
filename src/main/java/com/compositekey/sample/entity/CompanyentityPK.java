package com.compositekey.sample.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CompanyentityPK implements Serializable{
	
	private static final long serialVersionUID = 6663761700733185242L;
	private int id;
	private String name;
}


