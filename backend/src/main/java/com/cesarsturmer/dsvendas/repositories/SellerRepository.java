package com.cesarsturmer.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesarsturmer.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
