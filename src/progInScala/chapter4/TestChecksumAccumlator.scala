package progInScala.chapter4

object TestChecksumAccumlator{
  
  def main(args: Array[String]){
    val x = new ChecksumAccumulator
    x.add(10)
    x.checksum()
  }
}