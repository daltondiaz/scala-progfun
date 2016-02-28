package progInScala.chapter3

object ProgrammingStyle {
  
  /* Programming Style
   * 
   * It's import for who came of imperative programming make transition to 
   * functional programming style, no only because of style, but you can
   * expand your horizon, became a better programming in general.After all, 
   * the aim its learning functional programming.
   *  
   */
  
  
  // Not programming Style
   def printArgs(args: Array[String]): Unit = {
    var i = 0
    while (i < args.length) {
      println(args(i))
      i += 1
    }
  }    
   
  // The code above can be:
  def printArgsPS(args: Array[String]): Unit = {
    for (arg <- args)
      println(arg)
  }
  
  // Can be better:
  def printArgsPSBetter(args: Array[String]): Unit = {
    args.foreach(println)
  }
  
  def main(args: Array[String]){
    printArgs(Array("1","2","3"))
    printArgsPS(Array("4","5","6"))
    printArgsPSBetter(Array("7","8","9"))
  }
}