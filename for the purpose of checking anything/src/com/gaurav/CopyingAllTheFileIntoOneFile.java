package com.gaurav;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class CopyingAllTheFileIntoOneFile {
	
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Gaurav Singh\\Desktop\\Gaurav_fw19_0340\\unit-5\\sprint-4\\day-1\\assignments\\Basic SQL I.txt");
		for(int i = 1; i <=20; i++) {
			FileInputStream fis = new FileInputStream("C:\\Users\\Gaurav Singh\\Desktop\\Gaurav_fw19_0340\\unit-5\\sprint-4\\day-1\\assignments\\ans "+i+".txt");
			String str = "\n\n\n\n"+i+". =====\n\n\n";
			fos.write(str.getBytes());
			int c;
			while((c =fis.read())!=-1) {
				fos.write((char)c);
			}
			
			fis.close();
			System.out.println("file no ==="+ i +"=== is updated in new file" );
		}
		fos.close();
		
	}
}
