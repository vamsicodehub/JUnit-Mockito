package com.vamsi.junit.src;

public class JunitSrc {

	public Integer largeNumber(int[] input) {
		int longest = Integer.MIN_VALUE;
		for(int i : input) {
			if(i > longest)
				longest = i;
		}
		return longest;
	}
}
