package com.gaurav;

import java.util.ArrayList;
import java.util.List;

public class SortAnArray {
	
	void sort(List<Integer> arr) {
		if(arr.size()==1) {
			return;
		}
		int temp = arr.remove(arr.size()-1);
		sort(arr);
		insert(arr,temp);
		
	}
	
	void insert(List<Integer> arr,int temp) {
		if(arr.size() == 0 || arr.get(arr.size()-1)<=temp) {
			arr.add(temp);
			return;
		}
		int i = arr.remove(arr.size()-1);
		insert(arr, temp);
		arr.add(i);
		return;
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(4);
		list.add(6);
		list.add(1);
		
		SortAnArray sortAnArray = new SortAnArray();
		
		sortAnArray.sort(list);
		
		for(int i: list) {
			System.out.println(i+" ");
		}
		
	}
}
