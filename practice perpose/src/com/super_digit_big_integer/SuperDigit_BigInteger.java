package com.super_digit_big_integer;

import java.math.BigInteger;
import java.util.Scanner;

public class SuperDigit_BigInteger {
	public BigInteger superDigit(BigInteger num){
	    if(num.divide(BigInteger.TEN).equals(BigInteger.ZERO)) 
	        return num;
	        
	    BigInteger sum = BigInteger.ZERO;
	    while(!num.divide(BigInteger.TEN).equals(BigInteger.ZERO)){
	        sum=sum.add(num.mod(BigInteger.TEN));
	        num=num.divide(BigInteger.TEN);
	    }
	    
	    if((sum.add(num)).divide(BigInteger.TEN).equals(BigInteger.ZERO)) 
	        return sum.add(num);
	    else 
	        sum=superDigit(sum.add(num));
	    return sum;
	}

	public static void main(String[] args){
	    SuperDigit_BigInteger main = new SuperDigit_BigInteger();
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		sc.nextLine();
		for(int i =0; i < tc; i++){
		    BigInteger n = new BigInteger(sc.next());
		    BigInteger ans = main.superDigit(n);
		    System.out.println(ans);
		}
	
	}	
}