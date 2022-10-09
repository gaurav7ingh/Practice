package com.gaurav2;

import java.math.BigInteger;
import java.util.Scanner;

public class checker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger b = new BigInteger("0");
		b = new BigInteger("11");
		BigInteger result = b.mod(BigInteger.TEN);
		System.out.println(result);
		System.out.println(result.equals(new BigInteger("0")));
	}
}
