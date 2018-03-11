package utils;

import java.util.Random;

public class RandomUtils {

	private static final String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public static String randomString(int length) {
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < length) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();
		return saltStr;
	}
}