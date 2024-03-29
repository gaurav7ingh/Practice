package a22_slidingWindowMaximum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
	
	public static List<Integer> slidingWindowMaximum(int[] arr, int k){
		if (k > arr.length) return new ArrayList<>();
		List<Integer> ans = new ArrayList<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (int i=0;i<arr.length;i++){
			pq.add(arr[i]);
			if (pq.size() == k) {
                ans.add(pq.peek());
                pq.remove(arr[i-k+1]);
            }
		}
		return ans;
	}
	
	public static void main(String args[]){
		int arr[] = {1,2,3,1,4,5};
		int k = 3;
		List<Integer> ans = slidingWindowMaximum(arr,k);
		for (Integer i : ans) System.out.print(i + " ");
	}
}
