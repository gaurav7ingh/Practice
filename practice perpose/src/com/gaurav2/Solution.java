package com.gaurav2;

import java.io.*;
import java.util.*;

public class Solution {

    static int B , H;
    
    static{
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        
        if(B <= 0 || H <= 0) System.out.println("java.lang.Exception: Breadth and height must be positive");
        
        else System.out.println(B*H);
    }
    
    public static void main(String[] args) {
     Date date = new Date(2022, 10, 12);
     System.out.println( date.getDay());
    }
}
