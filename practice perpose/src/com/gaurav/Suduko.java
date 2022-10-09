package com.gaurav;

import java.util.*;

public class Suduko{
    
    public void display(int[][] mat){
        for(int[] arr:mat){
            for(int i:arr){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
	int count = 0;
	public void check(int[][] sudo,int i,int j){
	    int curr = sudo[i][j];
	    int res = 0;
	    for(int k = 0; k < 9; k++){
	        if(sudo[i][k]==curr){
	            res++;
	        }
	    }
	    if(res > 1){
	        count++;
	        return;
	    }
	    res = 0;
	    for(int k = 0; k < 9; k++){
	        if(sudo[k][j]==curr){
	            res++;
	        }
	    }
	    if(res > 1){
	        count++;
	        return;
	    }
	     res = 0;
	    
	    int pi = i/3*3;
        int pj = j/3*3;
        for(int k = 0; k < 3; k++){
            for(int l = 0; l < 3; l++){
                if(sudo[pi+k][pj+l] == curr) res++;
            }
        }
        if(res > 1){
	        count++;
	        return;
	    }
        
	}

	public static void main(String[] args){
	    Suduko main = new Suduko();
		Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();
	    for(int k = 0; k < tc;k++){
	        int[][] suduko = new int[9][9];
	        for(int i = 0; i < 9;i++){
	            for(int j = 0; j < 9;j++){
	                suduko[i][j] = sc.nextInt();
	            }
	        }
	        for(int i = 0; i < 9; i++){
	            for(int j = 0; j < 9; j++){
	                main.check(suduko,i,j);
	            }
	        }
	        int ans = main.count;
	        System.out.println(ans);
	        main.count = 0;
	    }
	    sc.close();
	}	
}