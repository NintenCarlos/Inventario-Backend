package com.company.inventario.model;
import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table (name = "category")


public class Category implements Serializable {	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	/* Los Elementos que va a llevar la tabla. */
	private Long id;  /* Long => Entero largo */
	private String name;
	private String description;
}