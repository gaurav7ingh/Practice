package com.gaurav;

import java.util.Scanner;

public class SqureRoot {
	 public long squreRoot(long low,long high,long num){
	        if(low>high) return Math.min(low,high);
	        long mid = low + (high - low)/2;
	        System.out.println("low "+low +" high-"+high+" num - "+num);
	        if(mid*mid==num){
	            return mid;
	        }else if(mid*mid>num) return squreRoot(low,mid-1,num);
	        else return squreRoot(mid+1,high,num);
	    }
	    
	    
	    public static void main(String[] args){
	        SqureRoot main = new SqureRoot();
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        for(int i = 0; i < n; i++){
	            int num = sc.nextInt();
	            long ans = main.squreRoot(0,num,num);
	            System.out.println(ans);
	        }
	    }
	}