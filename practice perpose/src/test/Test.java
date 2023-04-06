package test;

public class Test {
	
	private static void sortByWeight(int n, int[][] arr) {
		for(int i = 0; i<n-1; i++) {
			for(int j = 0; j<n-i-1; j++) {
				if(arr[j][1]>arr[j+1][1]) {
					swap(arr[j],arr[j+1]);
				}
			}
		}
	}

	private static void display(int[][] arr) {
		for(int i = 0; i<8; i++) {
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
	}

	private static void sortByHight(int n, int[][] arr) {
		for(int i = 0; i<n-1; i++) {
			for(int j = 0; j<n-i-1; j++) {
				if(arr[j][0]<arr[j+1][0]) {
					swap(arr[j],arr[j+1]);
				}
			}
		}
	}

	private static void swap(int[] ar, int[] arr) {
		int hight = ar[0];
		int weight = ar[1];
		ar[0] = arr[0];
		ar[1] = arr[1];
		arr[0] = hight;
		arr[1] = weight;
	}
	
	public static void main(String[] args) {
		int n = 10;
		int[][] arr = {{158,85},{168,74},{148,65},{182,84},{182,84}
		,{175,88},{180,89},{182,77},{174,85},{184,75}};
		sortByWeight(n,arr); 
		sortByHight(n,arr);
		display(arr);
	}
	
}
