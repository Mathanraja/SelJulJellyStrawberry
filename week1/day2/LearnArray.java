package week1.day2;

import java.util.Arrays;

public class LearnArray {
	public static void main(String[] args) {
		
//		int[] age = {1,2,3,4,5,6,7,8,9,10};
		
		/*
		 * int[] age = new int[6]; age[0]=30; age[1]=45;
		 */
		String[] address = new String[5];
		
		String[] participants = {"Gopi","Swapna","Mohana","Balaji","Hari"};
		int size = participants.length;
		System.out.println(size);
		Arrays.sort(participants);
		
		for (String name : participants) {
			System.out.println(name);
		}
		
		int[] age = {100,34,145,56,670,78};
		Arrays.sort(age);
		for (int eachAge : age) {
			System.out.println(eachAge);
		}
		
		
		
		
		
		/*
		 * for (int i = size-1; i>=0; i--) { System.out.println(participants[i]); }
		 */
	}

}
