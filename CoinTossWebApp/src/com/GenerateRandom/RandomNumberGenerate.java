package com.GenerateRandom;

import java.util.Random;

public class RandomNumberGenerate {
	 private static int int_random;
	private static double double_random;
	private static float float_random;

	public RandomNumberGenerate() {
	      Random rand = new Random(); //instance of random class
	      int upperbound = 101;
	        //generate random values from 0-24
	      int_random = rand.nextInt(upperbound); 
	      double_random=rand.nextDouble();
	      float_random=rand.nextFloat();
	      
	      //Random integer value from 0 to"  (upperbound-1) or 100  --> int_random
	     //Random float value between 0.0 and 1.0 --->float_random
	    //Random double value between 0.0 and 1.0 ---->double_random
	      
	      
	    }
	
	
	//Geter and setter

	public static int getInt_random() {
		return int_random;
	}

	public static void setInt_random(int int_random) {
		RandomNumberGenerate.int_random = int_random;
	}

	public static double getDouble_random() {
		return double_random;
	}

	public static void setDouble_random(double double_random) {
		RandomNumberGenerate.double_random = double_random;
	}

	public static float getFloat_random() {
		return float_random;
	}

	public static void setFloat_random(float float_random) {
		RandomNumberGenerate.float_random = float_random;
	}
}
