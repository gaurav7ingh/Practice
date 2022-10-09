package com.gaurav2;

public class Shape {
	int length;
    int breadth;
    
    public Shape(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    
    public void area(){
        System.out.println(length*breadth);
    }
}
