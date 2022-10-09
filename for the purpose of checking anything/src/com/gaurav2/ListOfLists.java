package com.gaurav2;

import java.util.ArrayList;
import java.util.List;

public class ListOfLists {
	
	public static void main(String[] args) {
		List<List<Integer>> arr = new ArrayList<>();
		
		for(int i = 0; i < 3;i++) {
			List<Integer> l = new ArrayList<>();
			for(int j = 0; j < 3;j++) {
				l.add(j);
			}arr.add(l);
		}
		int leftDiagonal = 0;
        int rightDiagonal = 0;
       
        for(int i = 0,j = 0; i < arr.size()&& j < arr.get(0).size();i++,j++){
            leftDiagonal+=arr.get(i).get(j);
        } 
        
        for(int i = 0,j = arr.get(0).size()-1; i < arr.size() && j >= 0; i++,j--) {
        	rightDiagonal += arr.get(i).get(j);
        }
        System.out.println(leftDiagonal);
        System.out.println(rightDiagonal);
	}
	
}
