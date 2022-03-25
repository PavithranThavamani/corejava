package com.online.checkedExceptionFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) {
		System.out.println("Program started...");
		File file = new File("File");
		try {
			FileReader fr = new FileReader(file);
			int data = fr.read();
//			while(data != -1) {
			while(data >0) {
				System.out.print((char) data);
				data = fr.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("File does not exist");
		} catch (IOException e) {
			System.out.println("No data exist");
		}
		System.out.println("\nProgran ended...");
	}
}
