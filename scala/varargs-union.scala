object O{
  def z[T,U](x: T)(y: U) = List[T | U](x, y)
  def m[T](x: T*) = x
  def main(x: Array[String]): Unit = {
    val li = List(1)
    val ls = List("A")
    val lru = z(li: _*)(ls: _*)
    m(lru(0): _*)
  }
}
