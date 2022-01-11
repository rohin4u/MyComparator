package com;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		TreeSet set = new TreeSet(new DemoComparator());
		
		set.add(60);
		set.add(40);
		set.add(30);
		set.add(60);
		set.add(20);
		set.add(70);
		set.add(100);
		System.out.println(set);

	}

}
