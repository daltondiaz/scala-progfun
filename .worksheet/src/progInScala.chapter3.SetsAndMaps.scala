package progInScala.chapter3

object SetsAndMaps {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(88); 
  println("Example of sets and maps");$skip(201); 
  
  /*
  	Can be mutable and immutable, have subtraits for then use.
  	Default are immutable Set or Map, if you want their immutables its necessary import them.
  */
  var animals = Set("Dog","Cat");System.out.println("""animals  : scala.collection.immutable.Set[String] = """ + $show(animals ));$skip(48); 
  animals += "Rat";$skip(36);  // animals = animals + "Rat"
  println(animals.contains("Lion"));$skip(129); 
  
  // If you want to use mutable Set its necessary import
  var movieSet = scala.collection.mutable.Set("Hitch","Poltergeist");System.out.println("""movieSet  : scala.collection.mutable.Set[String] = """ + $show(movieSet ));$skip(23); val res$0 = 

  movieSet += "Shrek";System.out.println("""res0: scala.collection.mutable.Set[String] = """ + $show(res$0));$skip(71); 
                                                  
  println(movieSet);$skip(77); 
  
  val hashSet = scala.collection.immutable.HashSet("Tomatoes", "Chilies");System.out.println("""hashSet  : scala.collection.immutable.HashSet[String] = """ + $show(hashSet ));$skip(83); 
                                                
  println(hashSet + " Coriander");$skip(19); 
  println(hashSet);$skip(118); 
  
  
  //Maps
	// Remember mutable maps need to import
	val treasureMap = scala.collection.mutable.Map[Int,String]();System.out.println("""treasureMap  : scala.collection.mutable.Map[Int,String] = """ + $show(treasureMap ));$skip(41); val res$1 = 
	
	treasureMap += (1 -> "Go to island.");System.out.println("""res1: progInScala.chapter3.SetsAndMaps.treasureMap.type = """ + $show(res$1));$skip(47); val res$2 = 
	treasureMap += (2 -> "Find big X on ground.");System.out.println("""res2: progInScala.chapter3.SetsAndMaps.treasureMap.type = """ + $show(res$2));$skip(30); val res$3 = 
	treasureMap += (3 -> "Dig.");System.out.println("""res3: progInScala.chapter3.SetsAndMaps.treasureMap.type = """ + $show(res$3));$skip(25); 
	println(treasureMap(2));$skip(89); 
  
  
  val romanNumeral = Map(
  	1 -> "I", 2-> "II", 3 -> "III", 4 -> "IV", 5->"V"
  );System.out.println("""romanNumeral  : scala.collection.immutable.Map[Int,String] = """ + $show(romanNumeral ));$skip(30); 
  
  println(romanNumeral(3))}
  
}
