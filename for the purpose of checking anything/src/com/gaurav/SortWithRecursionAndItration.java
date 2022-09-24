package com.gaurav;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortWithRecursionAndItration {
	
	public void sort(List<Integer> arr) {
		if(arr.size()==1)
			return;
		
		int temp = arr.remove(arr.size()-1);
		sort(arr);
		//insert(arr,temp);
		if(temp>arr.get(arr.size()-1)) {
			arr.add(temp);
			return;
		}
		for(int i = 0; i< arr.size(); i++) {
			if(arr.get(i)>=temp) {
				arr.add(i,temp);
				return;
			}
		}
	}
	
	public void insert(List<Integer> arr, int temp) {
		if(arr.isEmpty() || arr.get(arr.size()-1)<temp) {
			arr.add(temp);
			return;
		}
		int anothertemp = arr.remove(arr.size()-1);
		insert(arr,temp);
		arr.add(anothertemp);
		return;
	}
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		Collections.addAll(arr, 5,2,3,4,5,9,3,8,1);
		SortWithRecursionAndItration main = new SortWithRecursionAndItration();
		arr.add(0, 8);
		System.out.println(arr);
		main.sort(arr);
		System.out.println(arr);
	}
}
