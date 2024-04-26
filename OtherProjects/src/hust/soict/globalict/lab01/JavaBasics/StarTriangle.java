package hust.soict.globalict.lab01.JavaBasics;

import java.util.Scanner;

public class StarTriangle {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the height of the triangle: ");
	        int height = scanner.nextInt();
	        displayTriangle(height);
	        
	        scanner.close();
	    }

	    public static void displayTriangle(int height) {
	        for (int row = 1; row <= height; row++) {
	            for (int spaces = 1; spaces <= height - row; spaces++) {
	                System.out.print(" ");
	            }
	            for (int stars = 1; stars <= row * 2 - 1; stars++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	}