package com.talha.assignmentthree;

public class Main {
	 public static void main(String[] args) {
	        State state = new State();
	        System.out.println("Level One:");
	        state.displayContinentDetails();
	        System.out.println();
	        System.out.println("Level Two:");
	        state.displayCountryDetails();
	        System.out.println();
	        System.out.println("Level Three:");
	        state.displayStateDetails();
	    }
}
