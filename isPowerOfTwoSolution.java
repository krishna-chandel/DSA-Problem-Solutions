import java.util.Scanner;

class isPowerOfTwoSolution
{

  // Function to check if given number n is a power of two.
  public static boolean isPowerofTwo (long n)
  {
	if (n == 0)
	  return false;
	while (n != 1)
	  {
		if (n % 2 != 0)
		  return false;
		n = n / 2;
	  }
	return true;
  }
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	System.out.
	  println ("Enter the number to check if it's power of 2 or not: ");
	long num = sc.nextLong ();
	if (isPowerofTwo (num))
	  System.out.println ("YES");
	else
	  System.out.println ("NO");
  }
}
