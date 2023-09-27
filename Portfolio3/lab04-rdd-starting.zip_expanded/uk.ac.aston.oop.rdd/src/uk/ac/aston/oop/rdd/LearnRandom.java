package uk.ac.aston.oop.rdd;

import java.util.Iterator;
import java.util.Random;

public class LearnRandom {

	public static void useRandom(Random rnd) {
		for (int i = 0; i < 10; i++) {
			double p = rnd.nextDouble();
			if (p <= 0.20) {
				System.out.println("The random event with probability 20% took place");
			}
			
		}
		
		for (int i = 0; i < 10; i++) {
			int roll0 = rnd.nextInt(6);
			System.out.println(roll0 + 1);
		
			
		}
		// TODO - write your code here
	}

	public static void main(String[] args) {
		Random rnd = new Random(42);

		// Don't change the line below!
		LearnRandom.useRandom(rnd);
	}
}
