package com.talha.assginmentTwo;

import java.util.Scanner;

public class Commission {
	String name, address, phone;
	int salesAmount,commission;
	Scanner sc  = new Scanner(System.in);
	public void acceptDetails() {
		System.out.println("Enter your name:");
		name=sc.nextLine();
		System.out.println("Enter your address:");
		address=sc.nextLine();
		System.out.println("Enter your phone number");
		phone=sc.nextLine();
		System.out.println("Enter your sales amount:");
		salesAmount=sc.nextInt();
	}
	public void calculateCommission() {
		if (salesAmount>=100000)
			commission= salesAmount*10/100;
		else if(salesAmount>=50000)
			commission= salesAmount*5/100;
		else if(salesAmount>=30000)
			commission= salesAmount*3/100;
		else
			commission=0;
		System.out.println("The total commision on you sales amount is:"+commission);
	}
	public static void main(String[] args) {
		Student obj=new Student();
		Commission object=new Commission();
		object.acceptDetails();
		object.calculateCommission();
	}
}
