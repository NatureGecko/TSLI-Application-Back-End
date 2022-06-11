package com.jingjok.tlsi.utilities;

import java.util.Random;

public class UniqueStringGenerationUtil {
	private static final int firstAscii = 48;
	private static final int lastAscii = 122;
	// The number 65 represents "A" and 122 for "z" ,
	// ignore 91 - 96 because they are not a letter.

	public static String generateUserUUID() {
		return generateString(15);
	}

	public static String generateDisplayName() {
		return "User-" + generateNumeric(6);
	}

	private static String generateString(int textLength) {
		Random randomString = new Random();
		StringBuilder buffer = new StringBuilder(textLength);

		for (int i = 0; i < textLength; i++) {
			int randomizedInt = firstAscii + (int) (randomString.nextFloat() * (lastAscii - firstAscii + 1));
			if ((randomizedInt >= 91 && randomizedInt <= 96) || (randomizedInt >= 58 && randomizedInt <= 64)) {
				randomizedInt = firstAscii;
			}
			buffer.append((char) randomizedInt);
		}
		return buffer.toString();
	}

	private static String generateNumeric(int numberLength) {
		Random generatedNumber = new Random();
		StringBuilder buffer = new StringBuilder(numberLength);

		for (int i = 0; i < numberLength; i++) {
			int randomizedInt = generatedNumber.nextInt(10);
			buffer.append(randomizedInt);
		}

		return buffer.toString();
	}

}
