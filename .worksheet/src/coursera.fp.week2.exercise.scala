package coursera.fp.week2

object exercise {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(575); 

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
		if(b == 0) a else gdc(b, a % b);System.out.println("""gdc: (a: Int, b: Int)Int""");$skip(15); val res$0 = 
		
	gdc(14,21);System.out.println("""res0: Int = """ + $show(res$0));$skip(74); 
	
	
	def factorial(n: Int): Int =
		if(n == 0) 1 else n * factorial(n -1);System.out.println("""factorial: (n: Int)Int""");$skip(17); val res$1 = 
		
	factorial(4);System.out.println("""res1: Int = """ + $show(res$1));$skip(187); 
	
	
	//  tail recursive version of factorial.
	def factorialTailRecursive(n: Int): Int = {
		def loop(acc: Int, n: Int): Int =
			if(n == 0) acc
			else loop(acc * n, n-1)
		loop(1,n)
	};System.out.println("""factorialTailRecursive: (n: Int)Int""");$skip(27); val res$2 = 
	factorialTailRecursive(5);System.out.println("""res2: Int = """ + $show(res$2))}
}
