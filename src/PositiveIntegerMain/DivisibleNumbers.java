package PositiveIntegerMain;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public  class DivisibleNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		List<Integer> o1 = new LinkedList<Integer>();
		List<Integer> o2 = new LinkedList<Integer>();
		List<Integer> o3 = new LinkedList<Integer>();
		List<Integer> o4 = new LinkedList<Integer>();
		
		for(int i=num1;i<=num2;i++) {
			
			if(i%3==0 && i%5==0) {
				o2.add(i);
			}
			
			if(i%3==0 || i%5==0) {
				o1.add(i);
			}
			
			if(i%3==0 && i%5!=0) {
				o3.add(i);
			}
			if(i%5==0 && i%3!=0) {
				o4.add(i);
			}
		}
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
		System.out.println(o4);
		
		
	}

}

