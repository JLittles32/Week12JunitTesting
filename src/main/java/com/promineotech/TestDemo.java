package com.promineotech;

import java.util.Random;

public class TestDemo {

	public int addPositive(int a, int b) {
		
		if(a > 0 && b > 0) {
			return a + b;
		} else {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
	}

	int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1;
	}
	int randomNumberSquared() {
		int result = getRandomInt();
		return result * result;
	}
	
	int addNumbers(int a, int b) {
		int sum = (a + b);
		return sum;
		
	}
	
}
