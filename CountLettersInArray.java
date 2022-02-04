package com.atcs.main;
import java.util.Random;

public class CountLettersInArray {

	public static void main(String[] args) {
	//declare and create array
	char[] chars = createArray();
	//display array
    System.out.println("the letters are:");
    displayArray(chars);
	//count the occurence of letter
    int[] counts = countLetters(chars);
    //display counts
    System.out.println();
    System.out.println("the occurence of letter:");
    displayCounts(counts);
	}
	
	//create an array of character
	public static char[] createArray() {
		//declare an array of character
		char[] chars = new char[100];
		Random generator = new Random();
		
		String A ="abcdefghijklmnopqrstuvwxyz";
		//create lowercase letters and assign
		for(int i=0;i< chars.length;i++) 
			chars[i] = (char) A.charAt(generator.nextInt(26));
			//return the array
			return chars;
		}
    //display the array the character
		public static void displayArray(char[] chars) {
			// Display the characters in the array 20
			for (int i=0;i<chars.length;i++) {
				if((i+1)%20==0)
					System.out.println(chars[i] + " ");
				else
					System.out.println(chars[i] + " ");
			}
		}
		//count the occurence
		public static int[] countLetters(char[] chars) {
			//declare and create an array of 20 int
			int[] counts = new int[26];
			//for every letter count it
			for (int i = 0;i < chars.length;i++)
				counts[chars[i] - 'a']++;
			return counts;
		}
		//display counts
		public static void displayCounts(int[]counts) {
			for(int i=0;i<counts.length;i++) {
				if((i + 1)% 10 == 0)
					System.out.println(counts[i]+ " " + (char)(i+'a'));
				else 
					System.out.println(counts[i]+ " " + (char)(i+'a'));
			}
		}
	}
	