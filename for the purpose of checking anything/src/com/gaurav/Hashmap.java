package com.gaurav;

import java.util.HashMap;

public class Hashmap {
	
	public static void main(String[] args) {
		HashMap<Student, Integer> hashMap = new HashMap<>();
		
		hashMap.put(new Student(1,"ravi",100,"ravi","123"), 1);
		hashMap.put(new Student(1,"ravi",100,"ravi","123"), 1);
		
		System.out.println(hashMap);
	}
}
