package com.compositekey.sample.entity;



import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employee")
@Getter
@Setter
@Embeddable
public class EmployeeEntity {

	@Id
	@Column(name = "employee_id")
	private int employeeId;

	@Column(name = "name")
	private String name;
	
	@Column(name = "role")
	private String role;
	
	@Column(name = "department")
	private String department;

	@Column(name = "email")
	private String email;
	
	@Column(name = "company_id")
	private int companyId;
	
	@Column(name = "company_name")
	private String companyName;
	
	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "company_id", referencedColumnName = "id", insertable = false, updatable = false),
		@JoinColumn(name = "company_name", referencedColumnName = "name", insertable = false, updatable = false) })
	private CompanyEntity companyEntity;

}
