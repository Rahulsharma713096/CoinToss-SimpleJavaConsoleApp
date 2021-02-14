package com.GenerateRandom;

import java.util.Random;

public class RandomNumberGenerate {
	public static int  RandomNumberGenerateNumber() {
	      Random rand = new Random(); //instance of random class
	      int upperbound = 101;
	        //generate random values from 0-24
	      int int_random = rand.nextInt(upperbound); 
	      return int_random;
	    
	    }
	
}
