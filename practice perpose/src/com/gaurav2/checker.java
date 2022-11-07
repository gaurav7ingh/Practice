package com.gaurav2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class checker {
	public static void main(String[] args) {
		
		Queue<Integer> queue = new PriorityQueue<>();
		
		queue.add(1);
		queue.add(2);
		System.out.println(queue.poll());
		
	}
}
