package com.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Product
{

	 @Id
	    private Long id;
	    private String name;
	    
	    @Column(columnDefinition = "TEXT")
	    private String description;
	    private Double price;
}
