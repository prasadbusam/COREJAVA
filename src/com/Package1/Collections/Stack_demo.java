package com.Package1.Collections;

import java.util.Stack;

public class Stack_demo {

	public static void main(String[] args) {
		Stack<Object> stack=new Stack<Object>();
		stack.push("prasad");
		stack.add("janu");
		stack.push("bhanu");
		stack.push("syam");
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());

	}

}
