package Test.Testing;



	import java.util.Scanner;

	public class PrimeNumberCheck {
	  
		 static boolean isprime(int n){
			 
			 for(int i=2;i<n;i++) {
				 if (n%i==0)
				 return false;
			 }
			return true;
		}
		 public static void main(String[] args) {
			int N=20;
			for(int i=0;i<=N;i++) {
				if (isprime(i)) {
					System.out.println(i);
				}
			}
		}
	}


	
	

	