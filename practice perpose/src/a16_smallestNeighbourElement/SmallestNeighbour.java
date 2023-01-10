package a16_smallestNeighbourElement;

import java.util.Stack;

public class SmallestNeighbour {
	
	public static void main(String[] args) {
		int N = 5;
		int[] arr = {1, 2, 5, 3, 5};
		
		findNearestSmallerElement(N,arr);
	}

	static void findNearestSmallerElement(int n, int[] arr) {
		
		int[] right = new int[n];
		for(int i = n-1;i>=0; i--) {
			while(!st.isEmpty() && arr[i]>=arr[st.peek()]) {
				st.pop();
			}
			if(st.isEmpty())
				right[i] = -1;
			else 
				right[i] = st.peek();
			st.push(i);
		}
		
		for(int i = 0;i<n; i++) {
			
		}
	}
	
	static int[] smallerToTheLeft(int n, int[] arr) {
		Stack<Integer> st = new Stack<>();
		int[] left = new int[n];
		for(int i = 0;i<n; i++) {
			while(!st.isEmpty() && arr[i]>=arr[st.peek()]) {
				st.pop();
			}
			if(st.isEmpty())
				left[i] = -1;
			else 
				left[i] = st.peek();
			st.push(i);
		}
		return left;
		
	}
	
	static int[] smallerToTheRight(int n,int[] arr) {
		Stack<Integer> st = new Stack<>();
		int[] right = new int[n];
		for(int i = n-1;i>=0; i--) {
			while(!st.isEmpty() && arr[i]>=arr[st.peek()]) {
				st.pop();
			}
			if(st.isEmpty())
				right[i] = -1;
			else 
				right[i] = st.peek();
			st.push(i);
		}
		return right;
	}
	
}
