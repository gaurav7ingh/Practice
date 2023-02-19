package a25_distinctDigit;

import java.util.*;

public class Solution{
    
    public static String findDistinct(int start, int end){
        for(Integer i = start; i<=end; i++){
            String s = i.toString();
            boolean ans = isValid(s);
            if(ans)
                return s;
        }
        return "-1";
    }
    
    public static boolean isValid(String s){
        Set<Character> set = new HashSet<>();
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i); 
            if(set.contains(c))
                return false;
            else
                set.add(c);
        }
        return true;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int start = sc.nextInt();
            int end = sc.nextInt();
            String ans = findDistinct(start,end);
            System.out.println(ans);
        }
    }
    
}
