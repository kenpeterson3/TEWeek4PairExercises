package com.techelevator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		
		File inputFile = getInputFileFromUser();
		String word = wordToSearch();
		searchThingy(inputFile, word);
		
//		try (Scanner fileScanner = new Scanner(inputFile)) {
//		//	while (fileScanner.hasNextLine()) {
//				
//				
//			//}
//		} catch (FileNotFoundException e) {
//			System.out.println("Your file doesn't exist");
//		}
	}

	private static File getInputFileFromUser() {
		@SuppressWarnings("resource")
		Scanner fileInput = new Scanner(System.in);
		System.out.println("Please enter file path");
		String path = fileInput.nextLine();

		File inputFile = new File(path);
		if (!inputFile.exists()) {
			System.out.println(path + " Does not exist");
			System.exit(1);

		} else if (!inputFile.isFile()) {
			System.out.println(path + " is not a file");
			System.exit(1);

		}
		return inputFile;
	}

	public static String wordToSearch() {
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter a word to search");
		String searchWord = userInput.nextLine();

		return searchWord;

	}

	public static String searchThingy(File inputFile, String searchWord) {

		try (Scanner input = new Scanner(inputFile)) {
			int x = 0;
			while (input.hasNextLine()) {
				
				x++;
				String line = input.nextLine();
				if (line.toLowerCase().contains(searchWord.toLowerCase())) {
					System.out.println(x + ") " + line);
				} else {
					
				}

			}
		} catch (FileNotFoundException e) {
			System.out.println("Your file doesn't exist");
		}
		return "";
	}

}
