package com.gaurav;

import java.io.File;
import java.io.IOException;

public class AddingFilesForAssingments {

	public static void main(String[] args) {
		for(int i = 6; i <= 20; i++) {
			File file = new File("C:\\Users\\Gaurav Singh\\Desktop\\Gaurav_fw19_0340\\unit-5\\sprint-4\\day-1\\assignments\\ans "+i+".txt");
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
