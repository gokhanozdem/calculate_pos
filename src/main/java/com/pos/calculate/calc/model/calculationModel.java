package com.pos.calculate.calc.model;

import java.util.HashMap;

public class calculationModel {

	private HashMap<String, String> input;
	private HashMap<String, String> output;
	
	public calculationModel(HashMap<String, String> input, HashMap<String, String> output) {
		super();
		this.input = input;
		this.output = output;
	}
	
	public HashMap<String, String> getInput() {
		return input;
	}

	public void setInput(HashMap<String, String> input) {
		this.input = input;
	}

	public HashMap<String, String> getOutput() {
		return output;
	}

	public void setOutput(HashMap<String, String> output) {
		this.output = output;
	}

}
