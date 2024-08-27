package com.one.hc.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "stores")
@Getter
@Setter
@NoArgsConstructor
public class Store extends BaseEntity{
	
	@NotBlank
	@NotNull
	private String name;

	@OneToMany(mappedBy="store", fetch = FetchType.LAZY)
	private List<Order> orders;
	
	@ManyToMany(mappedBy = "client", fetch = FetchType.LAZY)
	@JoinColumn(name = "client_id")
	private List<Client> clients;
	
}
