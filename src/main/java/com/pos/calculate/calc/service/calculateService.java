package com.pos.calculate.calc.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.pos.calculate.calc.model.calculationModel;

@Service
public class calculateService {

	public calculationModel calculation(String totalAmount, String tenderedAmount ) {
			HashMap<String, String> inputAdd = new HashMap<String, String>();
			inputAdd.put("totalAmount", totalAmount);
			inputAdd.put("tenderedAmount", tenderedAmount);
			
			HashMap<String, String> outputAdd = new HashMap<String, String>();
			double amtTotal = Double.parseDouble(totalAmount);
			double amtTendered = Double.parseDouble(tenderedAmount);
			double amtDue = 0;
			double amtPaid = 0;
			double changeDue = 0;
			if (amtTotal > amtTendered) {
				amtDue = amtTotal - amtTendered;
				amtPaid = amtTendered;
			}else {
				changeDue = amtTendered - amtTotal;
				amtPaid = amtTotal;
			}
			outputAdd.put("dueAmount", Double.toString(amtDue));
			outputAdd.put("paidAmount", Double.toString(amtPaid));
			outputAdd.put("changeDueAmount", Double.toString(changeDue));
			return new calculationModel(inputAdd,outputAdd);
		}

}
