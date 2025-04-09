package com.jpa.entitygraph.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.entitygraph.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long>
{
}
