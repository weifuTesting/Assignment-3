package com.IT7320.A3_PartA;

public class TaxImplementation {
	ITax obj;
	
	public double computeTax(double income) {
		return obj.computeTax(income);
	};
	public void setObj(ITax obj) {
		this.obj = obj;
	}
	public double weeklySalary(Employee income) {
		return obj.weeklySalary(income);
	}
	public double fortnightSalary(Employee income) {
		return obj.fortnightSalary(income);
	}
	public double computeKiwiSaver(Employee income) {
		return obj.computeKiwiSaver(income);
	}

}
