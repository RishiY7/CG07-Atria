package com.tnsif.scannerclassdemotax;

public class Taxcalculation {
public void CalculateTax(Person p ) {
	if(p.getIncome()<15000) {
		p.setTax(0);
	}
	else if (p.getIncome()<=15000&&p.getIncome()<500000) {
		p.setTax(5);
	}
	else {
		p.setTax(10);
	}
}
}
