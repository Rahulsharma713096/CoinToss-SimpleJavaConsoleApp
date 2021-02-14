package com.CoinTossPack;

import java.util.Scanner;

import com.GenerateRandom.RandomNumberGenerate;

public class CoinTossMainApp {
	public static void main(String[] args) {
		System.out.println("Weclocme");
		try {
			Scanner sc = new Scanner(System.in);
			while (true) {
				System.out.println("Enter 1 to Toss Coin and other value to exit");
				int x = sc.nextInt();
				if (x == 1) {
					RandomNumberGenerate r = new RandomNumberGenerate();
					r.toString();
					int random = RandomNumberGenerate.getInt_random();
					if (CoinIsTest(random)) {
						System.out.println("Head");

					} else {
						System.out.println("Tail");
					}
				}

				else
					break;
			}
			sc.close();
			System.out.println("Exit");
		} catch (Exception e) {
			System.out.println("Some Exception occure ");
			System.out.println("Try again ! \n Exit");
		}
	}

	private static boolean CoinIsTest(int random) {
		if (random % 2 == 0)
			return true;
		return false;
	}
}
