package progInScala.chapter4

import ChecksumAccumulator.calculate

// Application was deleted in scala 2.11, instead use App

object FallWinterSpringSummer extends App {
  
  for(season <- List("fall","winter","spring"))
    println(season + ": " + calculate(season))
    
}