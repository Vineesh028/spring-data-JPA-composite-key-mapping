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
public class EmployeeEntityentityPK implements Serializable{
	
	private static final long serialVersionUID = -3142904869329240017L;
	private int employeeId;
	private String name;
}


