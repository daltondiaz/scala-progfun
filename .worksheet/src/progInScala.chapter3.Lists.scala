package progInScala.chapter3

object Lists {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(74); 
  println("Example of Lists");$skip(51); 
  
	/*
		Are immutable
	*/
	val oneTwo = List(1,2);System.out.println("""oneTwo  : List[Int] = """ + $show(oneTwo ));$skip(27); 
	val threeFour = List(3,4);System.out.println("""threeFour  : List[Int] = """ + $show(threeFour ));$skip(44); 
	val oneTwoThreeFour = oneTwo ::: threeFour;System.out.println("""oneTwoThreeFour  : List[Int] = """ + $show(oneTwoThreeFour ));$skip(67); 
	
	println(""+ oneTwo + " and "+ threeFour+ " were not mutated. ");$skip(107); 
                                                  
	println("Thus, "+ oneTwoThreeFour + " is a new list.");$skip(77); 
                                                
	
	val twoThree = List(2,3);System.out.println("""twoThree  : List[Int] = """ + $show(twoThree ));$skip(33); 
	val oneTwoThree = 1 :: twoThree;System.out.println("""oneTwoThree  : List[Int] = """ + $show(oneTwoThree ));$skip(22); 
	println(oneTwoThree);$skip(43); 
	
	val oneTwoThreeNil = 1 :: 2 :: 3 :: Nil;System.out.println("""oneTwoThreeNil  : List[Int] = """ + $show(oneTwoThreeNil ));$skip(26); 
  println(oneTwoThreeNil)}
}
