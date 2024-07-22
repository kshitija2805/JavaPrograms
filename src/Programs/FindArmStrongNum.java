package Programs;

public class FindArmStrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isArmString(10);

	}

	private static void isArmString(int n) {
		// TODO Auto-generated method stub
		if (n <=-1) {
			System.out.println("Number is not an armstrong number");
		} else if (n <= 9 && n >= 0) {
			System.out.println("Number is an armstrong number");
		} else {
			int len = String.valueOf(n).length();
			System.out.println(len);
			int sum = 0;
			char a[] = String.valueOf(n).toCharArray();
			for (int i = 0; i < len; i++) {
				int j = 0;
				int sum1 = 1;
				while (j < len) {
					int k = Integer.parseInt(String.valueOf(a[i]));
					sum1 = k * sum1;
					System.out.println(sum1);
					j++;
				}

				sum = sum + sum1;

			}
			System.out.println(sum);
			if (0 == Integer.compare(sum, n)) {
				System.out.println("The number is armstrong");
			} else {
				System.out.println("The number is not an armstrong number");
			}
		}

	}

}
