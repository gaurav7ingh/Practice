package com.gaurav;

public class BinaySearch {
	
	public static int search(int[] arr,int k) {
		int low = 0;
		int high = arr.length-1;
		int mid = (low+high)/2;
		int ans = -1;
		while(low <= high) {
			if(arr[mid]==k) { 
				if(arr[mid+1]!=arr[mid]) return mid;
				ans = mid;
				low = mid+1;
				mid = (low+high)/2;
			}
			else if(arr[mid]>k) {
				ans = mid;
				high = mid-1;
				mid = (low+high)/2;
			}else if(arr[mid]<k) {
				low = mid+1;
				mid = (low+high)/2;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,2,2,2,4,8,8,11,13,17};
		
		int ans = search(arr,6);
		
		System.out.println(ans);
	}
}
