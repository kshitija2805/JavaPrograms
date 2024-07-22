package JavaPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BasicProgarms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		leapYearVerification(100);
//		sumOfNaturalNumber(5);
//		findFactorial(0);
//		findCharacterisAlphabet('F');
//		multiplicationTable(2);
//		finonnaciSeries(10);
//		countNumberOfDigits(1234);
//		printABC();
//		reverseInteger(1234);
//		calculatePower(2,4);
//		numberPalindorem(1512);
//		numberIsPrime(15);
//		DispayFactor(10);
//		DisplayPrimeNumberBetweenTwoIntervals(1,100);
//		NumberIsArmStrongNumber(82081);
//	findIfNumberCanBeSumOftwoPrime(34);
//		System.out.println(printFirstLetterCapital("kshitija shivshnakar dad "));
//		reverseAString("kshitija shivshnakar dad");
//		replaceSpecialCharInString("###$$$% kshtija ___&&^^^ loves JAVA &&&&&");
//		int r[] = {-1,0,1,2,3,4,5,7};
//		findMissingNumber(r);
//		findTheLargestAndSmallestNumber(r);
//		String arr[] = {"abc","abc","pqr","abc"};
//		removeDuplicateElementsFromArray(arr);

	}

	private static void removeDuplicateElementsFromArray(String[] arr) {
		// TODO Auto-generated method stub
		Set<String> s = new HashSet<String>(Arrays.asList(arr));	
		System.out.println(s);
	}

	private static void findTheLargestAndSmallestNumber(int[] r) {
		// TODO Auto-generated method stub
		int smallest = r[0];
		int largest = r[0];
		for(int i = 1;i<r.length;i++)
		{
			if(smallest>r[i])
			{
				smallest = r[i];
			}
			else
			{
				largest = r[i];
			}
		}
		System.out.println(smallest);
		System.out.println(largest);
		
		
	}

	private static void findMissingNumber(int[] r) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 0;i<r.length;i++)
		{
			sum = sum + r[i];
		}
		System.out.println(sum);
		int sum1 = 0;
		for(int i = r[0];i<=r[r.length-1];i++)
		{
			sum1 = sum1 + i;
		}
		System.out.println(sum1);
		System.out.println("missing number is: "+(sum1-sum));
		
	}

	private static void replaceSpecialCharInString(String string) {
		// TODO Auto-generated method stub
		string = string.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(string);

	}

	private static void reverseAString(String string) {
		String reverse = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			reverse = reverse.concat(String.valueOf(string.charAt(i)));
		}
		System.out.println(reverse);

	}

	private static String printFirstLetterCapital(String string) {
		String result = "";
		if (string.isBlank()) {
			return string;
		} else if (string.equals(null)) {
			return string;
		}

		else {
			String[] a = string.split("\\s");
			for (String e : a) {
				String c = e.substring(0, 1).toUpperCase();
				result = result + c + e.substring(1) + " ";
				// System.out.println(result);

			}
		}

		return result.trim();

	}

	private static void findIfNumberCanBeSumOftwoPrime(int num) {
		// TODO Auto-generated method stub
		for (int i = 2; i < num / 2; i++) {
			if (isPrime(i)) {
				if (isPrime(num - i)) {
					System.out.println(num + ":" + i + "+" + (num - i));
				}
			}
		}

	}

	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		boolean flag = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;

	}

	private static void NumberIsArmStrongNumber(int num) {
		int count = 0;
		int result = 0;
		int act_num = num;

		while (num != 0) {
			num = num / 10;
			count++;
		}
		System.out.println(count);
		System.out.println(Math.pow(3, 3));
		num = act_num;
		while (num != 0) {
			int n = num % 10;
			result = (int) (result + Math.pow(n, count));
			num = num / 10;

		}
		System.out.println(result);
		if (act_num == result) {
			System.out.println("Its a armstrong number");
		} else {
			System.out.println("Number is not a armstrong number");
		}

	}

	private static void DisplayPrimeNumberBetweenTwoIntervals(int low, int high) {
		// TODO Auto-generated method stub
		int count = 0;
		while (low <= high) {
			boolean flag = true;
			for (int i = 2; i <= low / 2; i++) {
				if (low % i == 0) {
					flag = false;
					break;

				}

			}
			if (flag) {
				count++;
				System.out.println("Current low: " + low);
			}
			low++;

		}
		System.out.println("Total prime number: " + count);

	}

	private static void DispayFactor(int num) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}

	}

	private static void numberIsPrime(int num) {
		// TODO Auto-generated method stub
		boolean flag = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {

				flag = false;
				System.out.println("Number " + num + " is not a prime number");
				break;
			}
		}

		if (flag) {
			System.out.println("Number " + num + " is a prime number");
		}

	}

	private static void numberPalindorem(int num) {
		// TODO Auto-generated method stub
		int actnum = num;
		int reverse = 0;
		while (num != 0) {
			int n = num % 10;
			reverse = reverse * 10 + n;
			num = num / 10;

		}
		if (actnum == reverse) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not palindrome");
		}

	}

	private static void calculatePower(int base, int exponent) {
		// TODO Auto-generated method stub
		int result = 1;
		while (exponent != 0) {
			result = result * base;
			exponent--;
		}
		System.out.println(result);

	}

	private static void reverseInteger(int num) {
		// TODO Auto-generated method stub
		int rev = 0;
		while (num != 0) {
			int n = num % 10;
			rev = rev * 10 + n;
			num = num / 10;
		}

	}

	private static void printABC() {
		// TODO Auto-generated method stub
		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.println(c);
		}

	}

	private static void countNumberOfDigits(int num) {
		// TODO Auto-generated method stub
		int count = 0;
		while (num != 0) {
			num = num / 10; // 123 12 1
			count++;
		}
		System.out.println("Total number of digits : " + count);

	}

	private static void finonnaciSeries(int i) {
		// TODO Auto-generated method stub
		int t1 = 0;
		int t2 = 1;
		int sum = 0;

		for (int j = 1; j < 10; j++) {
			System.out.println(t1);
			sum = t1 + t2;
			t1 = t2;
			t2 = sum;

		}

	}

	private static void multiplicationTable(int i) {
		// TODO Auto-generated method stub

		for (int j = 1; j <= 10; j++) {
			System.out.println(i + "x" + j + " = " + (i * j));
		}

	}

	private static void findCharacterisAlphabet(char c) {
		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
			System.out.println("Given letter " + c + " is alphabet");
		} else {
			System.out.println("Its not an alphabet");
		}

	}

	private static void findFactorial(int i) {
		// TODO Auto-generated method stub
		int factorial = 1;
		for (int j = i; i >= 1; i--) {
			factorial = factorial * i;
		}
		System.out.println("The factorial is: " + factorial);

	}

	private static void sumOfNaturalNumber(int i) {
		// TODO Auto-generated method stub
		int k = 1;
		int sum = 0;
		while (k <= i) {
			sum = sum + k;
			k++;

		}
		System.out.println(sum);

	}

	private static void leapYearVerification(int year) {

		if (year % 4 == 0 && year % 400 == 0) {
			System.out.println("Its a leap year century");
		}

		else if (year % 4 == 0) {
			System.out.println("Its s leap year");
		}

		else {
			System.out.println(" The entered number is not a leap year");
		}

	}

}
