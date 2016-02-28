package progInScala.chapter3

object SetsAndMaps {
  println("Example of sets and maps")             //> Example of sets and maps
  
  /*
  	Can be mutable and immutable, have subtraits for then use.
  	Default are immutable Set or Map, if you want their immutables its necessary import them.
  */
  var animals = Set("Dog","Cat")                  //> animals  : scala.collection.immutable.Set[String] = Set(Dog, Cat)
  animals += "Rat" // animals = animals + "Rat"
  println(animals.contains("Lion"))               //> false
  
  // If you want to use mutable Set its necessary import
  var movieSet = scala.collection.mutable.Set("Hitch","Poltergeist")
                                                  //> movieSet  : scala.collection.mutable.Set[String] = Set(Poltergeist, Hitch)

  movieSet += "Shrek"                             //> res0: scala.collection.mutable.Set[String] = Set(Poltergeist, Shrek, Hitch)
                                                  //| 
                                                  
  println(movieSet)                               //> Set(Poltergeist, Shrek, Hitch)
  
  val hashSet = scala.collection.immutable.HashSet("Tomatoes", "Chilies")
                                                  //> hashSet  : scala.collection.immutable.HashSet[String] = Set(Chilies, Tomatoe
                                                  //| s)
                                                
  println(hashSet + " Coriander")                 //> Set(Chilies, Tomatoes,  Coriander)
  println(hashSet)                                //> Set(Chilies, Tomatoes)
  
  
  //Maps
	// Remember mutable maps need to import
	val treasureMap = scala.collection.mutable.Map[Int,String]()
                                                  //> treasureMap  : scala.collection.mutable.Map[Int,String] = Map()
	
	treasureMap += (1 -> "Go to island.")     //> res1: progInScala.chapter3.SetsAndMaps.treasureMap.type = Map(1 -> Go to isl
                                                  //| and.)
	treasureMap += (2 -> "Find big X on ground.")
                                                  //> res2: progInScala.chapter3.SetsAndMaps.treasureMap.type = Map(2 -> Find big 
                                                  //| X on ground., 1 -> Go to island.)
	treasureMap += (3 -> "Dig.")              //> res3: progInScala.chapter3.SetsAndMaps.treasureMap.type = Map(2 -> Find big
                                                  //|  X on ground., 1 -> Go to island., 3 -> Dig.)
	println(treasureMap(2))                   //> Find big X on ground.
  
  
  val romanNumeral = Map(
  	1 -> "I", 2-> "II", 3 -> "III", 4 -> "IV", 5->"V"
  )                                               //> romanNumeral  : scala.collection.immutable.Map[Int,String] = Map(5 -> V, 1 
                                                  //| -> I, 2 -> II, 3 -> III, 4 -> IV)
  
  println(romanNumeral(3))                        //> III
  
}