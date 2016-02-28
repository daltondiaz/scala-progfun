package progInScala.chapter3

object Lists {
  println("Example of Lists")                     //> Example of Lists
  
	/*
		Are immutable
	*/
	val oneTwo = List(1,2)                    //> oneTwo  : List[Int] = List(1, 2)
	val threeFour = List(3,4)                 //> threeFour  : List[Int] = List(3, 4)
	val oneTwoThreeFour = oneTwo ::: threeFour//> oneTwoThreeFour  : List[Int] = List(1, 2, 3, 4)
	
	println(""+ oneTwo + " and "+ threeFour+ " were not mutated. ")
                                                  //> List(1, 2) and List(3, 4) were not mutated. 
                                                  
	println("Thus, "+ oneTwoThreeFour + " is a new list.")
                                                  //> Thus, List(1, 2, 3, 4) is a new list.
                                                
	
	val twoThree = List(2,3)                  //> twoThree  : List[Int] = List(2, 3)
	val oneTwoThree = 1 :: twoThree           //> oneTwoThree  : List[Int] = List(1, 2, 3)
	println(oneTwoThree)                      //> List(1, 2, 3)
	
	val oneTwoThreeNil = 1 :: 2 :: 3 :: Nil   //> oneTwoThreeNil  : List[Int] = List(1, 2, 3)
  println(oneTwoThreeNil)                         //> List(1, 2, 3)
}