package com.payilagam.javabasics;

import java.util.Scanner;

public class LoopProgram {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		 int count =0; 
		 System.out.println("Value please");
		 Scanner scannerObj = new Scanner(System.in);
		 int maxCount = scannerObj.nextInt(); 
		 //I am starting my for loop here
		// while(count<maxCount){
		for(count=0;count<maxCount;count++){
		System.out.print("Please enter marks");
		int english = scannerObj.nextInt(); 
		int maths = scannerObj.nextInt();
		double science = scannerObj.nextFloat(); 
		double total = english + maths + science; 
		System.out.println("TotalMark is " + total);
		//count = count+1; 
		}

	}

}
