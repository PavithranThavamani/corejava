package com.onebill.throwss;

import java.io.File;
import java.io.IOException;

public class Vignesh {

	
	public static void main(String[] args) {
		Me me = new Me();
		File file = new File("File");
		String task;
		try {
			task = me.task(file);
			System.out.println(task);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
