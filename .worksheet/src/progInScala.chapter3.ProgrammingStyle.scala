package progInScala.chapter3

object ProgrammingStyle {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(99); 
  println("Welcome to the Scala worksheet");$skip(168); 
  
  // Not programming Style
   def printArgs(args: Array[String]): Unit = {
    var i = 0
    while (i < args.length) {
      println(args(i))
      i += 1
    }
  };System.out.println("""printArgs: (args: Array[String])Unit""")}
  
  
}
