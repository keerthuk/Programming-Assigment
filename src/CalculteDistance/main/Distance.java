package CalculteDistance.main;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String givenPath = sc.nextLine();
		
		
		String allowedChars ="nNeEwWsS";
		int count=0;
		
		
		for(char direction:givenPath.toCharArray()) {
			if(allowedChars.contains(String.valueOf(direction))) {
				count++;		
			}else {
				System.exit(0);
			}
		}
		System.out.println(count);
		

	}

}
