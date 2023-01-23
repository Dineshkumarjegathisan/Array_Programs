package Arrays;
import java.util.Scanner;

public class DecimelAndBinary {

	public static void deciaml(double decNum) {
		if (decNum % 1 != 0) {
			System.out.println("Number is decimal :" + decNum);
		} else {
			System.out.println("Number is Not decimal :");
		}
	}

	public static void isBinary(int binNum) {
		if (binNum % 1 == 0) {
			System.out.println("Number is Binary :" + binNum);
		} else {
			System.out.println("Number is Not Binary :" + binNum);
		}
	}

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Decimel Number");
		double decNum = sc1.nextDouble();
		System.out.println("<><><><><><><><><><><><><><");
		System.out.println();
		System.out.println("Enter Binary Number");
		int binNum = sc1.nextInt();
		//double num = 129.0978863;
		//int n = 11111;
		  deciaml(decNum);
		  isBinary(binNum);
	}

}
