package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
	
		fileImporter();
		

	}
	
	public static void fileImporter() {
		int wordCount = 0;
		int sentenceCount = 0;
		File alice = new File("/Users/richardhresko/workspace/team7-java-week-4-pair-exercises/m1-w4d2-file-io-part1-exercises-pair/alices_adventures_in_wonderland.txt");
		try(Scanner input = new Scanner(alice)) {
			while(input.hasNextLine()) {
				String line = input.nextLine();
				if (! line.isEmpty()) {
					String[] aliceArray = line.trim().split("\\s+");
					wordCount += aliceArray.length;	
					if(line.contains("!") || line.contains("?") || line.contains(".")) {
						sentenceCount++;
					}
				}
					
			}
		} catch(FileNotFoundException e) {
			System.out.println("Your file does not exist");
		}
		System.out.println(wordCount);
		System.out.println(sentenceCount);
	
	}
}
