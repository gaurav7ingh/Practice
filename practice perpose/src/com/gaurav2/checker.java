package com.gaurav2;

import java.util.HashMap;
import java.util.Map;

public class checker {
	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 1);
		map.put(1, map.getOrDefault(1, 0)+1);
		
		
	}
}
