object Oddity_S {
  def main(args: Array[String]) {
    println(isOdd(2))
    println(isOdd(1))
    println(isOdd(0))
    println(isOdd(-1))
    println(isOdd(-2))
  }

  def isOdd(i: Int): Boolean = {
    i % 2 == 1
  }
}
