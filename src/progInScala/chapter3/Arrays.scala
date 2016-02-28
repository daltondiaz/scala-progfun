package progInScala.chapter3

object Arrays {
  // Example of Arrays
  /*
  	Are mutable
  */
  val greetStrings = new Array[String](3)
  
  greetStrings.update(0, "Hello")
  greetStrings.update(1, ", ")
  greetStrings.update(2, "world")
	
	def main(args: Array[String]){
	  for (i <- 0 to 2)
      print(greetStrings(i))                      
	
    println()
    
  	for(i <- 0.to(2))
  		print(greetStrings.apply(i)) 
	}
}