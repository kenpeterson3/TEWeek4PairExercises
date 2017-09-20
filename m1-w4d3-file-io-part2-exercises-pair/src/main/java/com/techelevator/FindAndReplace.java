package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

	public static void main(String[] args) {
		File tempFile = new File("temp.txt");

		Scanner fileInput = new Scanner(System.in);
		System.out.println("Please provide a file path. "); 
		String path = fileInput.nextLine();
		File aliceBook = new File(path);

		Scanner searchWordInput = new Scanner(System.in);
		System.out.println("What word would you like to find? ");
		String searchWordUser = searchWordInput.nextLine();


		Scanner replaceWordInput = new Scanner(System.in);
		System.out.println("What word would you like to replace it with? ");
		String replaceWordUser = replaceWordInput.nextLine();


		try(
				Scanner sc = new Scanner(aliceBook); 
				PrintWriter writer = new PrintWriter(tempFile)			
				) {
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				if (line.contains(searchWordUser)) {
					line = line.replace(searchWordUser, replaceWordUser);	
				}
				writer.println(line);
			}	
		} catch(FileNotFoundException e) {
			System.out.println("Your file does not exist.");
			System.exit(1);
		}



	}


}
	
	


