package com.cesarsturmer.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesarsturmer.dsvendas.dto.SaleDTO;
import com.cesarsturmer.dsvendas.dto.SaleSuccessDTO;
import com.cesarsturmer.dsvendas.dto.SaleSumDTO;
import com.cesarsturmer.dsvendas.service.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
		Page<SaleDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/amount-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupeBySeller(){
		List<SaleSumDTO> list = service.amountGroupeBySeller();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/success-by-seller")
	public ResponseEntity<List<SaleSuccessDTO>> successGroupeBySeller(){
		List<SaleSuccessDTO> list = service.successGroupeBySeller();
		return ResponseEntity.ok(list);
	}
	
}
