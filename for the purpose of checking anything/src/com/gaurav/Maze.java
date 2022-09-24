package com.gaurav;

import java.util.*;

public class Maze{
    
    public void display(String[][] mat){
        for(String s[]:mat){
		    for(String str:s){
		        System.out.print(str);
		    }
		    System.out.println();
		}
    }
    
    boolean flag = false;
    
    int count = 0;
    public void maze(String[][] arr,int row,int col,int mrow,int mcol,int k){
//    	display(arr);
        System.out.println("row = "+row+" col = "+col+"  mrow= "+mrow+"  mcol= "+mcol+"  k= "+k+"  count= "+count);
        if(count == k && row == mrow && col == mcol){
            flag = true;
            return;
        }
        if(mrow<0 || mrow>=arr.length || mcol < 0 || mcol >= arr[0].length||arr[mrow][mcol].equals("*")){
            return;
        }
        arr[mrow][mcol] = "*";
        count++;
        maze(arr,row,col,mrow+1,mcol,k);
        maze(arr,row,col,mrow,mcol+1,k);
        maze(arr,row,col,mrow,mcol-1,k);
        maze(arr,row,col,mrow-1,mcol,k);
        count--;
        arr[mrow][mcol] = ".";
        return;
        
        
        //=======================================================
        // if(count == k-1 && mrow == row && mcol==col){
        //     flag = true;
        //     return;
        // }
        // if(mrow<0 || mrow>=arr.length || mcol < 0 || mcol >= arr[0].length||arr[mrow][mcol]=="*"){
        //     return;
        // }
        // arr[mrow][mcol]="*";
        // count++;
        // if(mrow+1 < arr.length){
        // maze(arr,col,row,mrow+1,mcol,k);
        // }
        // if(mrow-1>=0){
        // maze(arr,col,row,mrow-1,mcol,k);
        // }
        // if(mcol+1<arr[0].length){
        // maze(arr,col,row,mrow,mcol+1,k);
        // }
        // if(mcol-1>=0){
        // maze(arr,col,row,mrow,mcol-1,k);
        // }
        // count--;
        // arr[mrow][mcol]=".";
        // return;
    }
	

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();//row
		int M = sc.nextInt();//col
		int travel = sc.nextInt();
		int row = sc.nextInt();
		int col = sc.nextInt();
		String[][] mat = new String[N][M];
		for(int i = 0; i< N; i++){
		    for(int j = 0; j < M;j++){
		        mat[i][j] = sc.next();
		    }
		}
		
		Maze main = new Maze();
		System.out.println(row +"   "+col);
		main.maze(mat,row-1,col-1,row-1,col-1,travel);
		if(main.flag) System.out.println("YES");
		else System.out.println("NO");
	   // main.display(mat);
	}	
}
