
import java.util.*;
public class Fibonacci
{
	public static Void main(String[] args)
	{
		int n=10;
		System.out.println("using recursive function: ");
		for(int i=1;i<=n;i++)
		{
			int fibrecursive=fibonacciRecursive(i);
			System.out.println("fibonacci("+i+")="+fibrecursive);
		}
		System.out.println("\n using non-recursive function:");
		for(int i=1;i<=n;i++)
		{
			int fibNonRecursive=fibonacciNonRecursive(i);
			System.out.println("fibonacci(" +i+")="+fibNonRecursive);
		}
	}
}
	public static int fibonacciRecursive(int n)
	{
		if(n<=2)
		{
			return 1;
		}
		else
		{
			return fibonacciRecursive(n-1)+fibonacciRecursive(n-2);
		}
	}
	public static int fibonacciNonRecursive(int n)
	{
		if(n<=2)
		{
			return 1;
		}else{
			int fib1=1;
			int fib2=1;
			int fibN=0;
			
			for(int i=3;i<=n;i++)
			{
				fibN =fib1+fib2;
				fib1 =fib2;
				fib2 = fibN;
			}
			return fibN;
		}
	}

			
		