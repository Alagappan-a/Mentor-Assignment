package org.ZohoSchoolGraduateTraining;

public class SwapBitWise {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		a=a^b;
		b=b^a;
		a=b^a;
		System.out.println(a+"\n"+b);
	}

}
