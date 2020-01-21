object O{
  def z[T,U](x: T)(y: U) = List[T | U](x, y)
  def m[T](x: T*) = x
  def main(x: Array[String]): Unit = {
    val li = List(1)
    val ls = List("A")
    m(z(li: _*)(ls: _*)(1) : _*)
  }
}
