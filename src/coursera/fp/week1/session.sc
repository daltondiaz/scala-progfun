package week1

object session {

// Square roots with Newton's method
  def sqrt(x: Double) = {

    def abs(x: Double) = if (x < 0) -x else x

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double) =
      abs(guess * guess - x) / x < 0.001

    def improve(guess: Double) =
      (guess + x / guess) / 2

    sqrtIter(1.0)
  }                                               //> sqrt: (x: Double)Double
  sqrt(9)                                         //> res0: Double = 3.00009155413138
  sqrt(1e-10)                                     //> res1: Double = 1.0000558643074985E-5
  sqrt(1e60)                                      //> res2: Double = 1.0000788456669446E30
  sqrt(1e-60)                                     //> res3: Double = 1.0000788456669447E-30
  
  // -----------------------------------
  
  // Example of brace blocks {}
  val x = 0                                       //> x  : Int = 0
  def f(y: Int) = y + 1                           //> f: (y: Int)Int
  val result = {
  	val x = f(3)
  	x * x
  }+ x                                            //> result  : Int = 16
  
  //-------------------------------------------
  
  
  // Example for
  for(i <- 0 to 10)
  	print(i)
  
	// --------------------------------------------------------------------------
  
}