import java.util.Scanner;
/*Kasey Alusi
 * Prepared for Howard Abrams from WorkDay
 */

public class PrimeTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter an integer:");
		System.out.println(is_prime(scan.nextInt()));
		test_is_prime(2);
		test_is_prime(7);
		test_is_prime(6);
		test_is_prime(9);
		System.out.println(sum_primes());
	}
	
	/*Checks to see if an integer is a prime number or not.
	 * Takes an integer (input) and returns true if it is prime
	 * and false if it is not*/
	public static boolean is_prime(int input){
		//check if input is even. all even numbers after 2 are non-prime
		if((input!=2 && input%2==0) || input==1)
			return false;
		/*Only odd numbers need to be checked. Once it has checked up to
		 * the square root of input, it can stop because numbers over
		 * the sqRt would be checked previously */
		for(int i =3; i*i<=input; i+=2){
			if(input%i==0)
				return false;
		}
		return true;
	}
	
	public static void test_is_prime(int input){
		System.out.println("Is " + input + " a prime number? " + is_prime(input));
	}
	
	public static long sum_primes(){
		//skip 2 (the edge case)
		long sum = 2;
		//check odd numbers up to 2,000,000
		//if it is prime, it is added to the sum
		for(int i =3; i<=2000000; i+=2){
			if(is_prime(i))
				sum += i;
		}
		
		return sum;
	}
}
