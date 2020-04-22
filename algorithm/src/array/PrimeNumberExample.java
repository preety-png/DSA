package array;
import java.util.Scanner;

public class PrimeNumberExample {
	

	static void checkPrime(int num) {
		int counter = 0;
		for (int i = 2; i < num; i++) {

			if (num % i == 0) {
				counter++;
			}

		}
		if (counter == 0) {
			System.out.println(num + " is prime no");
		}
		else 
			System.out.println(num + " is not prime no");
	}
	
	static void listAllPrime(int num) {
		System.out.println("prime number is ");
		int counter = 0;
		int total=0;
		for (int j = 2; j <= num; j++) {
			counter = 0;
			for (int i = 2; i < j; i++) {

				if (j % i == 0&&j!=i) {

					counter++;
                  break;
				}

			}
			if (counter == 0) {
				total++;
				System.out.println(j);
				
			}

		}
		System.out.println("total count of prime num is "+ total);

	}

	public static void main(String[] args) {
 		System.out.println("please enter the number");
    	Scanner sc = new Scanner(System.in);
    	int num1 = sc.nextInt();
		PrimeNumberExample.checkPrime(num1);
		System.out.println("please enter the number");
		int num2 = sc.nextInt();
		PrimeNumberExample.listAllPrime(num2);
	}
}