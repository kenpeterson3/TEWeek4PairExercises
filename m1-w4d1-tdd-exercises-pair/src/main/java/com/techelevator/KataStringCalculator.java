package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class KataStringCalculator {
	
//	public static void main(String[] args){
//		String[] temp=("").split(",");
//		//int[] a=output("");
//		System.out.println(temp.length);
//	}
	
	public static int add(int[] output) {

		int x = 0;

		for (int i = 0; i < output.length; i++) {

			x += output[i];
		}
		return x;
	}


	public static int[] output(String numbers) { 
		int[] output;
		if (numbers.startsWith("//")) {
			
		String delimiter = numbers.substring(2,3);
		String[] temp=numbers.split(delimiter);
		output=new int[temp.length];
		
			if(temp[0]!=""){
				for (int i = 0; i < temp.length ; i++) {
					output[i] = Integer.parseInt(temp[i]);
				}	
			}
			
		} else {
			
		String[] temp=numbers.split(",|/n");
		output=new int[temp.length];
		
			if(temp[0]!=""){
				for (int i = 0; i < temp.length ; i++) {
					output[i] = Integer.parseInt(temp[i]);
				}	
			}
			
		}
		return output;
	}	
	
}
	
	//public static void main(String[] args) {}
	
//		public int add(String numbers) {
//		int total;
//			if (numbers.isEmpty()) {
//				total = 0;
//				return total;
//				
//			} else {
//				
//				return ;
//			}
//		
//		}
//		
//		public String[] splitOurString(String numbers) {
//			
//			List<Integer> processString = new ArrayList<>();
//			
//			for (int i = 0; i < numbers.length(); i++) {
//				String[] output = numbers.split(",");
//				
//			return output;	
//			}
//			
//		public int parseOutput(String output)	{			
//			
//			
//			
//		}
//			
//		}
//		
		
		
		

