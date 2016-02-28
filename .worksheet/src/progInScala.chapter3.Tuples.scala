package progInScala.chapter3


object Tuples {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(77); 
  println("Example of tuples");$skip(138); 
  /*
  	Are immutable
  	Tuples can contain different types of elements
  */
  
  def sumTwoNumbers(x: Double, y: Double) {
  	 x + y
  };System.out.println("""sumTwoNumbers: (x: Double, y: Double)Unit""");$skip(34); 
  
  println(sumTwoNumbers(1, 1));$skip(69); 
  
  val pair = (99, " Example Strings", 'C', sumTwoNumbers(9, 1.1));System.out.println("""pair  : (Int, String, Char, Unit) = """ + $show(pair ));$skip(22); 
  
  println(pair._1);$skip(19); 
  println(pair._2);$skip(26); 
  println(pair._3);$skip(30);  //Char
  println(pair._4) //function}
  
}
