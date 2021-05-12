package com.cesarsturmer.dsvendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cesarsturmer.dsvendas.dto.SaleDTO;
import com.cesarsturmer.dsvendas.dto.SaleSuccessDTO;
import com.cesarsturmer.dsvendas.dto.SaleSumDTO;
import com.cesarsturmer.dsvendas.entities.Sale;
import com.cesarsturmer.dsvendas.repositories.SaleRepository;
import com.cesarsturmer.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository ;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupeBySeller() {
		return repository.amountGroupeBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupeBySeller() {
		return repository.successGroupeBySeller();
	}
}


