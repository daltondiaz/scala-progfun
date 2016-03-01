package progInScala.chapter4

import scala.collection.mutable.Map

class ChecksumAccumulator {
  private var sum = 0
  def add(b: Byte): Unit = { sum += b }
  def checksum(): Int = ~(sum & 0xFF) + 1
}


/*
 * Singleton objects
 * 
 *  Defining a singleton object doesn't define a type 
 *  (at the Scala level of abstraction). Given just a 
 *  definition of object ChecksumAccumulator, 
 *  you can't make a variable of type ChecksumAccumulator. 
 *  Rather, the type named ChecksumAccumulator is defined 
 *  by the singleton object's companion class. However, 
 *  singleton objects extend a superclass and can mix in traits.
 *  Given each singleton object is an instance of 
 *  its superclasses and mixed-in traits, you can 
 *  invoke its methods via these types, refer to it 
 *  from variables of these types, and pass it to methods 
 *  expecting these types. 
 *  
 * */
object ChecksumAccumulator {
  private val cache = Map[String,Int]()
  
  def calculate(s: String): Int = 
    if (cache.contains(s))
      cache(s)
    else{
      val acc = new ChecksumAccumulator
      for(c <- s)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
      
}
