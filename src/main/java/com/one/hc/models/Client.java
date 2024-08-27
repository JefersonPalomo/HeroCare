package com.one.hc.models;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "clients")
@Getter
@Setter
@NoArgsConstructor
public class Client extends BaseEntity{

	@NotNull
	@NotBlank
	@Size(min = 1, max = 20)
	private String name;
	
	@Min(10)
	@Max(10)
	@NotNull
	private int phoneNumber;
	
	@NotNull
	@NotBlank
	@Size(min = 1, max = 255)
	private String postDeliveryIssue;
	
	@ManyToMany(mappedBy="client", fetch = FetchType.LAZY)
	private List<Store> stores;
	
}
