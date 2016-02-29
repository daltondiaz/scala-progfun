package coursera.fp.week2

object exercise {

	/*
		Tail Recursion
		
		+ If a function calls itself as its last
			action, the function’s stack frame can be reused. This is called tail recursion.

		+ Tail recursive functions are iterative processes.

		+ In general, if the last action of a function consists of calling a
			function (which may be the same), one stack frame would be
			sufficient for both functions. Such calls are called tail-calls.
	*/
	
	// Great Common Divisor using Euclid's algoirthm
	def gdc(a: Int, b: Int): Int =
		if(b == 0) a else gdc(b, a % b)   //> gdc: (a: Int, b: Int)Int
		
	gdc(14,21)                                //> res0: Int = 7
	
	
	def factorial(n: Int): Int =
		if(n == 0) 1 else n * factorial(n -1)
                                                  //> factorial: (n: Int)Int
		
	factorial(4)                              //> res1: Int = 24
	
	
	//  tail recursive version of factorial.
	def factorialTailRecursive(n: Int): Int = {
		def loop(acc: Int, n: Int): Int =
			if(n == 0) acc
			else loop(acc * n, n-1)
		loop(1,n)
	}                                         //> factorialTailRecursive: (n: Int)Int
	factorialTailRecursive(5)                 //> res2: Int = 120
}