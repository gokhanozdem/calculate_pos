package com.pos.calculate.calc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pos.calculate.calc.model.calculationModel;
import com.pos.calculate.calc.service.calculateService;

@RestController
@RequestMapping("calculate")
public class calculateAmount {

	@Autowired
	calculateService calcServ;
	
	@RequestMapping("/string")
	public calculationModel calculation(@RequestParam(value = "totalAmount") String totalAmount, @RequestParam(value="tenderedAmount") String tenderedAmount ) {
		
		return calcServ.calculation(totalAmount, tenderedAmount);
	}
}
