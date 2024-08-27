package com.one.hc.models;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
public class Order extends BaseEntity{
	
	@NotBlank
	@NotNull
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "store_id")
	private Store store;
	
	private RefundMethod refundMethod;
	
	@NotNull
	@NotBlank
	private List<String> items;
	
	@NotNull
	@NotBlank
	private String description;

}
