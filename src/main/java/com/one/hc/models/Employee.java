package com.one.hc.models;

import java.util.List;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Employee extends BaseEntity{
	
	@NotBlank
	@NotNull
	private String name;
	
	@OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
	private List<Ticket> tickets;
	
}
