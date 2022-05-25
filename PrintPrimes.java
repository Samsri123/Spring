import java.util.Scanner;

class PrintPrimes {
    public static void main(String[] args) {
  	Scanner s =  new Scanner(System.in);
	System.out.println("enter starting number");
	int n1 = s.nextInt();
	System.out.println("enter ending number")'
	int n2 = s.nextInt();
	System.out.println("Primes numbers from " + n1 + " to " + n2 + " are:");
	for (int i = n1; i <= n2; i++) {
	   int count = 0;
		for (int j = 1; j <= n1; j++) {
		   if ( n1 % j == 0)
                       count++;
		}
	   if (count ==2)
              System.out.print(i+" ");
	}
    }
}
