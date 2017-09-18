package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class KataStringCalculator {
	
	public int add(int[] output) {

		int x = 0;

		for (int i = 0; i < output.length; i++) {

			x += output[i];
		}
		return x;
	}


	public int[] output(String numbers) { 
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
	