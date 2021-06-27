package defensiveProgramming;

//****************************************************************
//MathUtils.java
//
//Provides static mathematical utility functions.
//
//****************************************************************
public class MathUtils{
	/* body */
	
	//-------------------------------------------------------------
	// Returns the factorial of the argument given
	//-------------------------------------------------------------
	public static int factorial(int n) throws IllegalArgumentException {
		if (n < 0)
			throw new IllegalArgumentException("Can not input negative value"); 
		else if (n > 16)
			throw new IllegalArgumentException("Arithmetic Overflow");
		int fac = 1;
		for (int i=n; i>0; i--)
			fac *= i;
		return fac;
	}
}
