package Programs;

import java.text.DecimalFormat;

public class PercentageOfCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		percentage("KshitijaRAKESHReva!!%#123");

	}

	public static void percentage(String s) {
		int length = s.length();
		int uppercase = 0;
		int lowercase = 0;
		int digits = 0;
		int spclChar = 0;
		for (int i = 0; i < length; i++) {
			char c = s.charAt(i);
			if (Character.isUpperCase(c)) {
				uppercase++;
			} else if (Character.isLowerCase(c)) {
				lowercase++;
			} else if (Character.isDigit(c)) {
				digits++;
			} else {
				spclChar++;
			}

		}
		
		DecimalFormat format = new DecimalFormat("####,####.##");
		System.out.println(uppercase);
		System.out.println(length);
		double uppercasePercent = (uppercase * 100) / length;
		System.out.println(format.format(uppercasePercent));
		double lowercasePercentage = (lowercase * 100) /length;
		System.out.println(format.format(lowercasePercentage));
		double digitsPercentage = (digits * 100) /length ;
		System.out.println(format.format(digitsPercentage));
		double specialCharPercentage = (spclChar * 100)/length ;
		System.out.println(format.format(specialCharPercentage));
	}

}
