package com.demo;

public class StringReversalUsingReduce {

	public static void main (String [] args) {
		String input="input";
		String i=	input.chars()
        .mapToObj(c -> String.valueOf((char) c))
        .reduce((s1, s2) -> s2 + s1)
        .orElse("");
		System.out.println(i);
	}
}
