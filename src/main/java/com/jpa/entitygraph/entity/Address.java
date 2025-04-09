package com.jpa.entitygraph.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class Address
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	String city;
	String state;
	String zipCode;

	@ManyToOne
	@JoinColumn(name = "customer_id")
	@JsonBackReference
	Customer customer;
}
