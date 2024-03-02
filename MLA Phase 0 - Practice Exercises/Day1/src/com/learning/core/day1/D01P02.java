package com.learning.core.day1;

public class D01P02 {
	public static void main(String[] args) {
		MedicineInfo O=new Ointment();
		MedicineInfo S=new Syrup();
		MedicineInfo T=new Tablet();
		O.displayLabel();
		S.displayLabel();
		T.displayLabel();
	}
}
