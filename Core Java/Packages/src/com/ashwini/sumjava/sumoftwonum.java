package com.ashwini.sumjava;
import java.util.*;
import static java.lang.Math.*; 

public class sumoftwonum {

	public static void main(String[] args) {
		System.out.println("Enter 2 integers");
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int res = a+b;
		System.out.println(res);
		float sqroot = (float)sqrt(res);
		System.out.println(sqroot);
	}
}
