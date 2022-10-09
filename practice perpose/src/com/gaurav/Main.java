package com.gaurav;
import java.util.*;
import java.util.function.Function;

public class Main{
	
	
	
    public static void print(int n,int i,String res,List<String> ans){
        if(i>n){
            ans.add(res);
            return;
        }
        String res1 = res;
        String res2 = res;
        
        res2+=i+" ";
        
        print(n,i+1,res1,ans);
        print(n,i+1,res2,ans);
        
    }

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		List<String> ans = new ArrayList<>();
		
		print(i,1,"",ans);
		
		
		
		for(String str: ans){
		    System.out.println(str);
		}
	}

	
}