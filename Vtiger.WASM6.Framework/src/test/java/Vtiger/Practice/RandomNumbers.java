package Vtiger.Practice;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		Random ran = new Random();
		int random = ran.nextInt(500);
		System.out.println(random);
		int value1 = RandomNumbers.add(random,20);
		System.out.println(value1);

	}
	
	public static int add(int a, int b)
	{
		int c = a + b;
		return c;
	}

}
