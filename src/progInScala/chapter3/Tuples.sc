package progInScala.chapter3


object Tuples {
  println("Example of tuples")
  /*
  	Are immutable
  	Tuples can contain different types of elements
  */
  
  def sumTwoNumbers(x: Double, y: Double) {
  	 x + y
  }
  
  println(sumTwoNumbers(1, 1))
  
  val pair = (99, " Example Strings", 'C', sumTwoNumbers(9, 1.1))
  
  println(pair._1)
  println(pair._2)
  println(pair._3) //Char
  println(pair._4) //function
  
}