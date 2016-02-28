package week1

object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(425); 

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
  };System.out.println("""sqrt: (x: Double)Double""");$skip(10); val res$0 = 
  sqrt(9);System.out.println("""res0: Double = """ + $show(res$0));$skip(14); val res$1 = 
  sqrt(1e-10);System.out.println("""res1: Double = """ + $show(res$1));$skip(13); val res$2 = 
  sqrt(1e60);System.out.println("""res2: Double = """ + $show(res$2));$skip(14); val res$3 = 
  sqrt(1e-60);System.out.println("""res3: Double = """ + $show(res$3));$skip(91); 
  
  // -----------------------------------
  
  // Example of brace blocks {}
  val x = 0;System.out.println("""x  : Int = """ + $show(x ));$skip(24); 
  def f(y: Int) = y + 1;System.out.println("""f: (y: Int)Int""");$skip(49); 
  val result = {
  	val x = f(3)
  	x * x
  }+ x;System.out.println("""result  : Int = """ + $show(result ));$skip(106); 
  
  //-------------------------------------------
  
  
  // Example for
  for(i <- 0 to 10)
  	print(i)}
  
	// --------------------------------------------------------------------------
  
}
