import java.util.Scanner;
public class FibonacciGenerator {
	
	 static int fib(int n) 
	    { 
		 	if (n <= 1) 
	        return n; 
	        return fib(n-1) + fib(n-2); 
	    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int previousNumber = 1;
		int nextNumber = 1;
		Scanner console = new Scanner(System.in);
		System.out.println("Enter nth number: ");
		if(console.hasNextInt()) 
		{	
			int n = console.nextInt();
		    for (int i = 1; i <= n; ++i)
	        {
		    	System.out.print(previousNumber+" ");
	            int sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = sum;
	        }
		    System.out.println("\nThe "+n+"th value in the fibonacci sequence is "+fib(n));
		}
		else
		    {
			    System.out.println("Input is not a valid integer");
			}     
	} 	
}

